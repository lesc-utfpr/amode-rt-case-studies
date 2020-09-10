

 #include "ProductPart.h" 


     ProductPart::ProductPart(  ) { 
     // Variables
     
     // Actions
          
     }
     ProductPart:: ~ProductPart(  ) { 
     // Variables
     
     // Actions
          
     } 




//    int main(int argc, char **argv) {
//      ros::init(argc, argv, "ProductPart_ProductPart");
//      ros::NodeHandle rn_ProductPart_ProductPart;
//
//
//    // Published/subscribed topics
//        /* Message format. Copy/paste the next lines into a file named ProductPart_ProductPart_ID.msg 
//             int32 ID
//        */
//        // publisher
//        obj_ProductPart.pub_ID = rn_ProductPart_ProductPart.advertise<uml_to_ros::ProductPart_ProductPart_ID>("ProductPart_ProductPart_ID", 1000);
//        // subscriber
//        obj_ProductPart.sub_ID = rn_ProductPart_ProductPart.subscribe("ProductPart_ProductPart_ID", 1000, &ProductPart::topic_ProductPart_ProductPart_ID_call_back, &obj_ProductPart);
//
//    // Provided services
//
//    // Requested services
//
//    // remaining code
//        ROS_INFO("ProductPart node - init" );
//
//        ros::spin();
//
//        ROS_INFO("ProductPart node - finish" );
//
//      return 0;
//    }