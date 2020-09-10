#ifndef RobotArmPosition_h
#define RobotArmPosition_h

#include <iostream>
#include <stddef.h>
#include "ros/ros.h"

#include "uml_to_ros/RobotArmPosition_RobotArmPosition_WristPosition.h"
#include "uml_to_ros/RobotArmPosition_RobotArmPosition_ShoulderPosition.h"
#include "uml_to_ros/RobotArmPosition_RobotArmPosition_RotaryShoulderPosition.h"
#include "uml_to_ros/RobotArmPosition_RobotArmPosition_ArmPosition.h"

class RobotArmPosition {
protected:
     int WristPosition;
     int ShoulderPosition;
     int RotaryShoulderPosition;
     int ArmPosition;

public: 
     ros::Publisher pub_WristPosition;
     ros::Subscriber sub_WristPosition;
     void topic_RobotArmPosition_RobotArmPosition_WristPosition_call_back(const
                        uml_to_ros::RobotArmPosition_RobotArmPosition_WristPosition::ConstPtr& msg);
     ros::Publisher pub_ShoulderPosition;
     ros::Subscriber sub_ShoulderPosition;
     void topic_RobotArmPosition_RobotArmPosition_ShoulderPosition_call_back(const
                        uml_to_ros::RobotArmPosition_RobotArmPosition_ShoulderPosition::ConstPtr& msg);
     ros::Publisher pub_RotaryShoulderPosition;
     ros::Subscriber sub_RotaryShoulderPosition;
     void topic_RobotArmPosition_RobotArmPosition_RotaryShoulderPosition_call_back(const
                        uml_to_ros::RobotArmPosition_RobotArmPosition_RotaryShoulderPosition::ConstPtr& msg);
     ros::Publisher pub_ArmPosition;
     ros::Subscriber sub_ArmPosition;
     void topic_RobotArmPosition_RobotArmPosition_ArmPosition_call_back(const
                        uml_to_ros::RobotArmPosition_RobotArmPosition_ArmPosition::ConstPtr& msg);
    
      virtual   void  setWristPosition(    int _WristPosition   );
      virtual   int  getWristPosition(  );
      virtual   void  setShoulderPosition(    int _ShoulderPosition   );
      virtual   int  getShoulderPosition(  );
      virtual   void  setRotaryShoulderPosition(    int _RotaryShoulderPosition   );
      virtual   int  getRotaryShoulderPosition(  );
      virtual   void  setArmPosition(    int _ArmPosition   );
      virtual   int  getArmPosition(  );
    
    virtual   int  run();

      RobotArmPosition(  );
      ~RobotArmPosition(  );
};

static RobotArmPosition obj_RobotArmPosition;

void RobotArmPosition::topic_RobotArmPosition_RobotArmPosition_WristPosition_call_back(const uml_to_ros::RobotArmPosition_RobotArmPosition_WristPosition::ConstPtr& msg) {
    WristPosition = msg->WristPosition;
    ROS_INFO("NEW Wrist Position = %d", msg->WristPosition);
}

void RobotArmPosition::topic_RobotArmPosition_RobotArmPosition_ShoulderPosition_call_back(const uml_to_ros::RobotArmPosition_RobotArmPosition_ShoulderPosition::ConstPtr& msg) {
    ShoulderPosition = msg->ShoulderPosition;
    ROS_INFO("NEW Shoulder Position = %d", msg->ShoulderPosition);
}

void RobotArmPosition::topic_RobotArmPosition_RobotArmPosition_RotaryShoulderPosition_call_back(const uml_to_ros::RobotArmPosition_RobotArmPosition_RotaryShoulderPosition::ConstPtr& msg) {
    RotaryShoulderPosition = msg->RotaryShoulderPosition;
    ROS_INFO("NEW RotaryShoulder Position = %d", msg->RotaryShoulderPosition);
}

void RobotArmPosition::topic_RobotArmPosition_RobotArmPosition_ArmPosition_call_back(const uml_to_ros::RobotArmPosition_RobotArmPosition_ArmPosition::ConstPtr& msg) {
    ArmPosition = msg->ArmPosition;
    ROS_INFO("NEW Arm Position = %d", msg->ArmPosition);
}


#endif
