package oops2;

public class Testinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		hsbcbank hs = new hsbcbank();
		
		hs.credit();
		hs.debit();
		hs.moneytranfer();
		hs.eduloan();
		
			
	Usbank us = new hsbcbank();
		   //dynamic polymorphism
		
	us.credit();
	us.debit();
	us.moneytranfer();
	
	
	System.out.println(Usbank.min_bal);	///u can access by parent interface only.
		
	}

}
