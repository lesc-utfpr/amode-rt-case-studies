#ifndef StorageUnit_h
#define StorageUnit_h

#include <iostream>
#include <stdlib.h>
#include <stddef.h>
#include "ros/ros.h"

//#include "StorageCompartment.h"
#include "ProductPart.h"
//#include "RobotArmPosition.h"
#include "uml_to_ros/StorageUnit_StorageUnit_getPosition.h"
#include "uml_to_ros/StorageCompartment_StorageCompartment_getActualLoad.h"
#include "uml_to_ros/StorageCompartment_StorageCompartment_getProductParts.h"

class StorageUnit {
protected:
//     StorageCompartment* Compartments[4];

public:
//      virtual   RobotArmPosition*  getPosition(    ProductPart* part   );
      virtual   int  getPosition(    ProductPart* part   );
      StorageUnit(  );
      ~StorageUnit(  );
};

static StorageUnit obj_StorageUnit;

bool srv_StorageUnit_getPosition(  uml_to_ros::StorageUnit_StorageUnit_getPosition::Request  &req,
                                   uml_to_ros::StorageUnit_StorageUnit_getPosition::Response &res) {
    
    ROS_INFO("Service call: StorageUnit.getPosition(%d)", req.ID);
    ProductPart pp;
    pp.setID(req.ID);
    res.ret = obj_StorageUnit.getPosition(&pp);
    
    return true;
}

#endif
