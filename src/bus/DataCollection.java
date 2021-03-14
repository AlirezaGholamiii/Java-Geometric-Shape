package bus;
import java.util.ArrayList;

public class DataCollection {
	
	//-1- private static data
	//////////////////////////
	 private static  ArrayList<IShape2D>  listOfIShape2D = new  ArrayList<IShape2D>();	
	 
	 //-2- public static operations
	/////////////////////////////// 	 
     public static void add(IShape2D object)
	 {
		 listOfIShape2D.add(object );		 
	 }	 
	 
     public static void remove(String key)
	 {
		 //listOfICountables.remove(object);	
    	 for( IShape2D element : listOfIShape2D)
		 {
			                            //if(element.getSerialNumber() == key)	 
			 if(((Shape) element).getSerialNumber().equals(key))
			 {
				 listOfIShape2D.remove(element);	
				 System.out.println("Object with the Serial Number of " + key + " removed!");
			 }
		 }	
	 }	 
	
     public static void removeAt(int index)
	 {
		 listOfIShape2D.remove(index);		 
	 }	 
	 
	 public static void print()	 
	 {
		 for(IShape2D element : listOfIShape2D)
		 {
			 System.out.println(element);
			 
		 } 		 
	 } 	 
	  	 
	 //-search for a shape by serial number: unique identifier	 
	 public static IShape2D  search(String key)
	 {
			 for( IShape2D element : listOfIShape2D)
			 {
				    	 
				 if(((Shape) element).getSerialNumber().equals(key))
				 {
					 return element ;				 
				 }
			 }		 
	   return null;	   
	 }
	 
	 public static  ArrayList<IShape2D>   getICountableList()
	 {   
		   
	      return listOfIShape2D ;
		 
	 }
	 
	
	 
	 //Getting all the data relate to a special type  
	 
	 public static  ArrayList<Circle>   getCircle()
	 {
	   ArrayList<Circle>  listOfCircle = new ArrayList<Circle>();
		 
		   for( IShape2D element : listOfIShape2D)
		   {
			   if(element instanceof Circle)
			   {			   
				   listOfCircle.add(   ( Circle )  element   ) ; 
				   System.out.println();
			   }  	   
		   }
		   
	      return listOfCircle ;
		 
	 }
	 
	 public static  ArrayList<Square>   getSquare()
	 {
	   ArrayList<Square>  listOfSquare = new ArrayList<Square>();
		 
		   for( IShape2D element : listOfIShape2D)
		   {
			   if(element instanceof Square)
			   {			   
				   listOfSquare.add(   ( Square )  element   ) ;  	  
				   System.out.println();
			   }  	   
		   }	
		   
	      return listOfSquare ;
		 
	 }
	 
	}




































