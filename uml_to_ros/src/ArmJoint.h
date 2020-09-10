#ifndef ArmJoint_h
#define ArmJoint_h

#include <iostream>
#include <stddef.h>

#include "RobotArmJoint.h"
#include "ros/ros.h"
#include "uml_to_ros/ArmJoint_Arm_MaxPosition.h"
#include "uml_to_ros/ArmJoint_Arm_MinPosition.h"
#include "uml_to_ros/ArmJoint_Arm_Position.h"
#include "uml_to_ros/ArmJoint_Arm_move.h"

class ArmJoint  : public RobotArmJoint {
protected:

public:
      ArmJoint(  );
      ~ArmJoint(  );
};

static ArmJoint obj_ArmJoint;


#endif
