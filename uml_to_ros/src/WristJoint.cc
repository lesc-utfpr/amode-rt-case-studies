

 #include "WristJoint.h" 


      WristJoint::WristJoint(  ) { 
     // Variables
     
     // Actions
          MaxPosition = 500;
          MinPosition = 100;
          Position    = 15;
     }
      WristJoint:: ~WristJoint(  ) { 
     // Variables
     
     // Actions
          
     } 


int main(int argc, char **argv) {
  ros::init(argc, argv, "WristJoint_Wrist");
  ros::NodeHandle rn_WristJoint_Wrist;
    
  // WristJoint* obj_WristJoint = new WristJoint();
  //WristJoint::obj_WristJoint = new WristJoint();

// Published/subscribed topics
    /* Message format. Copy/paste the next lines into a file named WristJoint_Wrist_MaxPosition.msg 
         int32 MaxPosition
    */
    obj_WristJoint.pub_MaxPosition = rn_WristJoint_Wrist.advertise<uml_to_ros::WristJoint_Wrist_MaxPosition>("WristJoint_Wrist_MaxPosition", 1000);
    /* Message format. Copy/paste the next lines into a file named WristJoint_Wrist_MinPosition.msg 
       int32 MinPosition
    */
    obj_WristJoint.pub_MinPosition = rn_WristJoint_Wrist.advertise<uml_to_ros::WristJoint_Wrist_MinPosition>("WristJoint_Wrist_MinPosition", 1000);
    /* Message format. Copy/paste the next lines into a file named WristJoint_Wrist_Position.msg 
       int32 Position
    */
    obj_WristJoint.pub_Position = rn_WristJoint_Wrist.advertise<uml_to_ros::WristJoint_Wrist_Position>("WristJoint_Wrist_Position", 1000);

// Provided services
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         int32 newPos
         ---
         # response data
         int32 ret
         
    */
    ros::ServiceServer srv_WristJoint_Wrist_move = rn_WristJoint_Wrist.advertiseService("WristJoint_Wrist_move", srv_WristJoint_move);

// Requested services

// remaining code
  //WristJoint::obj_WristJoint->run();
    obj_WristJoint.run(  );

  return 0;
}