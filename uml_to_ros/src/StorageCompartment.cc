

 #include "StorageCompartment.h" 


     StorageCompartment::StorageCompartment(  ) { 
     // Variables
     
     // Actions
               // MemoryUsageMonitoring.IncreaseMemoryUsage     
//               LoadDetector = new ItemReader( NULL );
               // MemoryUsageMonitoring.IncreaseMemoryUsage     
//               ArmPosition = new RobotArmPosition();
               // TimingAttributes.SetTimingAttributes     
               // PeriodicTiming.SetPeriod
             MaxCapacity = MAX_PARTS;
             PartsCount = 0;
     }
     ProductPart*  StorageCompartment::getProductParts(    int index   ) { 
     // Variables
     
     // Actions
            if ( (index >= 0) && (index < MAX_PARTS) )
                return  ProductParts[index];
            else
                return NULL;
     }
     void  StorageCompartment::setProductParts(    int index  ,  ProductPart* _ProductParts   ) { 
     // Variables
     
     // Actions
            if ( (index >= 0) && (index < MAX_PARTS) )
                if ( ProductParts[index] != NULL) {
                    *ProductParts[index] = *_ProductParts;
                    ROS_INFO("StorageCompartment - UPDATE Part ID = %d", ProductParts[index]->getID() );
                }
                else {
                    ProductParts[index] = new ProductPart(); 
                    *ProductParts[index] = *_ProductParts;
                    ROS_INFO("StorageCompartment - NEW Part ID = %d", ProductParts[index]->getID() );
                    PartsCount = PartsCount + 1;
                }
     }
     int  StorageCompartment::getActualLoad(  ) { 
     // Variables
     
     // Actions
          return  PartsCount ;     
     }
     void  StorageCompartment::run(  ) { 
     // Variables
          int value;     
     // Actions
            ROS_INFO("StorageCompartment - init");
            ros::Rate loop_rate(2); // 500ms period
            while (ros::ok()) {
                ROS_INFO("StorageCompartment - loop - Actual load = %d", getActualLoad() );
                ROS_INFO("StorageCompartment - loop - Parts Count = %d", PartsCount );
                
               // TaskMigration.Migrate
                
                // subscribe 
                // LoadDetector->getValue() replaced by the variable associated
                // with the topic subscription
                value = RFIDReader_LoadDetector_Value; 
                
                if ( value == 0 ) { 
                    Empty = true;
                }  else {
                    ROS_INFO("StorageCompartment - loop - RFID DETECTADO = %d", value );
                    Empty = false;      
                }     
                                
                // PeriodicTiming.FrequencyControl     
                ros::spinOnce();
                loop_rate.sleep();
            }
            ROS_INFO("StorageCompartment - finish");

     }
     StorageCompartment:: ~StorageCompartment(  ) { 
     // Variables
     
     // Actions
          
     } 

int main(int argc, char **argv) {
  ros::init(argc, argv, "StorageCompartment_StorageCompartment");
  ros::NodeHandle rn_StorageCompartment_StorageCompartment;
    
 
// Published/subscribed topics
    /* Message format. Copy/paste the next lines into a file named RobotArmPosition_RobotArmPosition_WristPosition.msg 
         int32 WristPosition
    */
    // publisher
    // subscriber
    obj_StorageCompartment.sub_RFIDReader_LoadDetector = rn_StorageCompartment_StorageCompartment.subscribe("RFIDReader_RFIDReader_Value", 1000, &StorageCompartment::topic_RFIDReader_LoadDetector_call_back, &obj_StorageCompartment);

// Provided services
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         int32 index
         int32 ID
         ---
         # response data
         int32 ret
         
    */
    ros::ServiceServer srv_StorageCompartment_StorageCompartment_setProductParts = rn_StorageCompartment_StorageCompartment.advertiseService("StorageCompartment_StorageCompartment_setProductParts", srv_StorageCompartment_setProductParts);
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         int32 index
         ---
         # response data
         int32 ret
         
    */
    ros::ServiceServer srv_StorageCompartment_StorageCompartment_getProductParts = rn_StorageCompartment_StorageCompartment.advertiseService("StorageCompartment_StorageCompartment_getProductParts", srv_StorageCompartment_getProductParts);
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         ---
         # response data
         int32 ret
         
    */
    ros::ServiceServer srv_StorageCompartment_StorageCompartment_getActualLoad = rn_StorageCompartment_StorageCompartment.advertiseService("StorageCompartment_StorageCompartment_getActualLoad", srv_StorageCompartment_getActualLoad);
    
// Requested services

// remaining code
    ROS_INFO("StorageCompartment node - init" );

    //ros::spin();
    obj_StorageCompartment.run();
    
    ROS_INFO("StorageCompartment node - finish" );

  return 0;
}