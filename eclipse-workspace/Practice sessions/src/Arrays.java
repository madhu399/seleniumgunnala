
public class Arrays {

	public static void main(String[] args) {
		
		//lowest index =0
		//upper index = n-1[n is size of array]
		
		
		//disadvantages of array are//
		     //1.fixed size.------to overcome this issue----we use collections---arraylist,hashtable 
		      //2.same data types------to over come this issue---we use object array --obj[]
		

		//1.int array
		int i[] =new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		
		System.out.println(i[0]);
		System.out.println(i.length);
		
		//to print all valuesin array use for loop allways
		
		for(int j =0;j<5;j++) {
			System.out.println(i[j]);
		}
		
		//char array
		
		char c[] = new char[4];
		
			c[0] = 'm';
			c[1] = 's';			
			System.out.println(c[0]);
			System.out.println(c.length);
			
			//string array
			
   	  String s[] = new String[2];
	   s[0] = "madhu";
	   s[1] = "srithan";
	   System.out.println(s[1]);
		System.out.println(i.length);
		
		//object Array; object is class
		
		Object obj[] = new Object[4];
		obj[0] = "srithan";
		obj[1] = 31;		
		obj[2] = 5.7;
		obj[3] = "07/31/2005";
		
		System.out.println(obj[3]);
		System.out.println(obj.length);
		
		
		
		
		
	}

}
