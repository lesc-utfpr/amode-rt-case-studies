

 
#include "ShoulderJoint.h"


      ShoulderJoint::ShoulderJoint(  ) { 
     // Variables
     
     // Actions
          MaxPosition = 1000;
          MinPosition = 500;
          Position    = 50;
     }
      ShoulderJoint:: ~ShoulderJoint(  ) { 
     // Variables
     
     // Actions
          
     } 


int main(int argc, char **argv) {
  ros::init(argc, argv, "ShoulderJoint_Shoulder");
  ros::NodeHandle rn_ShoulderJoint_Shoulder;
    
 
// Published/subscribed topics
    /* Message format. Copy/paste the next lines into a file named ShoulderJoint_Shoulder_MaxPosition.msg 
         int32 MaxPosition
    */
    obj_ShoulderJoint.pub_MaxPosition = rn_ShoulderJoint_Shoulder.advertise<uml_to_ros::ShoulderJoint_Shoulder_MaxPosition>("ShoulderJoint_Shoulder_MaxPosition", 1000);
    /* Message format. Copy/paste the next lines into a file named ShoulderJoint_Shoulder_MinPosition.msg 
       int32 MinPosition
    */
    obj_ShoulderJoint.pub_MinPosition = rn_ShoulderJoint_Shoulder.advertise<uml_to_ros::ShoulderJoint_Shoulder_MinPosition>("ShoulderJoint_Shoulder_MinPosition", 1000);
    /* Message format. Copy/paste the next lines into a file named ShoulderJoint_Shoulder_Position.msg 
       int32 Position
    */
    obj_ShoulderJoint.pub_Position = rn_ShoulderJoint_Shoulder.advertise<uml_to_ros::ShoulderJoint_Shoulder_Position>("ShoulderJoint_Shoulder_Position", 1000);

// Provided services
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         int32 newPos
         ---
         # response data
         int32 ret
         
    */
    ros::ServiceServer srv_ShoulderJoint_Shoulder_move = rn_ShoulderJoint_Shoulder.advertiseService("ShoulderJoint_Shoulder_move", srv_ShoulderJoint_move);

// Requested services

// remaining code
    obj_ShoulderJoint.run(  );

  return 0;
}