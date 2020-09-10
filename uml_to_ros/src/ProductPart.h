#ifndef ProductPart_h
#define ProductPart_h

#include <iostream>
#include <stddef.h>
#include "ros/ros.h"

#include "Item.h"

//#include "uml_to_ros/ProductPart_ProductPart_ID.h"


class ProductPart  : public Item {
protected:

public: 
//    ros::Publisher pub_ID;
//    ros::Subscriber sub_ID;
//    void topic_ProductPart_ProductPart_ID_call_back(const
//                        uml_to_ros::ProductPart_ProductPart_ID::ConstPtr& msg);
    
    ProductPart(  );
    ~ProductPart(  );
};

static ProductPart obj_ProductPart;

//    void ProductPart::topic_ProductPart_ProductPart_ID_call_back(const
//                            uml_to_ros::ProductPart_ProductPart_ID::ConstPtr& msg){
//        ID = msg->ID;
//        ROS_INFO("NEW ID = %d", msg->ID);
//    }

#endif
