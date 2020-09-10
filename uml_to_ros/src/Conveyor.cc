#include "Conveyor.h"

/*
     Conveyor::Conveyor(    ItemReader* _ItemDetector  ,  Item* _DetectedItem   ) { 
     // Variables
     
     // Actions
         
               ItemDetector = _ItemDetector;
               // MemoryUsageMonitoring.IncreaseMemoryUsage     
               ItemPosition = new RobotArmPosition();
               DetectedItem = _DetectedItem;
               // TimingAttributes.SetTimingAttributes     
               // PeriodicTiming.SetPeriod     
     }
     ItemReader*  Conveyor::getItemDetector(  ) { 
     // Variables
     
     // Actions
          return  ItemDetector ;     
     }
     void  Conveyor::setItemDetector(    ItemReader* _ItemDetector   ) { 
     // Variables
     
     // Actions
          ItemDetector = _ItemDetector;     
     }
     Item*  Conveyor::getDetectedItem(  ) { 
     // Variables
     
     // Actions
          return  DetectedItem ;     
     }
     void  Conveyor::setDetectedItem(    Item* _DetectedItem   ) { 
     // Variables
     
     // Actions
          DetectedItem = _DetectedItem;     
     }
*/
     void  Conveyor::moveForward(  ) { 
     // Variables
     
     // Actions
          State = MOVING_FORWARD;
          internalMoveForward(); 
     }
     void  Conveyor::moveBackward(  ) { 
     // Variables
     
     // Actions
          State = MOVING_BACKWARD;
          internalMoveBackward(); 
     }
     void  Conveyor::stop() { 
     // Variables
     
     // Actions
          State = STOPPED;
          internalStop();
     }
     bool  Conveyor::isItemDetected(  ) { 
     // Variables
     
     // Actions
          return  DetectedItem != NULL ;     
     }
//     RobotArmPosition*  Conveyor::getPosition(  ) { 
     int  Conveyor::getPosition(  ) { 
     // Variables
     
     // Actions
          return  rand() ;     
     }
     int  Conveyor::getItem(  ) { 
     // Variables
     
     // Actions
          return  DetectedItem != NULL ?  DetectedItem->getID() : -1;     
     }
     int  Conveyor::setItem(    int ID   ) { 
     // Variables
     
     // Actions
          if ( ID != 0 ) { 
               if ( DetectedItem != NULL ) {
                   delete DetectedItem;
                   DetectedItem = NULL;
               }
               DetectedItem = new ProductPart();
               DetectedItem->setID(ID);
               stop();
               return DetectedItem->getID();
          }  else { 
               if ( DetectedItem != NULL ) { 
                    moveForward();
                    return DetectedItem->getID();
               }
          }     
          return -1;
     }
     void  Conveyor::run(  ) { 
     // Variables
     
     // Actions
            ROS_INFO("Conveyor - init");
            ros::Rate loop_rate(0.2); // 5 s period
            while (ros::ok()) {
                ROS_INFO("Conveyor - loop - Idem ID = %d", (DetectedItem != NULL) ? DetectedItem->getID() : -1);

                if ( State == MOVING_FORWARD  ) { 
                    internalMoveForward(); 
                }  else { 
                    if ( State == MOVING_BACKWARD  ) { 
                         internalMoveBackward(); 
                    }  else { 
                         if ( State == STOPPED ) { 
                              internalStop();      
                         }      
                    }      
                }     
                // PeriodicTiming.FrequencyControl     
                                   // PeriodicTiming.FrequencyControl     
                ros::spinOnce();
                loop_rate.sleep();
            }
            ROS_INFO("Conveyor - finish");

     }
     void  Conveyor::internalMoveForward(  ) { 
     // Variables
     
     // Actions
          ROS_INFO("Conveyor - moving FORWARD");
     }
     void  Conveyor::internalMoveBackward(  ) { 
     // Variables
     
     // Actions
          ROS_INFO("Conveyor - moving BACKWARD");
     }
     void  Conveyor::internalStop(  ) { 
     // Variables
     
     // Actions
          ROS_INFO("Conveyor - STOPPED");
     }
     Conveyor::Conveyor(  ) { 
     // Variables
     
     // Actions
          State = STOPPED;
          DetectedItem = NULL;
     } 
     Conveyor:: ~Conveyor(  ) { 
     // Variables
     
     // Actions
          
     } 

int main(int argc, char **argv) {
  ros::init(argc, argv, "Conveyor_Conveyor");
  ros::NodeHandle rn_Conveyor_Conveyor;
    
// Published/subscribed topics

// Provided services
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         ---
         # response data
         int8 ret
         
    */
    ros::ServiceServer srv_Conveyor_Conveyor_moveForward = rn_Conveyor_Conveyor.advertiseService("Conveyor_Conveyor_moveForward", srv_Conveyor_moveForward);
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         ---
         # response data
         int8 ret
         
    */
    ros::ServiceServer srv_Conveyor_Conveyor_moveBackward = rn_Conveyor_Conveyor.advertiseService("Conveyor_Conveyor_moveBackward", srv_Conveyor_moveBackward);
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         ---
         # response data
         int8 ret
         
    */
    ros::ServiceServer srv_Conveyor_Conveyor_stop = rn_Conveyor_Conveyor.advertiseService("Conveyor_Conveyor_stop", srv_Conveyor_stop);
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         ---
         # response data
         bool ret     
    */
    ros::ServiceServer srv_Conveyor_Conveyor_isItemDetected = rn_Conveyor_Conveyor.advertiseService("Conveyor_Conveyor_isItemDetected", srv_Conveyor_isItemDetected);
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         ---
         # response data
         int32 ret
         
    */
    ros::ServiceServer srv_Conveyor_Conveyor_getPosition = rn_Conveyor_Conveyor.advertiseService("Conveyor_Conveyor_getPosition", srv_Conveyor_getPosition);
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         ---
         # response data
         int32 ret
         
    */
    ros::ServiceServer srv_Conveyor_Conveyor_getItem = rn_Conveyor_Conveyor.advertiseService("Conveyor_Conveyor_getItem", srv_Conveyor_getItem);
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         int32 ID
         ---
         # response data
         int32 ret
         
    */
    ros::ServiceServer srv_Conveyor_Conveyor_setItem = rn_Conveyor_Conveyor.advertiseService("Conveyor_Conveyor_setItem", srv_Conveyor_setItem);

// Requested services

// remaining code
  //WristJoint::obj_WristJoint->run();
    obj_Conveyor.run(  );

  return 0;
}