#ifndef WristJoint_h
#define WristJoint_h

#include <iostream>
#include <stddef.h>

#include "RobotArmJoint.h"
#include "ros/ros.h"
#include "uml_to_ros/WristJoint_Wrist_MaxPosition.h"
#include "uml_to_ros/WristJoint_Wrist_MinPosition.h"
#include "uml_to_ros/WristJoint_Wrist_Position.h"
#include "uml_to_ros/WristJoint_Wrist_move.h"

class WristJoint  : public RobotArmJoint {
protected:
      
public:
      //static WristJoint* obj_WristJoint;
      
      WristJoint(  );
      ~WristJoint(  );
};

//WristJoint* WristJoint::obj_WristJoint = new WristJoint();
static WristJoint obj_WristJoint;

bool srv_WristJoint_move(  uml_to_ros::WristJoint_Wrist_move::Request  &req,
                            uml_to_ros::WristJoint_Wrist_move::Response &res) {
    
    //WristJoint::obj_WristJoint->move( req.newPos );
    ROS_INFO("Service call: WristJoint.move(%d)", req.newPos );
    
    obj_WristJoint.move( req.newPos );
    res.ret = 0;
    
    return true;
}

#endif
