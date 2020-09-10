

 #include "RobotArmJoint.h" 


     void  RobotArmJoint::internalMove(    int newPos   ) { 
     // Variables
          int pos;
     // Actions
          if (newPos != Position) {
              pos = Position + newPos;
              if ( (pos < getMaxPosition()) && (pos > getMinPosition()) ) { 
                  ROS_INFO("RobotArmJoint.internalMove() - NEW - Position = %d", pos);
                  Position = pos;
              }
              else {
                  ROS_INFO("RobotArmJoint.internalMove() - INVALID - Position = %d [%d, %d]", pos, MinPosition, MaxPosition);
              }
          }
      }
     void  RobotArmJoint::move(    int newPos   ) { 
     // Variables
     
     // Actions
          internalMove( newPos );
     }
      int  RobotArmJoint::getMaxPosition(  ) { 
     // Variables
     
     // Actions
          return  MaxPosition ;     
     }
      int  RobotArmJoint::getMinPosition(  ) { 
     // Variables
     
     // Actions
          return  MinPosition ;     
     }
      int  RobotArmJoint::getPosition(  ) { 
     // Variables
     
     // Actions
          return  Position ;     
     }
      void  RobotArmJoint::run(  ) { 
     // Variables
     
     // Actions
                ROS_INFO("RobotArmJoint - init");
                ros::Rate loop_rate(2); // 500 ms period
                while (ros::ok()) {
                    ROS_INFO("RobotArmJoint - loop - Current position = %d", Position);
                    move(Position);
                    // PeriodicTiming.FrequencyControl     
                    ros::spinOnce();
                    loop_rate.sleep();
                }
                ROS_INFO("RobotArmJoint - finish");
               // TaskMigration.Migrate   
     }
      RobotArmJoint::RobotArmJoint(  ) { 
     // Variables
     
     // Actions
               // TimingAttributes.SetTimingAttributes     
               // PeriodicTiming.SetPeriod     
     }
      RobotArmJoint:: ~RobotArmJoint(  ) { 
     // Variables
     
     // Actions
          
     } 

