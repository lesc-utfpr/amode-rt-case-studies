

 #include "ItemReader.h" 


//     ItemReader::ItemReader(    Conveyor* _Conveyor   ) { 
     ItemReader::ItemReader(       ) { 
     // Variables
     
     // Actions
               // __Conveyor = _Conveyor;
               // TimingAttributes.SetTimingAttributes     
               // PeriodicTiming.SetPeriod     
     }
//     Conveyor*  ItemReader::getConveyor(  ) { 
//     // Variables
//     
//     // Actions
//          return  __Conveyor ;     
//     }
//     void  ItemReader::setConveyor(    Conveyor* _Conveyor   ) { 
//     // Variables
//     
//     // Actions
//          __Conveyor = _Conveyor;     
//     }
     void  ItemReader::run(  ) { 
     // Variables
     
     // Actions
               // TaskMigration.Migrate
               Value = readSensor();
               // TODO publish new value
               //__Conveyor->setItem(Value);     
               // PeriodicTiming.FrequencyControl     
     }
     int  ItemReader::readSensor(  ) { 
     // Variables
     
     // Actions
          //int r = 0; //rand();
          ROS_INFO("ItemReader.readSensor() = %d", Value);
          return  Value;     
     }
     int  ItemReader::getValue(  ) { 
     // Variables
     
     // Actions
          return  Value ;     
     }
     ItemReader:: ~ItemReader(  ) { 
     // Variables
     
     // Actions
          
     } 

