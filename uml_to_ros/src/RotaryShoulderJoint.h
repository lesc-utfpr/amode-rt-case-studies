#ifndef RotaryShoulderJoint_h
#define RotaryShoulderJoint_h

#include <iostream>
#include <stddef.h>

#include "RobotArmJoint.h"
#include "ros/ros.h"
#include "uml_to_ros/RotaryShoulderJoint_RotaryShoulder_MaxPosition.h"
#include "uml_to_ros/RotaryShoulderJoint_RotaryShoulder_MinPosition.h"
#include "uml_to_ros/RotaryShoulderJoint_RotaryShoulder_Position.h"
#include "uml_to_ros/RotaryShoulderJoint_RotaryShoulder_move.h"

class RotaryShoulderJoint  : public RobotArmJoint {
protected:

public:
      RotaryShoulderJoint(  );
      ~RotaryShoulderJoint(  );
};

static RotaryShoulderJoint obj_RotaryShoulderJoint;

bool srv_RotaryShoulderJoint_move(  uml_to_ros::RotaryShoulderJoint_RotaryShoulder_move::Request  &req,
                            uml_to_ros::RotaryShoulderJoint_RotaryShoulder_move::Response &res) {
    
    //RotaryShoulderJoint::obj_RotaryShoulderJoint->move( req.newPos );
    ROS_INFO("Service call: RotaryShoulderJoint.move(%d)", req.newPos );
    
    obj_RotaryShoulderJoint.move( req.newPos );
    res.ret = 0;
    
    return true;
}
#endif
