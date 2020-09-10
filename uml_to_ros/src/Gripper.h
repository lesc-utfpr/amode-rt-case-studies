#ifndef Gripper_h
#define Gripper_h

#include <iostream>
#include <stddef.h>
#include "ros/ros.h"

#include "uml_to_ros/Gripper_Gripper_open.h"
#include "uml_to_ros/Gripper_Gripper_close.h"
#include "uml_to_ros/Gripper_Gripper__Open.h"

class Gripper {
protected:
     bool _Open;
    
    virtual   void  applyValue(    int v   );
public:
      virtual   bool  isOpen(  );
      virtual   void  open(  );
      virtual   void  close(  );
      virtual   void  run(  );
      
      Gripper(  );
      ~Gripper(  );
};

static Gripper obj_Gripper;

bool srv_Gripper_open(  uml_to_ros::Gripper_Gripper_open::Request  &req,
                        uml_to_ros::Gripper_Gripper_open::Response &res) {
    
    ROS_INFO("Service call: Gripper.open()" );
    
    obj_Gripper.open();
    res.ret = 0;
    
    return true;
}

bool srv_Gripper_close( uml_to_ros::Gripper_Gripper_close::Request  &req,
                        uml_to_ros::Gripper_Gripper_close::Response &res) {
    
    ROS_INFO("Service call: Gripper.close()" );
    
    obj_Gripper.close();
    res.ret = 0;
    
    return true;
}

#endif
