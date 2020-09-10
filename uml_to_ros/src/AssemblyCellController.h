#ifndef AssemblyCellController_h
#define AssemblyCellController_h

#include <iostream>
#include <stdlib.h>
#include <stddef.h>
#include "ros/ros.h"

//#include "RobotArm.h"
//#include "Conveyor.h"
//#include "StorageUnit.h"

#include "Product.h"
#include "uml_to_ros/AssemblyCellController_AssemblyCellController_ProductsCount.h"
#include "uml_to_ros/AssemblyCellController_AssemblyCellController_addProduct.h"
#include "uml_to_ros/AssemblyCellController_AssemblyCellController_getProductsToAssembly.h"
#include "uml_to_ros/AssemblyCellController_AssemblyCellController_setProductsToAssembly.h"
#include "uml_to_ros/Conveyor_Conveyor_isItemDetected.h"
#include "uml_to_ros/Conveyor_Conveyor_getItem.h"
#include "uml_to_ros/Conveyor_Conveyor_getPosition.h"
#include "uml_to_ros/RobotArm_RobotArm_openGripper.h"
#include "uml_to_ros/RobotArm_RobotArm_closeGripper.h"
#include "uml_to_ros/RobotArm_RobotArm_moveTo.h"
#include "uml_to_ros/StorageUnit_StorageUnit_getPosition.h"

#define MAX_PRODUCTS 50

class AssemblyCellController {
protected:
    
//     RobotArm* __RobotArm;
//     Conveyor* ProductsIn;
//     Conveyor* MixedPartsOut;
//     StorageUnit* __StorageUnit;
     Product* ProductsToAssembly[MAX_PRODUCTS];
     int ProductsCount;

     virtual   bool  hasProductsToBuild(  );
public:
     ros::Publisher pub_ProductsCount;
    
      virtual   void  run(  );
      virtual   void  addProduct(    Product* p   );
      virtual   int  getProductsCount(  );
      
//      virtual   RobotArm*  getRobotArm(  );
//      virtual   void  setRobotArm(    RobotArm* _RobotArm   );
//      virtual   Conveyor*  getProductsIn(  );
//      virtual   void  setProductsIn(    Conveyor* _ProductsIn   );
//      virtual   Conveyor*  getMixedPartsOut(  );
//      virtual   void  setMixedPartsOut(    Conveyor* _MixedPartsOut   );
      virtual   Product*  getProductsToAssembly(    int index   );
      virtual   void  setProductsToAssembly(    int index  ,  Product* _ProductsToAssembly   );
//      virtual   StorageUnit*  getStorageUnit(  );
//      virtual   void  setStorageUnit(    StorageUnit* _StorageUnit   );

    
    
//      AssemblyCellController(    RobotArm* _RobotArm  ,  Conveyor* _ProductsIn  ,  Conveyor* _MixedPartsOut  ,  StorageUnit* _StorageUnit   );
      AssemblyCellController();
      ~AssemblyCellController(  );
};


static AssemblyCellController obj_AssemblyCellController;


bool srv_AssemblyCellController_addProduct(  uml_to_ros::AssemblyCellController_AssemblyCellController_addProduct::Request  &req,
                                uml_to_ros::AssemblyCellController_AssemblyCellController_addProduct::Response &res) {
    
    Product *p = new Product( NULL );
    p->setID(req.ID);
    obj_AssemblyCellController.addProduct( p );
    res.ret = 0;
    ROS_INFO("Service call: AssemblyCellController.addProduct(%d)", p->getID());
    delete p;
    
    return true;
}

bool srv_AssemblyCellController_getProductsToAssembly(  uml_to_ros::AssemblyCellController_AssemblyCellController_getProductsToAssembly::Request  &req,
                                uml_to_ros::AssemblyCellController_AssemblyCellController_getProductsToAssembly::Response &res) {
    
    Product *p = obj_AssemblyCellController.getProductsToAssembly( req.index );
    res.ret = p->getID();
    ROS_INFO("Service call: AssemblyCellController.getProductsToAssembly(%d) => %d", req.index, res.ret);
    
    return true;
}

bool srv_AssemblyCellController_setProductsToAssembly(  uml_to_ros::AssemblyCellController_AssemblyCellController_setProductsToAssembly::Request  &req,
                                uml_to_ros::AssemblyCellController_AssemblyCellController_setProductsToAssembly::Response &res) {
    
    Product *p = new Product( NULL );
    p->setID(req.ID);
    obj_AssemblyCellController.setProductsToAssembly( req.index, p );
    res.ret = 0;
    ROS_INFO("Service call: AssemblyCellController.setProductsToAssembly(%d, %d)", req.index, p->getID());
    delete p;
    
    return true;
}



#endif
