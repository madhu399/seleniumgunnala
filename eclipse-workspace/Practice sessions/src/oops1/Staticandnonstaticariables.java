package oops1;

public class Staticandnonstaticariables {
	
	//scope of global variables is they r avilable across all functions/methods with some conditions.
	//ststic can acess directly.
	//non sttaic can acess by creating an obj only. 
	
	
	  String Name = "madhavi";    //global variavles
	  static int age = 20;       //Gl Varia
	
	  public static void main(String[] args) {
		         // TODO Auto-generated method stub

	   		    //static variables u can call directly or by classname.
	   		
	            System.out.println(Staticandnonstaticariables.age);
	            	            
	            //how  to call static methods & varia
	            //1.direct calling;
	             sum();
	             
	             
	            //2.by classname
	             Staticandnonstaticariables.sum();
	             
	             
	             
	             
	             //how to call non static methods
	             
	             Staticandnonstaticariables obj = new Staticandnonstaticariables();  
	             obj.div();
	             obj.sum();  // obj can acesss but not a good practice.
	             System.out.println(obj.Name);  
	             //obj.age;  // u can't acess  static variable
	  }

	   	
	   public static void sum() {                            //static method,u can call directly or by classname
		        System.out.println("sum method");
			  	  	
	}
	
	   public void div() {                                    //non static method ,u have to call by obj reference only 
	        System.out.println("div method");   
	   
	   }
}
