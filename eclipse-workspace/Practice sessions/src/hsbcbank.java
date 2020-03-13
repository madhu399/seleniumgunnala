
public class hsbcbank implements Usbank{

		
	      //if a child is implementing any interface , then its mandatory to define/override all methods
	     //of interface
	public void credit() {
		System.out.println("hsbacbank...credit");
	}

    public void debit() {
		
		System.out.println("hsbcbank ..debit");
	}
    
    public void moneytranfer() {
	
	System.out.println("hsbcbank ..moneytranfer");
    }
	
    public void eduloan() {
		
		System.out.println("hsbcbank ..eduloan");
	}
	
	
	
}
