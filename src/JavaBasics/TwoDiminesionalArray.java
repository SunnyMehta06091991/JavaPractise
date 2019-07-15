package JavaBasics;

public class TwoDiminesionalArray {

	public static void main(String[] args) {
		//s.length ---> It gives total number of rows.
		//s[0].length ---> It gives total number of columns.
		String s[][] = new String [3][5];
		System.out.println(s.length);
		System.out.println(s[0].length);
		
		s[0][0] = "Sun";
		s[0][1] = "Moon";
		s[0][2] = "Stars";
		s[0][3] = "Sky";
		s[0][4] = "Black";
		s[1][0] = "Sunn";
		s[1][1] = "Moonn";
		s[1][2] = "Starsn";
		s[1][3] = "Skyn";
		s[1][4] = "Blackn";
		s[2][0] = "Sunnn";
		s[2][1] = "Moonnn";
		s[2][2] = "Starsnn";
		s[2][3] = "Skynn";
		s[2][4] = "Blacknn";

		for(int i = 0 ; i < s.length ; i++){
			for(int j = 0 ; j < s[i].length ; j++){
				System.out.println(s[i][j]);
			}
		}
		
		

	}
}
