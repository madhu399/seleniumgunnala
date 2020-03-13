
public interface Usbank {

	
    int min_bal = 100; ////u can't chenge the vvar value .its static .once defined its final.
	
	public void credit() ;  // u don't defien method body in interface
		
    public void debit() ;
    
    public void moneytranfer(); 
	
       //only method declaration ..no method body
       //u can declare variables but tey r static ...u can't change it its final.
       //no static methods.   ..but heard java8 allows static methods.
       //interfaces r abstract in nature...we can't create object of interface
	
}
