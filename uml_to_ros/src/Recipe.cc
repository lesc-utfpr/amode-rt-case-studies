

 #include "Recipe.h" 


     ProductPart*  Recipe::getParts(    int index   ) { 
     // Variables
     
     // Actions
          return  Parts[index] ;     
     }
     void  Recipe::setParts(    int index  ,  ProductPart* _Parts   ) { 
     // Variables
     
     // Actions
          Parts[index] = _Parts;
     }
     int  Recipe::getPartsCount(  ) { 
     // Variables
     
     // Actions
          return  0 ;     
     }
     ProductPart*  Recipe::getPart(    int index   ) { 
     // Variables
     
     // Actions
          return  0 ;     
     }
     bool  Recipe::isPartOfRecipe(    ProductPart* p   ) { 
     // Variables
     
     // Actions
          return  1 ;     
     }
     Recipe::Recipe(  ) { 
     // Variables
     
     // Actions
          
     }
     Recipe:: ~Recipe(  ) { 
     // Variables
     
     // Actions
          
     } 

