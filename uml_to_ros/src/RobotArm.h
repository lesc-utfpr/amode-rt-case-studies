#ifndef RobotArm_h
#define RobotArm_h

#include <iostream>
#include <stddef.h>
#include "ros/ros.h"

#include "uml_to_ros/RobotArm_RobotArm_moveTo.h"
#include "uml_to_ros/RobotArm_RobotArm_openGripper.h"
#include "uml_to_ros/RobotArm_RobotArm_closeGripper.h"

#include "uml_to_ros/Gripper_Gripper_open.h"
#include "uml_to_ros/Gripper_Gripper_close.h"
#include "uml_to_ros/ArmJoint_Arm_move.h"
#include "uml_to_ros/ShoulderJoint_Shoulder_move.h"
#include "uml_to_ros/RotaryShoulderJoint_RotaryShoulder_move.h"
#include "uml_to_ros/WristJoint_Wrist_move.h"
/*
#include "RobotArmPosition.h"
#include "WristJoint.h"
#include "ShoulderJoint.h"
#include "RotaryShoulderJoint.h"
#include "ArmJoint.h"
#include "Gripper.h"
*/
class RobotArm {
protected:
     /*
     These attributes came from associations in the UML model.
     As these objects will be ROS nodes, there is no need to declare them here, 
     but we need publisher/subscribers
     
     
     Just remember that all classes follow the singleton design pattern.
     
     WristJoint* _Wrist;
     ShoulderJoint* _Shoulder;
     RotaryShoulderJoint* _RotaryShoulder;
     ArmJoint* _Arm;
     Gripper* _Gripper;
     */
public:
      
      //virtual   void  moveTo(    RobotArmPosition* newPos   );
      virtual   void  moveTo(    int a_pos, int s_pos, int rs_pos, int w_pos  );
      //virtual   RobotArmPosition*  getCurrentPosition(  );
      virtual   void  openGripper(  );
      virtual   void  closeGripper(  );
    
      bool srv_RobotArm_moveTo(  uml_to_ros::RobotArm_RobotArm_moveTo::Request  &req,
                                 uml_to_ros::RobotArm_RobotArm_moveTo::Response &res);
      bool srv_RobotArm_openGripper(  uml_to_ros::RobotArm_RobotArm_openGripper::Request  &req,
                                      uml_to_ros::RobotArm_RobotArm_openGripper::Response &res);
      bool srv_RobotArm_closeGripper(  uml_to_ros::RobotArm_RobotArm_closeGripper::Request  &req,
                                       uml_to_ros::RobotArm_RobotArm_closeGripper::Response &res);
          
      RobotArm(  );
      ~RobotArm(  );
};

static RobotArm obj_RobotArm;

bool RobotArm::srv_RobotArm_moveTo(  uml_to_ros::RobotArm_RobotArm_moveTo::Request  &req,
                                     uml_to_ros::RobotArm_RobotArm_moveTo::Response &res) {
    ROS_INFO("Service call: RobotArm.moveTo(%d,%d,%d,%d)", req.ArmPosition, req.ShoulderPosition, req.RotaryShoulderPosition, req.WristPosition );
    moveTo( req.ArmPosition, req.ShoulderPosition, req.RotaryShoulderPosition, req.WristPosition );
    return true;
}
bool RobotArm::srv_RobotArm_openGripper(  uml_to_ros::RobotArm_RobotArm_openGripper::Request  &req,
                                          uml_to_ros::RobotArm_RobotArm_openGripper::Response &res) {
    ROS_INFO("Service call: RobotArm.openGripper()");
    openGripper();
    return true;
}
bool RobotArm::srv_RobotArm_closeGripper(  uml_to_ros::RobotArm_RobotArm_closeGripper::Request  &req,
                                           uml_to_ros::RobotArm_RobotArm_closeGripper::Response &res) {
    ROS_INFO("Service call: RobotArm.closeGripper()");
    closeGripper();
    return true;
}


#endif
