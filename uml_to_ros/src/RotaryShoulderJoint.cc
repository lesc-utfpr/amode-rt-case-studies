

#include "RobotArmJoint.h" 
#include "RotaryShoulderJoint.h" 


      RotaryShoulderJoint::RotaryShoulderJoint(  ) { 
     // Variables
     
     // Actions
          MaxPosition = 100;
          MinPosition = 10;
          Position    = 15;
     }
      RotaryShoulderJoint:: ~RotaryShoulderJoint(  ) { 
     // Variables
     
     // Actions
          
     } 


int main(int argc, char **argv) {
  ros::init(argc, argv, "RotaryShoulderJoint_RotaryShoulder");
  ros::NodeHandle rn_RotaryShoulderJoint_RotaryShoulder;
    
 
// Published/subscribed topics
    /* Message format. Copy/paste the next lines into a file named RotaryShoulderJoint_RotaryShoulder_MaxPosition.msg 
         int32 MaxPosition
    */
    obj_RotaryShoulderJoint.pub_MaxPosition = rn_RotaryShoulderJoint_RotaryShoulder.advertise<uml_to_ros::RotaryShoulderJoint_RotaryShoulder_MaxPosition>("RotaryShoulderJoint_RotaryShoulder_MaxPosition", 1000);
    /* Message format. Copy/paste the next lines into a file named RotaryShoulderJoint_RotaryShoulder_MinPosition.msg 
       int32 MinPosition
    */
    obj_RotaryShoulderJoint.pub_MinPosition = rn_RotaryShoulderJoint_RotaryShoulder.advertise<uml_to_ros::RotaryShoulderJoint_RotaryShoulder_MinPosition>("RotaryShoulderJoint_RotaryShoulder_MinPosition", 1000);
    /* Message format. Copy/paste the next lines into a file named RotaryShoulderJoint_RotaryShoulder_Position.msg 
       int32 Position
    */
    obj_RotaryShoulderJoint.pub_Position = rn_RotaryShoulderJoint_RotaryShoulder.advertise<uml_to_ros::RotaryShoulderJoint_RotaryShoulder_Position>("RotaryShoulderJoint_RotaryShoulder_Position", 1000);

// Provided services
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         int32 newPos
         ---
         # response data
         int32 ret
         
    */
    ros::ServiceServer srv_RotaryShoulderJoint_RotaryShoulder_move = rn_RotaryShoulderJoint_RotaryShoulder.advertiseService("RotaryShoulderJoint_RotaryShoulder_move", srv_RotaryShoulderJoint_move);

// Requested services

// remaining code
    obj_RotaryShoulderJoint.run(  );

  return 0;
}