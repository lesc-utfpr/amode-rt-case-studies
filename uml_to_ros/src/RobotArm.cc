

#include "RobotArm.h" 
 

      RobotArm::RobotArm(  ) { 
     // Variables
     
     // Actions
          /*
          These attributes came from associations in the UML model.
          As these objects will be a ROS node, there is no need to declare them here.
     
          Just remember that all classes follow the singleton design pattern.
          
          // MemoryUsageMonitoring.IncreaseMemoryUsage     
          _Wrist = new WristJoint();
          // MemoryUsageMonitoring.IncreaseMemoryUsage     
          _Shoulder = new ShoulderJoint();
          // MemoryUsageMonitoring.IncreaseMemoryUsage     
          _RotaryShoulder = new RotaryShoulderJoint();
          // MemoryUsageMonitoring.IncreaseMemoryUsage     
          _Arm = new ArmJoint();
          // MemoryUsageMonitoring.IncreaseMemoryUsage     
          _Gripper = new Gripper();     
          */
     }
/*
      void  RobotArm::moveTo(    RobotArmPosition* newPos   ) { 
     // Variables
     
     // Actions
          _RotaryShoulder->move(newPos->getRotaryShoulderPosition());
          _Shoulder->move(newPos->getShoulderPosition());
          _Arm->move(newPos->getArmPosition());
          _Wrist->move(newPos->getWristPosition());     
        
     }
*/
      void  RobotArm::moveTo(    int a_pos, int s_pos, int rs_pos, int w_pos  ) {
          
            uml_to_ros::ArmJoint_Arm_move ArmJoint_move;
            ArmJoint_move.request.newPos = a_pos;
            if ( ros::service::call("ArmJoint_Arm_move", ArmJoint_move) ) {
                ROS_INFO("Service call to ArmJoint.move(%d) successfull!", (int)ArmJoint_move.request.newPos);
            }
            else {
                ROS_ERROR("Failed to call service ArmJoint.move().");
            }
          
            uml_to_ros::ShoulderJoint_Shoulder_move ShoulderJoint_move;
            ShoulderJoint_move.request.newPos = s_pos;
            if ( ros::service::call("ShoulderJoint_Shoulder_move", ShoulderJoint_move) ) {
                ROS_INFO("Service call to ShoulderJoint.move(%d) successfull!", (int)ShoulderJoint_move.request.newPos);
            }
            else {
                ROS_ERROR("Failed to call service ShoulderJoint.move(%d).", (int)ShoulderJoint_move.request.newPos);
            }
          
            uml_to_ros::RotaryShoulderJoint_RotaryShoulder_move RotaryShoulderJoint_move;
            RotaryShoulderJoint_move.request.newPos = rs_pos;
            if ( ros::service::call("RotaryShoulderJoint_RotaryShoulder_move", RotaryShoulderJoint_move) ) {
                ROS_INFO("Service call to RotaryShoulderJoint.move(%d) successfull!", (int)RotaryShoulderJoint_move.request.newPos);
            }
            else {
                ROS_ERROR("Failed to call service RotaryShoulderJoint.move(%d).", (int)RotaryShoulderJoint_move.request.newPos);
            }

            uml_to_ros::WristJoint_Wrist_move WristJoint_move;
            WristJoint_move.request.newPos = w_pos;
            if ( ros::service::call("WristJoint_Wrist_move", WristJoint_move) ) {
                ROS_INFO("Service call to WristJoint.move(%d) successfull!", (int)WristJoint_move.request.newPos);
            }
            else {
                ROS_ERROR("Failed to call service WristJoint.move(%d).", (int)WristJoint_move.request.newPos);
            }
      }

//      RobotArmPosition*  RobotArm::getCurrentPosition(  ) { 
     // Variables
          //RobotArmPosition* pos;     
//          int p;
     // Actions
        /*
          Here you must replace getter by topics subscriptions
          GenERTiCA script is WRONG! You must fix it!
          
          // MemoryUsageMonitoring.IncreaseMemoryUsage     
          pos = new RobotArmPosition();
          p =  _RotaryShoulder->getPosition();
          pos->setRotaryShoulderPosition(p);     
          // ConcurrentAccessControl.ReleaseAccess
          p =  _Shoulder->getPosition();
          pos->setShoulderPosition(p);     
          // ConcurrentAccessControl.ReleaseAccess
          p =  _Arm->getPosition();
          pos->setArmPosition(p);     
          // ConcurrentAccessControl.ReleaseAccess
          p =  _Wrist->getPosition();
          pos->setWristPosition(p);     
          // ConcurrentAccessControl.ReleaseAccess
        */
//          return  0 ;     
//     }
      void  RobotArm::openGripper(  ) { 
     // Variables
     
     // Actions
        uml_to_ros::Gripper_Gripper_open srv;
        if ( ros::service::call("Gripper_Gripper_open", srv) ) {
            ROS_INFO("Service call to Gripper.open() successfull!");
        }
        else {
            ROS_ERROR("Failed to call service Gripper.open().");
        }
     }

      void  RobotArm::closeGripper(  ) { 
     // Variables
     
     // Actions
        uml_to_ros::Gripper_Gripper_close srv;
        if ( ros::service::call("Gripper_Gripper_close", srv) ) {
            ROS_INFO("Service call to Gripper.close() successfull!");
        }
        else {
            ROS_ERROR("Failed to call service Gripper.close().");
        }
     }
      RobotArm:: ~RobotArm(  ) { 
     // Variables
     
     // Actions
          
     } 



int main(int argc, char **argv) {
  ros::init(argc, argv, "RobotArm_RobotArm");
  ros::NodeHandle rn_RobotArm_RobotArm;
    
 
// Published/subscribed topics
    //obj_WristJoint.pub_Position = rn_WristJoint_Wrist.advertise<uml_to_ros::WristJoint_Wrist_Position>("WristJoint_Wrist_Position", 1000);
    
// Provided services
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         int32 ArmPosition
         int32 ShoulderPosition
         int32 RotaryShoulderPosition
         int32 WristPosition
         ---
         # response data
         int8 ret
    */
    ros::ServiceServer srv_RobotArm_RobotArm_moveTo = rn_RobotArm_RobotArm.advertiseService("RobotArm_RobotArm_moveTo", &RobotArm::srv_RobotArm_moveTo, &obj_RobotArm);
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         ---
         # response data
         int8 ret     
    */
    ros::ServiceServer srv_RobotArm_RobotArm_openGripper = rn_RobotArm_RobotArm.advertiseService("RobotArm_RobotArm_openGripper", &RobotArm::srv_RobotArm_openGripper, &obj_RobotArm);
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         ---
         # response data
         int8 ret     
    */
    ros::ServiceServer srv_RobotArm_RobotArm_closeGripper = rn_RobotArm_RobotArm.advertiseService("RobotArm_RobotArm_closeGripper", &RobotArm::srv_RobotArm_closeGripper, &obj_RobotArm);
// Requested services

// remaining code
    ROS_INFO("RobotArm node - init" );
    ros::spin();
    ROS_INFO("RobotArm node - finish" );

  return 0;
}