

 #include "AssemblyCellController.h" 


//      AssemblyCellController::AssemblyCellController(    RobotArm* _RobotArm  ,  Conveyor* _ProductsIn  ,  Conveyor* _MixedPartsOut  ,  StorageUnit* _StorageUnit   ) { 
        AssemblyCellController::AssemblyCellController( ) {
//     // Variables
//     
//     // Actions
//               __RobotArm = _RobotArm;
//               ProductsIn = _ProductsIn;
//               MixedPartsOut = _MixedPartsOut;
//               __StorageUnit = _StorageUnit;
//               // TimingAttributes.SetTimingAttributes     
//               // PeriodicTiming.SetPeriod
            ProductsCount = 0;
        }
//      RobotArm*  AssemblyCellController::getRobotArm(  ) { 
//     // Variables
//     
//     // Actions
//          return  __RobotArm ;     
//     }
//      void  AssemblyCellController::setRobotArm(    RobotArm* _RobotArm   ) { 
//     // Variables
//     
//     // Actions
//          __RobotArm = _RobotArm;     
//     }
//      Conveyor*  AssemblyCellController::getProductsIn(  ) { 
//     // Variables
//     
//     // Actions
//          return  ProductsIn ;     
//     }
//      void  AssemblyCellController::setProductsIn(    Conveyor* _ProductsIn   ) { 
//     // Variables
//     
//     // Actions
//          ProductsIn = _ProductsIn;     
//     }
//      Conveyor*  AssemblyCellController::getMixedPartsOut(  ) { 
//     // Variables
//     
//     // Actions
//          return  MixedPartsOut ;     
//     }
//      void  AssemblyCellController::setMixedPartsOut(    Conveyor* _MixedPartsOut   ) { 
//     // Variables
//     
//     // Actions
//          MixedPartsOut = _MixedPartsOut;     
//     }
      Product*  AssemblyCellController::getProductsToAssembly(    int index   ) { 
     // Variables
     
     // Actions
          if ( (index >= 0) && (index < MAX_PRODUCTS)) {
              return ProductsToAssembly[index];
          }
          else {
              return NULL;
          }
     }
      void  AssemblyCellController::setProductsToAssembly(    int index  ,  Product* _ProductsToAssembly   ) { 
     // Variables
     
     // Actions
          if ( (index >= 0) && (index < MAX_PRODUCTS)) {
              if ( ProductsToAssembly[index] == NULL ) {
                  ProductsToAssembly[index] = new Product( NULL );
                  ProductsCount = ProductsCount + 1;
                  
                  uml_to_ros::AssemblyCellController_AssemblyCellController_ProductsCount msg;
                  msg.ProductsCount = ProductsCount;
                  pub_ProductsCount.publish(msg);
                  
                  ROS_INFO("AssemblyCellController - NEW Product");
              }
              *ProductsToAssembly[index] = *_ProductsToAssembly;
              ROS_INFO("AssemblyCellController - Product[%d] = %d", index, ProductsToAssembly[index]->getID() );
          }
          else {
              ROS_ERROR("Index out-of-range AssemblyCellController::setProductsToAssembly(%d)", index);
          }
          
     }
