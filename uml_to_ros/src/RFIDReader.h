#ifndef RFIDReader_h
#define RFIDReader_h

#include <iostream>
#include <stdlib.h>
#include <stddef.h>
#include "ros/ros.h"

#include "ItemReader.h"

#include "uml_to_ros/RFIDReader_RFIDReader_Value.h"
#include "uml_to_ros/Conveyor_Conveyor_setItem.h"

class RFIDReader  : public ItemReader {
protected:

public:
     ros::Publisher pub_Value;
     ros::Subscriber sub_Value;
     void topic_RFIDReader_RFIDReader_Value_call_back(const
                        uml_to_ros::RFIDReader_RFIDReader_Value::ConstPtr& msg);

     void  run(  );
     RFIDReader(  );
     ~RFIDReader(  );
};

static RFIDReader obj_RFIDReader;

void RFIDReader::topic_RFIDReader_RFIDReader_Value_call_back(const
                        uml_to_ros::RFIDReader_RFIDReader_Value::ConstPtr& msg) {
    Value = msg->Value;
    ROS_INFO("NEW Value = %d", msg->Value);
}

#endif
