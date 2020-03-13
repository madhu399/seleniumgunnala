package oops2;

public class callbyvalueandcallbyreference {

	
	
	int p = 50;  //using these global nonstatic variables for callbyrefrence
	int q =60;
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		callbyvalueandcallbyreference obj = new callbyvalueandcallbyreference();
		
		obj.testsum(20, 30);
		System.out.println(obj.testsum(20, 30));
		
		
		//call by refer
		obj.swap(obj);
		System.out.println(obj.p);
		
		
	}

			public int testsum(int a,int b) {
			 //a = 10;
			 //b = 20;
			
			int c = a + b;
			return c;
	
			}
	
	       //concept of callbyrefrence
			
			public void swap(callbyvalueandcallbyreference t) {
				 int temp;
				 temp = t.p;// t.p = 50
				 t.p= t.q;  //t.p =60
				 t.q = temp;  //t.q =50
			//System.out.println;	 
				
			}
			
	
		
	
	
}
