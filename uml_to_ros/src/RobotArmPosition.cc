

 #include "RobotArmPosition.h" 


     void  RobotArmPosition::setWristPosition(    int _WristPosition   ) { 
     // Variables
     
     // Actions
          WristPosition = _WristPosition;     
     }
     int  RobotArmPosition::getWristPosition(  ) { 
     // Variables
     
     // Actions
          return  WristPosition ;     
     }
     void  RobotArmPosition::setShoulderPosition(    int _ShoulderPosition   ) { 
     // Variables
     
     // Actions
          ShoulderPosition = _ShoulderPosition;     
     }
     int  RobotArmPosition::getShoulderPosition(  ) { 
     // Variables
     
     // Actions
          return  ShoulderPosition ;     
     }
     void  RobotArmPosition::setRotaryShoulderPosition(    int _RotaryShoulderPosition   ) { 
     // Variables
     
     // Actions
          RotaryShoulderPosition = _RotaryShoulderPosition;     
     }
     int  RobotArmPosition::getRotaryShoulderPosition(  ) { 
     // Variables
     
     // Actions
          return  RotaryShoulderPosition ;     
     }
     void  RobotArmPosition::setArmPosition(    int _ArmPosition   ) { 
     // Variables
     
     // Actions
          ArmPosition = _ArmPosition;     
     }
     int  RobotArmPosition::getArmPosition(  ) { 
     // Variables
     
     // Actions
          return  ArmPosition ;     
     }
     RobotArmPosition::RobotArmPosition(  ) { 
     // Variables
     
     // Actions
          
     }
     RobotArmPosition::~RobotArmPosition(  ) { 
     // Variables
     
     // Actions
          
     } 

int RobotArmPosition::run(  ) { 
                ros::Rate loop_rate(2); // 500 ms period
                while (ros::ok()) {
                    ROS_INFO("RobotArmPosition - loop - Current position = %d, %d, %d, %d", 
                             ArmPosition, RotaryShoulderPosition, ShoulderPosition, WristPosition);
                    ros::spinOnce();
                    loop_rate.sleep();
                }
} 


int main(int argc, char **argv) {
  ros::init(argc, argv, "RobotArmPosition_RobotArmPosition");
  ros::NodeHandle rn_RobotArmPosition_RobotArmPosition;
    
 
// Published/subscribed topics
    /* Message format. Copy/paste the next lines into a file named RobotArmPosition_RobotArmPosition_WristPosition.msg 
         int32 WristPosition
    */
    // publisher
    obj_RobotArmPosition.pub_WristPosition = rn_RobotArmPosition_RobotArmPosition.advertise<uml_to_ros::RobotArmPosition_RobotArmPosition_WristPosition>("RobotArmPosition_RobotArmPosition_WristPosition", 1000);
    // subscriber
    obj_RobotArmPosition.sub_WristPosition = rn_RobotArmPosition_RobotArmPosition.subscribe("RobotArmPosition_RobotArmPosition_WristPosition", 1000, &RobotArmPosition::topic_RobotArmPosition_RobotArmPosition_WristPosition_call_back, &obj_RobotArmPosition);

    /* Message format. Copy/paste the next lines into a file named RobotArmPosition_RobotArmPosition_WristPosition.msg 
         int32 ShoulderPosition
    */
    // publisher
    obj_RobotArmPosition.pub_ShoulderPosition = rn_RobotArmPosition_RobotArmPosition.advertise<uml_to_ros::RobotArmPosition_RobotArmPosition_ShoulderPosition>("RobotArmPosition_RobotArmPosition_ShoulderPosition", 1000);
    // subscriber
    obj_RobotArmPosition.sub_ShoulderPosition = rn_RobotArmPosition_RobotArmPosition.subscribe("RobotArmPosition_RobotArmPosition_ShoulderPosition", 1000, &RobotArmPosition::topic_RobotArmPosition_RobotArmPosition_ShoulderPosition_call_back, &obj_RobotArmPosition);

    /* Message format. Copy/paste the next lines into a file named RobotArmPosition_RobotArmPosition_RotaryShoulderPosition.msg 
         int32 RotaryShoulderPosition
    */
    // publisher
    obj_RobotArmPosition.pub_RotaryShoulderPosition = rn_RobotArmPosition_RobotArmPosition.advertise<uml_to_ros::RobotArmPosition_RobotArmPosition_RotaryShoulderPosition>("RobotArmPosition_RobotArmPosition_RotaryShoulderPosition", 1000);
// subscriber
    obj_RobotArmPosition.sub_RotaryShoulderPosition = rn_RobotArmPosition_RobotArmPosition.subscribe("RobotArmPosition_RobotArmPosition_RotaryShoulderPosition", 1000, &RobotArmPosition::topic_RobotArmPosition_RobotArmPosition_RotaryShoulderPosition_call_back, &obj_RobotArmPosition);

    /* Message format. Copy/paste the next lines into a file named RobotArmPosition_RobotArmPosition_ArmPosition.msg 
         int32 ArmPosition
    */
    // publisher
    obj_RobotArmPosition.pub_ArmPosition = rn_RobotArmPosition_RobotArmPosition.advertise<uml_to_ros::RobotArmPosition_RobotArmPosition_ArmPosition>("RobotArmPosition_RobotArmPosition_ArmPosition", 1000);
// subscriber
    obj_RobotArmPosition.sub_ArmPosition = rn_RobotArmPosition_RobotArmPosition.subscribe("RobotArmPosition_RobotArmPosition_ArmPosition", 1000, &RobotArmPosition::topic_RobotArmPosition_RobotArmPosition_ArmPosition_call_back, &obj_RobotArmPosition);
    
    
// Provided services

// Requested services

// remaining code
    ROS_INFO("RobotArmPosition node - init" );

    //ros::spin();
    obj_RobotArmPosition.run();
    
    ROS_INFO("RobotArmPosition node - finish" );

  return 0;
}