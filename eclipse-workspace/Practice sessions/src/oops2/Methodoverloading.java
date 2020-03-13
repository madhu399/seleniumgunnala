package oops2;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Methodoverloading obj = new Methodoverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10,20);
		obj.sum(20,30);
					
	}
     
	      //Methodoverloading -- having same name method with diff parameters. 
	    //same method name with diff input parameters & diff datatypes is allowed.
	    //u can overload  a main method too.
	
	      //cannot create same duplicate methods ---same method with same no of parameters .ex:sum(i) & sum(i) etc
		  // cannot create a method inside a method.
	
	
	    public void sum(){
		System.out.println("sum");	
		}
	
	public void sum(int i){
		System.out.println(i);	
		}
	
	public void sum(int i, int j){
		System.out.println("sum of i  & j");
		System.out.println(i+j);
		}

			
	
}
