#ifndef Item_h
#define Item_h

class Item {
protected:
     int ID;

public:
      virtual   void  setID(    int _ID   );
      virtual   int  getID(  );
      Item(  );
      ~Item(  );
};

#endif
