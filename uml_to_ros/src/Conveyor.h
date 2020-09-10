#ifndef Conveyor_h
#define Conveyor_h

#include <iostream>
#include <stdlib.h>
#include <stddef.h>
#include "ros/ros.h"

//#include "RobotArmPosition.h"
#include "Item.h"
#include "ProductPart.h"

//class ItemReader; // forward declaration?!?

#include "uml_to_ros/Conveyor_Conveyor_moveForward.h"
#include "uml_to_ros/Conveyor_Conveyor_moveBackward.h"
#include "uml_to_ros/Conveyor_Conveyor_stop.h"
#include "uml_to_ros/Conveyor_Conveyor_isItemDetected.h"
#include "uml_to_ros/Conveyor_Conveyor_getPosition.h"
#include "uml_to_ros/Conveyor_Conveyor_getItem.h"
#include "uml_to_ros/Conveyor_Conveyor_setItem.h"

enum MovingDirection { MOVING_FORWARD, MOVING_BACKWARD, STOPPED };

class Conveyor {
protected:
     MovingDirection State;
/*
     ItemReader* ItemDetector;
     RobotArmPosition* ItemPosition;
*/     
     Item* DetectedItem;
    
      virtual   void  internalMoveForward(  );
      virtual   void  internalMoveBackward(  );
      virtual   void  internalStop(  );    
public:
/*
      virtual   ItemReader*  getItemDetector(  );
      virtual   void  setItemDetector(    ItemReader* _ItemDetector   );
      virtual   Item*  getDetectedItem(  );
      virtual   void  setDetectedItem(    Item* _DetectedItem   );
*/
      virtual   void  moveForward(  );
      virtual   void  moveBackward(  );
      virtual   void  stop(  );
      virtual   bool  isItemDetected(  );
//      virtual   RobotArmPosition*  getPosition(  );
      virtual   int  getPosition(  );
      virtual   int  getItem(  );
      virtual   int  setItem(    int ID   );
      virtual   void  run(  );

//      Conveyor(    ItemReader* _ItemDetector  ,  Item* _DetectedItem   );
      Conveyor(  );
      ~Conveyor(  );
};


static Conveyor obj_Conveyor;

bool srv_Conveyor_moveForward(  uml_to_ros::Conveyor_Conveyor_moveForward::Request  &req,
                                uml_to_ros::Conveyor_Conveyor_moveForward::Response &res) {
    
    ROS_INFO("Service call: Conveyor.moveForward()");
    
    obj_Conveyor.moveForward( );
    res.ret = 0;
    
    return true;
}

bool srv_Conveyor_moveBackward(  uml_to_ros::Conveyor_Conveyor_moveBackward::Request  &req,
                                uml_to_ros::Conveyor_Conveyor_moveBackward::Response &res) {
    
    ROS_INFO("Service call: Conveyor.moveBackward()");
    
    obj_Conveyor.moveBackward( );
    res.ret = 0;
    
    return true;
}

bool srv_Conveyor_stop(  uml_to_ros::Conveyor_Conveyor_stop::Request  &req,
                                uml_to_ros::Conveyor_Conveyor_stop::Response &res) {
    
    ROS_INFO("Service call: Conveyor.stop()");
    
    obj_Conveyor.stop( );
    res.ret = 0;
    
    return true;
}


bool srv_Conveyor_isItemDetected(  uml_to_ros::Conveyor_Conveyor_isItemDetected::Request  &req,
                                uml_to_ros::Conveyor_Conveyor_isItemDetected::Response &res) {
    
    ROS_INFO("Service call: Conveyor.isItemDetected()");
    res.ret = obj_Conveyor.isItemDetected( );
    
    return true;
}

bool srv_Conveyor_getPosition(  uml_to_ros::Conveyor_Conveyor_getPosition::Request  &req,
                                uml_to_ros::Conveyor_Conveyor_getPosition::Response &res) {
    
    ROS_INFO("Service call: Conveyor.getPosition()");
    res.ret = obj_Conveyor.getPosition( );;
    
    return true;
}

bool srv_Conveyor_getItem(  uml_to_ros::Conveyor_Conveyor_getItem::Request  &req,
                                uml_to_ros::Conveyor_Conveyor_getItem::Response &res) {
    
    ROS_INFO("Service call: Conveyor.getItem()");
    res.ret = obj_Conveyor.getItem( );
    
    return true;
}

bool srv_Conveyor_setItem(  uml_to_ros::Conveyor_Conveyor_setItem::Request  &req,
                                uml_to_ros::Conveyor_Conveyor_setItem::Response &res) {
    
    ROS_INFO("Service call: Conveyor.setItem(%d)", req.ID);
    res.ret = obj_Conveyor.setItem( req.ID );
    
    return true;
}

#endif