//      StorageUnit*  AssemblyCellController::getStorageUnit(  ) { 
//     // Variables
//     
//     // Actions
//          return __StorageUnit ;     
//     }
//      void  AssemblyCellController::setStorageUnit(    StorageUnit* _StorageUnit   ) { 
//     // Variables
//     
//     // Actions
//          __StorageUnit = _StorageUnit;     
//     }
      bool  AssemblyCellController::hasProductsToBuild(  ) { 
     // Variables
     
     // Actions
          return  ProductsCount > 0 ;     
     }
      void  AssemblyCellController::run(  ) { 

        // Variables
            Recipe* recipe;
            ProductPart* part;
            int pos; // RobotArmPosition* pos;
            int i;     
            Item* item;
        // Actions
            ROS_INFO("AssemblyCellController - init");
            ros::Rate loop_rate(0.5); // 5s period
            while (ros::ok()) {
                ROS_INFO("AssemblyCellController - loop - init");
                // TaskMigration.Migrate
                
                // ROS service call 
                uml_to_ros::Conveyor_Conveyor_isItemDetected srv_MixedPartsOut_isItemDetected;
                if ( ros::service::call("Conveyor_Conveyor_isItemDetected", srv_MixedPartsOut_isItemDetected) ) {
                    ROS_INFO("Service call to srv_MixedPartsOut_isItemDetected successfull!");
                }
                else {
                    ROS_ERROR("Failed to call service srv_MixedPartsOut_isItemDetected.");
                }
                
                if ( (hasProductsToBuild() == true) && (srv_MixedPartsOut_isItemDetected.response.ret == true) ) { 
                     recipe =  ProductsToAssembly[0]->getRecipe();
                     i = 0;
                     while (i < recipe->getPartsCount())  { 
                          part =  recipe->getPart(i);
                          
                          // ROS service call 
                          uml_to_ros::Conveyor_Conveyor_isItemDetected srv_ProductsIn_isItemDetected;
                          if ( ros::service::call("Conveyor_Conveyor_isItemDetected", srv_ProductsIn_isItemDetected) ) {
                              ROS_INFO("Service call to srv_ProductsIn_isItemDetected successfull!");
                          }
                          else {
                              ROS_ERROR("Failed to call srv_ProductsIn_isItemDetected.");
                          }
                         
                          // ROS service call 
                          uml_to_ros::Conveyor_Conveyor_getItem srv_ProductsIn_getItem;
                          if ( ros::service::call("Conveyor_Conveyor_getItem", srv_ProductsIn_getItem) ) {
                              ROS_INFO("Service call to srv_ProductsIn_getItem successfull!");
                          }
                          else {
                              ROS_ERROR("Failed to call srv_ProductsIn_getItem.");
                          }
                              
                          if ( (srv_ProductsIn_isItemDetected.response.ret == true) && (part->getID() == srv_ProductsIn_getItem.response.ret) ) { 
                              
//                               pos =  ProductsIn->getPosition(); // ** REMOTE **
                              // ROS service call 
                              uml_to_ros::Conveyor_Conveyor_getPosition srv_ProductsIn_getPosition;
                              if ( ros::service::call("Conveyor_Conveyor_getPosition", srv_ProductsIn_getPosition) ) {
                                  ROS_INFO("Service call to srv_ProductsIn_getPosition successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_ProductsIn_getPosition.");
                              }
                              pos = srv_ProductsIn_getPosition.response.ret;
                              
//                               __RobotArm->openGripper();
                              // ROS service call 
                              uml_to_ros::RobotArm_RobotArm_openGripper srv_RobotArm_openGripper;
                              if ( ros::service::call("RobotArm_RobotArm_openGripper", srv_RobotArm_openGripper) ) {
                                  ROS_INFO("Service call to srv_RobotArm_openGripper successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_RobotArm_openGripper.");
                              }
                              
//                               __RobotArm->moveTo(pos);
                              uml_to_ros::RobotArm_RobotArm_moveTo srv_RobotArm_moveTo;
                              srv_RobotArm_moveTo.request.ArmPosition = pos;
                              srv_RobotArm_moveTo.request.ShoulderPosition = pos / 33;
                              srv_RobotArm_moveTo.request.RotaryShoulderPosition = pos / 15;
                              srv_RobotArm_moveTo.request.WristPosition = pos * 7;
                              if ( ros::service::call("RobotArm_RobotArm_moveTo", srv_RobotArm_moveTo) ) {
                                  ROS_INFO("Service call to srv_RobotArm_moveTo successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_RobotArm_moveTo.");
                              }
                              
//                               __RobotArm->closeGripper();
                              uml_to_ros::RobotArm_RobotArm_closeGripper srv_RobotArm_closeGripper;
                              if ( ros::service::call("RobotArm_RobotArm_closeGripper", srv_RobotArm_closeGripper) ) {
                                  ROS_INFO("Service call to srv_RobotArm_closeGripper successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_RobotArm_closeGripper.");
                              }
                              
//                               pos =  MixedPartsOut->getPosition(); // ** REMOTE **
                              // ROS service call 
                              uml_to_ros::Conveyor_Conveyor_getPosition srv_MixedPartsOut_getPosition;
                              if ( ros::service::call("Conveyor_Conveyor_getPosition", srv_MixedPartsOut_getPosition) ) {
                                  ROS_INFO("Service call to srv_MixedPartsOut_getPosition successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_MixedPartsOut_getPosition.");
                              }
                              pos = srv_MixedPartsOut_getPosition.response.ret;
                              
//                               __RobotArm->moveTo(pos);
                              srv_RobotArm_moveTo.request.ArmPosition = pos;
                              srv_RobotArm_moveTo.request.ShoulderPosition = pos / 33;
                              srv_RobotArm_moveTo.request.RotaryShoulderPosition = pos / 15;
                              srv_RobotArm_moveTo.request.WristPosition = pos * 7;
                              if ( ros::service::call("RobotArm_RobotArm_moveTo", srv_RobotArm_moveTo) ) {
                                  ROS_INFO("Service call to srv_RobotArm_moveTo successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_RobotArm_moveTo.");
                              }

//                               __RobotArm->openGripper();
                              // ROS service call 
                              if ( ros::service::call("RobotArm_RobotArm_openGripper", srv_RobotArm_openGripper) ) {
                                  ROS_INFO("Service call to srv_RobotArm_openGripper successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_RobotArm_openGripper.");
                              }
                          }  else { 
//                               pos =  __StorageUnit->getPosition(part); // ** REMOTE **
                              // ROS service call 
                              uml_to_ros::StorageUnit_StorageUnit_getPosition srv_StorageUnit_getPosition;
                              srv_StorageUnit_getPosition.request.ID = part->getID();
                              if ( ros::service::call("StorageUnit_StorageUnit_getPosition", srv_StorageUnit_getPosition) ) {
                                  ROS_INFO("Service call to srv_StorageUnit_getPosition successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_StorageUnit_getPosition.");
                              }
                              pos = srv_StorageUnit_getPosition.response.ret;
                              
//                               __RobotArm->openGripper();
                              // ROS service call 
                              uml_to_ros::RobotArm_RobotArm_openGripper srv_RobotArm_openGripper;
                              if ( ros::service::call("RobotArm_RobotArm_openGripper", srv_RobotArm_openGripper) ) {
                                  ROS_INFO("Service call to srv_RobotArm_openGripper successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_RobotArm_openGripper.");
                              }
                              
//                               __RobotArm->moveTo(pos);
                              uml_to_ros::RobotArm_RobotArm_moveTo srv_RobotArm_moveTo;
                              srv_RobotArm_moveTo.request.ArmPosition = pos;
                              srv_RobotArm_moveTo.request.ShoulderPosition = pos / 33;
                              srv_RobotArm_moveTo.request.RotaryShoulderPosition = pos / 15;
                              srv_RobotArm_moveTo.request.WristPosition = pos * 7;
                              if ( ros::service::call("RobotArm_RobotArm_moveTo", srv_RobotArm_moveTo) ) {
                                  ROS_INFO("Service call to srv_RobotArm_moveTo successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_RobotArm_moveTo.");
                              }
                              
//                               __RobotArm->closeGripper();
                              uml_to_ros::RobotArm_RobotArm_closeGripper srv_RobotArm_closeGripper;
                              if ( ros::service::call("RobotArm_RobotArm_closeGripper", srv_RobotArm_closeGripper) ) {
                                  ROS_INFO("Service call to srv_RobotArm_closeGripper successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_RobotArm_closeGripper.");
                              }
                              
//                               pos =  MixedPartsOut->getPosition(); // ** REMOTE **
                              // ROS service call 
                              uml_to_ros::Conveyor_Conveyor_getPosition srv_MixedPartsOut_getPosition;
                              if ( ros::service::call("Conveyor_Conveyor_getPosition", srv_MixedPartsOut_getPosition) ) {
                                  ROS_INFO("Service call to srv_MixedPartsOut_getPosition successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_MixedPartsOut_getPosition.");
                              }
                              pos = srv_MixedPartsOut_getPosition.response.ret;
                              
//                               __RobotArm->moveTo(pos);
                              srv_RobotArm_moveTo.request.ArmPosition = pos;
                              srv_RobotArm_moveTo.request.ShoulderPosition = pos / 33;
                              srv_RobotArm_moveTo.request.RotaryShoulderPosition = pos / 15;
                              srv_RobotArm_moveTo.request.WristPosition = pos * 7;
                              if ( ros::service::call("RobotArm_RobotArm_moveTo", srv_RobotArm_moveTo) ) {
                                  ROS_INFO("Service call to srv_RobotArm_moveTo successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_RobotArm_moveTo.");
                              }

//                               __RobotArm->openGripper();
                              // ROS service call 
                              if ( ros::service::call("RobotArm_RobotArm_openGripper", srv_RobotArm_openGripper) ) {
                                  ROS_INFO("Service call to srv_RobotArm_openGripper successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_RobotArm_openGripper.");
                              }                          }
                          i = i+1;      
                    } 
                }  else { 
                      // ROS service call 
                      uml_to_ros::Conveyor_Conveyor_isItemDetected srv_ProductsIn_isItemDetected;
                      if ( ros::service::call("Conveyor_Conveyor_isItemDetected", srv_ProductsIn_isItemDetected) ) {
                          ROS_INFO("Service call to srv_ProductsIn_isItemDetected successfull!");
                      }
                      else {
                          ROS_ERROR("Failed to call srv_ProductsIn_isItemDetected.");
                      }
                    
                     if ( (srv_ProductsIn_isItemDetected.response.ret == true) ) { 
//                               pos =  ProductsIn->getPosition(); // ** REMOTE **
                              // ROS service call 
                              uml_to_ros::Conveyor_Conveyor_getPosition srv_ProductsIn_getPosition;
                              if ( ros::service::call("Conveyor_Conveyor_getPosition", srv_ProductsIn_getPosition) ) {
                                  ROS_INFO("Service call to srv_ProductsIn_getPosition successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_ProductsIn_getPosition.");
                              }
                              pos = srv_ProductsIn_getPosition.response.ret;
                              
//                               __RobotArm->openGripper();
                              // ROS service call 
                              uml_to_ros::RobotArm_RobotArm_openGripper srv_RobotArm_openGripper;
                              if ( ros::service::call("RobotArm_RobotArm_openGripper", srv_RobotArm_openGripper) ) {
                                  ROS_INFO("Service call to srv_RobotArm_openGripper successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_RobotArm_openGripper.");
                              }
                              
//                               __RobotArm->moveTo(pos);
                              uml_to_ros::RobotArm_RobotArm_moveTo srv_RobotArm_moveTo;
                              srv_RobotArm_moveTo.request.ArmPosition = pos;
                              srv_RobotArm_moveTo.request.ShoulderPosition = pos / 33;
                              srv_RobotArm_moveTo.request.RotaryShoulderPosition = pos / 15;
                              srv_RobotArm_moveTo.request.WristPosition = pos * 7;
                              if ( ros::service::call("RobotArm_RobotArm_moveTo", srv_RobotArm_moveTo) ) {
                                  ROS_INFO("Service call to srv_RobotArm_moveTo successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_RobotArm_moveTo.");
                              }
                              
//                               __RobotArm->closeGripper();
                              uml_to_ros::RobotArm_RobotArm_closeGripper srv_RobotArm_closeGripper;
                              if ( ros::service::call("RobotArm_RobotArm_closeGripper", srv_RobotArm_closeGripper) ) {
                                  ROS_INFO("Service call to srv_RobotArm_closeGripper successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_RobotArm_closeGripper.");
                              }
                    
//                          item =  ProductsIn->getItem(); // ** REMOTE **
                              // ROS service call 
                              uml_to_ros::Conveyor_Conveyor_getItem srv_ProductsIn_getItem;
                              if ( ros::service::call("Conveyor_Conveyor_getItem", srv_ProductsIn_getItem) ) {
                                  ROS_INFO("Service call to srv_ProductsIn_getItem successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_ProductsIn_getItem.");
                              }

//                          pos =  __StorageUnit->getPosition((ProductPart*)item); // ** REMOTE **
                              // ROS service call 
                              uml_to_ros::StorageUnit_StorageUnit_getPosition srv_StorageUnit_getPosition;
                              srv_StorageUnit_getPosition.request.ID = item->getID();
                              if ( ros::service::call("StorageUnit_StorageUnit_getPosition", srv_StorageUnit_getPosition) ) {
                                  ROS_INFO("Service call to srv_StorageUnit_getPosition successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_StorageUnit_getPosition.");
                              }
                              pos = srv_StorageUnit_getPosition.response.ret;
                              

//                               __RobotArm->moveTo(pos);
                              srv_RobotArm_moveTo.request.ArmPosition = pos;
                              srv_RobotArm_moveTo.request.ShoulderPosition = pos / 33;
                              srv_RobotArm_moveTo.request.RotaryShoulderPosition = pos / 15;
                              srv_RobotArm_moveTo.request.WristPosition = pos * 7;
                              if ( ros::service::call("RobotArm_RobotArm_moveTo", srv_RobotArm_moveTo) ) {
                                  ROS_INFO("Service call to srv_RobotArm_moveTo successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_RobotArm_moveTo.");
                              }

//                               __RobotArm->openGripper();
                              // ROS service call 
                              if ( ros::service::call("RobotArm_RobotArm_openGripper", srv_RobotArm_openGripper) ) {
                                  ROS_INFO("Service call to srv_RobotArm_openGripper successfull!");
                              }
                              else {
                                  ROS_ERROR("Failed to call srv_RobotArm_openGripper.");
                              }   
                     }
                    else
                        ROS_INFO("AssemblyCellController - nothing to do.");
                }
                ROS_INFO("AssemblyCellController - loop - finish");
                // PeriodicTiming.FrequencyControl 
                ros::spinOnce();
                loop_rate.sleep();
            }
            ROS_INFO("AssemblyCellController - finish");
     }
      void  AssemblyCellController::addProduct(    Product* p   ) { 
     // Variables
     
     // Actions
          if ( ProductsCount < (MAX_PRODUCTS-1) ) {
              ProductsToAssembly[ProductsCount] = new Product( NULL );
              *ProductsToAssembly[ProductsCount] = *p;
              (*ProductsToAssembly[ProductsCount]).setRecipe( new Recipe() );
              ROS_INFO("AssemblyCellController - New Product[%d] = %d", ProductsCount, ProductsToAssembly[ProductsCount]->getID() );
              ProductsCount = ProductsCount + 1;
              
              uml_to_ros::AssemblyCellController_AssemblyCellController_ProductsCount msg;
              msg.ProductsCount = ProductsCount;
              pub_ProductsCount.publish(msg);
          }
          else {
              ROS_ERROR("Product list is full - AssemblyCellController::addProduct(%d)", p->getID());
          }
     }
      int  AssemblyCellController::getProductsCount(  ) { 
     // Variables
     
     // Actions
          return  ProductsCount ;     
     }
      AssemblyCellController:: ~AssemblyCellController(  ) { 
     // Variables
     
     // Actions
          
     } 


