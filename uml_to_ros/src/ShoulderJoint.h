#ifndef ShoulderJoint_h
#define ShoulderJoint_h

#include <iostream>
#include <stddef.h>

#include "RobotArmJoint.h"
#include "ros/ros.h"
#include "uml_to_ros/ShoulderJoint_Shoulder_MaxPosition.h"
#include "uml_to_ros/ShoulderJoint_Shoulder_MinPosition.h"
#include "uml_to_ros/ShoulderJoint_Shoulder_Position.h"
#include "uml_to_ros/ShoulderJoint_Shoulder_move.h"

class ShoulderJoint  : public RobotArmJoint {
protected:

public:
      ShoulderJoint(  );
      ~ShoulderJoint(  );
};

static ShoulderJoint obj_ShoulderJoint;

bool srv_ShoulderJoint_move(  uml_to_ros::ShoulderJoint_Shoulder_move::Request  &req,
                            uml_to_ros::ShoulderJoint_Shoulder_move::Response &res) {
    
    //ShoulderJoint::obj_ShoulderJoint->move( req.newPos );
    ROS_INFO("Service call: ShoulderJoint.move(%d)", req.newPos );
    
    obj_ShoulderJoint.move( req.newPos );
    res.ret = 0;
    
    return true;
}
#endif
