

 #include "StorageUnit.h" 


     StorageUnit::StorageUnit(  ) { 
     // Variables
     
     // Actions
         /*
          // MemoryUsageMonitoring.IncreaseMemoryUsage     
          Compartments[0] = new StorageCompartment();
          // MemoryUsageMonitoring.IncreaseMemoryUsage     
          Compartments[1] = new StorageCompartment();
          // MemoryUsageMonitoring.IncreaseMemoryUsage     
          Compartments[2] = new StorageCompartment();
          // MemoryUsageMonitoring.IncreaseMemoryUsage     
          Compartments[3] = new StorageCompartment();     
          */
     }
     int  StorageUnit::getPosition(    ProductPart* part   ) { 
     // Variables
     
     // Actions
        int i = 0;
        int count = 0;
        int id = -1; 
        
        uml_to_ros::StorageCompartment_StorageCompartment_getActualLoad srv;
        if ( ros::service::call("StorageCompartment_StorageCompartment_getActualLoad", srv) ) {
            count = srv.response.ret;
            
            uml_to_ros::StorageCompartment_StorageCompartment_getProductParts gpp_srv;
            gpp_srv.request.index = i;
            if ( ros::service::call("StorageCompartment_StorageCompartment_getProductParts", gpp_srv) ) {
                id = gpp_srv.response.ret;
                if ( id == part->getID() )
                        return i;
            }
            else {
                ROS_ERROR("Failed to call service StorageCompartment.getProductParts(%d).", i);
                return -1;
            }
            for(i=1; (i < count) && (id != -1) && (id != part->getID()); i++) {
                gpp_srv.request.index = i;
                if ( ros::service::call("StorageCompartment_StorageCompartment_getProductParts", gpp_srv) ) {
                    id = gpp_srv.response.ret;
                    if ( id == part->getID() )
                        return i;
                }
                else {
                    id = -1;
                    ROS_ERROR("Failed to call service StorageCompartment.getProductParts(%d).", i);
                }
            }
            if ((i < count) && (id != -1))
                return id;
        }
        else {
            ROS_ERROR("Failed to call service StorageCompartment.getActualLoad().");
        }
        return  -1;     
     }
     StorageUnit:: ~StorageUnit(  ) { 
     // Variables
     
     // Actions
          
     } 


int main(int argc, char **argv) {
  ros::init(argc, argv, "StorageUnit_StorageUnit");
  ros::NodeHandle rn_StorageUnit_StorageUnit;
    
 
// Published/subscribed topics
    /* Message format. Copy/paste the next lines into a file named RobotArmPosition_RobotArmPosition_WristPosition.msg 
         int32 WristPosition
    */
    // publisher
    // subscriber
    
// Provided services
    /* Service Input/Output parameters. Copy/paste these lines in a *.srv file.
         # request input data
         int32 ID
         ---
         # response data
         int32 ret
         
    */
    ros::ServiceServer srv_StorageUnit_StorageUnit_getPosition = rn_StorageUnit_StorageUnit.advertiseService("StorageUnit_StorageUnit_getPosition", srv_StorageUnit_getPosition);
    
// Requested services

// remaining code
    ROS_INFO("StorageCompartment node - init" );

    ros::spin();
    
    ROS_INFO("StorageCompartment node - finish" );

  return 0;
}