int main(int argc, char **argv) {
  ros::init(argc, argv, "AssemblyCellController_AssemblyCellController");
  ros::NodeHandle rn_AssemblyCellController_AssemblyCellController;
    
 
// Published/subscribed topics
    /* Message format. Copy/paste the next lines into a file named AssemblyCellController_AssemblyCellController_ProductsCount.msg 
         int32 ProductsCount
    */
    // publisher
    obj_AssemblyCellController.pub_ProductsCount = rn_AssemblyCellController_AssemblyCellController.advertise<uml_to_ros::AssemblyCellController_AssemblyCellController_ProductsCount>("AssemblyCellController_AssemblyCellController_ProductsCount", 1000);

// Provided services
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         int32 ID
         ---
         # response data
         int32 ret
         
    */
    ros::ServiceServer srv_AssemblyCellController_AssemblyCellController_addProduct = rn_AssemblyCellController_AssemblyCellController.advertiseService("AssemblyCellController_AssemblyCellController_addProduct", srv_AssemblyCellController_addProduct);
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         int32 index
         ---
         # response data
         int32 ret
         
    */
    ros::ServiceServer srv_AssemblyCellController_AssemblyCellController_getProductsToAssembly = rn_AssemblyCellController_AssemblyCellController.advertiseService("AssemblyCellController_AssemblyCellController_getProductsToAssembly", srv_AssemblyCellController_getProductsToAssembly);
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         int32 index
         ---
         # response data
         int32 ret
         
    */
    ros::ServiceServer srv_AssemblyCellController_AssemblyCellController_setProductsToAssembly = rn_AssemblyCellController_AssemblyCellController.advertiseService("AssemblyCellController_AssemblyCellController_setProductsToAssembly", srv_AssemblyCellController_setProductsToAssembly);
// Requested services

// remaining code
    ROS_INFO("AssemblyCellController node - init" );

    //ros::spin();
    obj_AssemblyCellController.run();
    
    ROS_INFO("AssemblyCellController node - finish" );

  return 0;
}