

 #include "Gripper.h" 


     bool  Gripper::isOpen(  ) { 
     // Variables
     
     // Actions
          return  _Open ;     
     }
     void  Gripper::open(  ) { 
     // Variables
     
     // Actions
          _Open = true;     
     }
     void  Gripper::close(  ) { 
     // Variables
     
     // Actions
          _Open = false;     
     }
     void  Gripper::run(  ) { 
     // Variables
     
     // Actions
            ROS_INFO("Gripper - init");
            ros::Rate loop_rate(2); // 500 ms period
            while (ros::ok()) {
                // TaskMigration.Migrate
                if ( _Open == true  ) { 
                    applyValue(1); 
                }  else { 
                    if ( _Open == false ) { 
                         applyValue(0);      
                    }      
                }     
                // PeriodicTiming.FrequencyControl     
                ros::spinOnce();
                loop_rate.sleep();
            }
            ROS_INFO("Gripper - finish");
         
               
     }
     void  Gripper::applyValue(    int v   ) { 
     // Variables
     
     // Actions
          ROS_INFO("Gripper - aplicando valor %d", v );
     }
     Gripper::Gripper(  ) { 
     // Variables
     
     // Actions
          
               // TimingAttributes.SetTimingAttributes     
               // PeriodicTiming.SetPeriod     
     }
     Gripper:: ~Gripper(  ) { 
     // Variables
     
     // Actions
          
     } 

int main(int argc, char **argv) {
  ros::init(argc, argv, "Gripper_Gripper");
  ros::NodeHandle rn_Gripper_Gripper;
    
 
// Published/subscribed topics
    /* Message format. Copy/paste the next lines into a file named Gripper_Gripper_MaxPosition.msg 
         bool Open
    */
    ros::Publisher pub_Gripper_Gripper__Open = rn_Gripper_Gripper.advertise<uml_to_ros::Gripper_Gripper__Open>("Gripper_Gripper__Open", 1000);
    
// Provided services
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         ---
         # response data
         int32 ret     
    */
    ros::ServiceServer srv_Gripper_Gripper_open = rn_Gripper_Gripper.advertiseService("Gripper_Gripper_open", srv_Gripper_open);
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         ---
         # response data
         int32 ret     
    */
    ros::ServiceServer srv_Gripper_Gripper_close = rn_Gripper_Gripper.advertiseService("Gripper_Gripper_close", srv_Gripper_close);

// Requested services

// remaining code
    obj_Gripper.run(  );

  return 0;
}