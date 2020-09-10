

 #include "RFIDReader.h" 


     RFIDReader::RFIDReader(  ) : ItemReader( ) { 
     // Variables
     
     // Actions
          
     }
     RFIDReader:: ~RFIDReader(  ) { 
     // Variables
     
     // Actions
          
     }
     void  RFIDReader::run(  ) { 
     // Variables
     
     // Actions
                ROS_INFO("RFIDReader - init");
                ros::Rate loop_rate(0.2); // 5 s period
                while (ros::ok()) {
                    ROS_INFO("RFIDReader - loop - Current value = %d", Value);
                    
                    Value = readSensor();
                    // publish the new value from the sensor
                    uml_to_ros::RFIDReader_RFIDReader_Value msg;
                    msg.Value = Value;
                    pub_Value.publish(msg);
                    
                    uml_to_ros::Conveyor_Conveyor_setItem Conveyor_setItem;
                    Conveyor_setItem.request.ID = Value;
                    if ( ros::service::call("Conveyor_Conveyor_setItem", Conveyor_setItem) ) {
                        ROS_INFO("Service call to Conveyor.setItem(%d) successfull!", Conveyor_setItem.request.ID);
                    }
                    else {
                        ROS_ERROR("Failed to call service Conveyor.setItem(%d).");
                    }
                    
                    // PeriodicTiming.FrequencyControl     
                    ros::spinOnce();
                    loop_rate.sleep();
                }
                ROS_INFO("RFIDReader - finish");
               // TaskMigration.Migrate   
     }



int main(int argc, char **argv) {
  ros::init(argc, argv, "RFIDReader_RFIDReader");
  ros::NodeHandle rn_RFIDReader_RFIDReader;
    
 
// Published/subscribed topics
    /* Message format. Copy/paste the next lines into a file named RobotArmPosition_RobotArmPosition_WristPosition.msg 
         int32 WristPosition
    */
    // publisher
    obj_RFIDReader.pub_Value = rn_RFIDReader_RFIDReader.advertise<uml_to_ros::RFIDReader_RFIDReader_Value>("RFIDReader_RFIDReader_Value", 1000);
    // subscriber
    obj_RFIDReader.sub_Value = rn_RFIDReader_RFIDReader.subscribe("RFIDReader_RFIDReader_Value", 1000, &RFIDReader::topic_RFIDReader_RFIDReader_Value_call_back, &obj_RFIDReader);

// Provided services

// Requested services

// remaining code
    ROS_INFO("RobotArmPosition node - init" );

    //ros::spin();
    obj_RFIDReader.run();
    
    ROS_INFO("RobotArmPosition node - finish" );

  return 0;
}