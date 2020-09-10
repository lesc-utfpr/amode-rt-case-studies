#ifndef StorageCompartment_h
#define StorageCompartment_h

#include <iostream>
#include <stdlib.h>
#include <stddef.h>
#include "ros/ros.h"

//#include "ItemReader.h"
#include "ProductPart.h"
//#include "RobotArmPosition.h"
#include "uml_to_ros/RFIDReader_RFIDReader_Value.h"
#include "uml_to_ros/StorageCompartment_StorageCompartment_getProductParts.h"
#include "uml_to_ros/StorageCompartment_StorageCompartment_setProductParts.h"
#include "uml_to_ros/StorageCompartment_StorageCompartment_getActualLoad.h"

#define MAX_PARTS 100

class StorageCompartment {
protected:
//     ItemReader* LoadDetector;
     int MaxCapacity;
     int PartsCount;
//     RobotArmPosition* ArmPosition;
     bool Empty;
     ProductPart* ProductParts[MAX_PARTS];
    
      // added due to topic subscription
      int RFIDReader_LoadDetector_Value;
public:
      // added due to topic subscription
      ros::Subscriber sub_RFIDReader_LoadDetector;
      void topic_RFIDReader_LoadDetector_call_back(const
                        uml_to_ros::RFIDReader_RFIDReader_Value::ConstPtr& msg);
      
      virtual   ProductPart*  getProductParts(    int index   );
      virtual   void  setProductParts(    int index  ,  ProductPart* _ProductParts   );
      virtual   int  getActualLoad(  );
      virtual   void  run(  );
      StorageCompartment(  );
      ~StorageCompartment(  );
};

static StorageCompartment obj_StorageCompartment;

void StorageCompartment::topic_RFIDReader_LoadDetector_call_back(const
                        uml_to_ros::RFIDReader_RFIDReader_Value::ConstPtr& msg) {
    RFIDReader_LoadDetector_Value = msg->Value;
    ROS_INFO("NEW -- RFIDReader.Value = %d", RFIDReader_LoadDetector_Value);
}


bool srv_StorageCompartment_setProductParts(  uml_to_ros::StorageCompartment_StorageCompartment_setProductParts::Request  &req,
                                uml_to_ros::StorageCompartment_StorageCompartment_setProductParts::Response &res) {
    
    ROS_INFO("Service call: StorageCompartment.setProductParts(%d, %d)", req.index, req.ID);
    ProductPart pp;
    pp.setID( req.ID );
    obj_StorageCompartment.setProductParts( req.index, &pp );
    res.ret = req.ID;
    
    return true;
}

bool srv_StorageCompartment_getProductParts(  uml_to_ros::StorageCompartment_StorageCompartment_getProductParts::Request  &req,
                                uml_to_ros::StorageCompartment_StorageCompartment_getProductParts::Response &res) {
    
    ROS_INFO("Service call: StorageCompartment.getProductParts(%d)", req.index );
    ProductPart *pp = obj_StorageCompartment.getProductParts( req.index );
    if ( pp != NULL)
        res.ret = pp->getID();
    else
        res.ret = -1;
    
    return true;
}

bool srv_StorageCompartment_getActualLoad(  uml_to_ros::StorageCompartment_StorageCompartment_getActualLoad::Request  &req,
                                uml_to_ros::StorageCompartment_StorageCompartment_getActualLoad::Response &res) {
    
    ROS_INFO("Service call: StorageCompartment.getActualLoad()");
    res.ret = obj_StorageCompartment.getActualLoad();
    
    return true;
}

#endif
