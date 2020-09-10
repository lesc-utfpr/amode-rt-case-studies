

 
#include "ArmJoint.h" 


      ArmJoint::ArmJoint(  ) { 
     // Variables
     
     // Actions
          MaxPosition = 300;
          MinPosition = 100;
          Position    = 285;
     }
      ArmJoint:: ~ArmJoint(  ) { 
     // Variables
     
     // Actions
          
     } 


bool srv_ArmJoint_move(  uml_to_ros::ArmJoint_Arm_move::Request  &req,
                            uml_to_ros::ArmJoint_Arm_move::Response &res) {
    
    //ArmJoint::obj_ArmJoint->move( req.newPos );
    ROS_INFO("Service call: ArmJoint.move(%d)", req.newPos );
    
    obj_ArmJoint.move( req.newPos );
    res.ret = 0;
    
    return true;
}
int main(int argc, char **argv) {
  ros::init(argc, argv, "ArmJoint_Arm");
  ros::NodeHandle rn_ArmJoint_Arm;
    
 
// Published/subscribed topics
    /* Message format. Copy/paste the next lines into a file named ArmJoint_Arm_MaxPosition.msg 
         int32 MaxPosition
    */
    obj_ArmJoint.pub_MaxPosition = rn_ArmJoint_Arm.advertise<uml_to_ros::ArmJoint_Arm_MaxPosition>("ArmJoint_Arm_MaxPosition", 1000);
    /* Message format. Copy/paste the next lines into a file named ArmJoint_Arm_MinPosition.msg 
       int32 MinPosition
    */
    obj_ArmJoint.pub_MinPosition = rn_ArmJoint_Arm.advertise<uml_to_ros::ArmJoint_Arm_MinPosition>("ArmJoint_Arm_MinPosition", 1000);
    /* Message format. Copy/paste the next lines into a file named ArmJoint_Arm_Position.msg 
       int32 Position
    */
    obj_ArmJoint.pub_Position = rn_ArmJoint_Arm.advertise<uml_to_ros::ArmJoint_Arm_Position>("ArmJoint_Arm_Position", 1000);

// Provided services
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         int32 newPos
         ---
         # response data
         int32 ret
         
    */
    ros::ServiceServer srv_ArmJoint_Arm_move = rn_ArmJoint_Arm.advertiseService("ArmJoint_Arm_move", srv_ArmJoint_move);

// Requested services

// remaining code
    obj_ArmJoint.run(  );

  return 0;
}