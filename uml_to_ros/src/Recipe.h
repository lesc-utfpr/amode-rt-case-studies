#ifndef Recipe_h
#define Recipe_h

#include "ProductPart.h"

class Recipe {
protected:
     ProductPart* Parts[];

public:
      virtual   ProductPart*  getParts(    int index   );
      virtual   void  setParts(    int index  ,  ProductPart* _Parts   );
      virtual   int  getPartsCount(  );
      virtual   ProductPart*  getPart(    int index   );
      virtual   bool  isPartOfRecipe(    ProductPart* p   );
      Recipe(  );
      ~Recipe(  );
};

#endif
