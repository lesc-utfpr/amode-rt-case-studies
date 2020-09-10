#ifndef Product_h
#define Product_h

#include "Item.h"
#include "Recipe.h"

class Product  : public Item {
protected:
     Recipe* __Recipe;

public:  
      virtual   Recipe*  getRecipe(  );
      virtual   void  setRecipe(    Recipe* _Recipe   );
    
      Product(    Recipe* _Recipe   );  
      ~Product(  );
};

#endif
