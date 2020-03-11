package oops1;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//all of below non static methods/functions get stored in  new Functions() object
		//we can call by objrefernce.
		
		Functions obj = new Functions();   ///to call methods/functions store in an object & then u can call functions.
		
		obj.test();
		obj.add();
		int c = obj.add();
		System.out.println(c);
		
		int k = obj.div(40, 2);
		System.out.println(k);
		
		
		obj.qa();
		String s = obj.qa();
		System.out.println('s');
		
	}

	
	//non static methods
	
	//void does not return any value 
	
	public void test() {
		System.out.println("test method");
	  }
	
	//return type is int 
	public int add() {    //no input but some output
		System.out.println("add method");
		int a =10;
		int b= 20;
		int c= a+b;
		
		return c;
    	}

	//x,y are input parameters 
		public int div(int x,int y) {    //no input but some output
			System.out.println("div method");
			
			int d =x/y;
			return d;
		}	
	
		//return type is string 
		public String qa() {    //no input but some output
			System.out.println("qa method");
			String s ="selenium";
			return s;
		}
			
}
