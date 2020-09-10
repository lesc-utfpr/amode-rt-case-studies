#ifndef RobotArmJoint_h
#define RobotArmJoint_h

#include "ros/ros.h"

class RobotArmJoint {
protected:
     int MaxPosition;
     int MinPosition;
     int Position;

      virtual   void  internalMove(    int newPos   );
    
public:
    ros::Publisher pub_MaxPosition;
    //ros::Subscriber MaxPosition_sub;
    ros::Publisher pub_MinPosition;
    //ros::Subscriber MinPosition_sub;
    ros::Publisher pub_Position;
    //ros::Subscriber Position_sub;
    
      virtual   void  move(    int newPos   );
      virtual   int  getMaxPosition(  );
      virtual   int  getMinPosition(  );
      virtual   int  getPosition(  );
      virtual   void  run(  );
      RobotArmJoint(  );
      ~RobotArmJoint(  );
};


#endif
