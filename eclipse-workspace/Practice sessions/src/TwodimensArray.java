

public class TwodimensArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i[][] = new int[3][4]; //three rows & 4 columns
		
		//1st row values
		
		i[0][0] = 10;
		i[0][1] = 20;
		i[0][2] = 30;
		i[0][3] = 40;
		
		i[1][0] = 50;
		i[1][1] = 60;
		i[1][2] = 70;
		i[1][3] = 80;
		
		i[2][0] = 90;
		i[2][1] = 100;
		i[2][2] = 100;
		i[2][3] = 140;
		
	
		
		System.out.println(i[0][3]);
		
		System.out.println(i.length);  // to get the size of row
		System.out.println(i[0].length);  //to get the size of column
		System.out.println(i[0][3]);
		
		for (int row=0; row<i.length;row++) {
			for(int col=0;col<i[0].length;col++){
	        System.out.println(i[row][col]);
		}
		}	

		

	}

}
