#ifndef ItemReader_h
#define ItemReader_h


#include <iostream>
#include <stdlib.h>
#include <stddef.h>
#include "ros/ros.h"

//#include "uml_to_ros/RobotArmPosition_RobotArmPosition_WristPosition.h"
//#include "uml_to_ros/RobotArmPosition_RobotArmPosition_ShoulderPosition.h"
//#include "uml_to_ros/RobotArmPosition_RobotArmPosition_RotaryShoulderPosition.h"
//#include "uml_to_ros/RobotArmPosition_RobotArmPosition_ArmPosition.h"

//class ItemReader;
//class Conveyor; // forward declaration
//#include "Conveyor.h"

class ItemReader {
protected:
//     Conveyor* __Conveyor;
     int Value;

      virtual   int  readSensor(  );
public:
      //virtual   Conveyor*  getConveyor(  );
      //virtual   void  setConveyor(    Conveyor* _Conveyor   );
      virtual   void  run(  );
      virtual   int  getValue(  );

      //ItemReader(    Conveyor* _Conveyor   );
      ItemReader(  );
      ~ItemReader(  );
};

#endif
