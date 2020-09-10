

 #include "Product.h" 


     Product::Product(    Recipe* _Recipe   ) { 
     // Variables
     
     // Actions
          __Recipe = _Recipe;     
     }
     Recipe*  Product::getRecipe(  ) { 
     // Variables
     
     // Actions
          return  __Recipe ;     
     }
     void  Product::setRecipe(    Recipe* _Recipe   ) { 
     // Variables
     
     // Actions
          __Recipe = _Recipe;     
     }
     Product:: ~Product(  ) { 
     // Variables
     
     // Actions
          
     } 

