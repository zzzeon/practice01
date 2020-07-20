package practice01;

public class Prob05 {

	public static void main(String[] args) {
		String a;
		String b="";
		int x, y, z;
		
		for (int i = 1; i < 100; i++) {
			a = Integer.toString(i);
			
			x = a.indexOf("3");
			y = a.indexOf("6");
			z = a.indexOf("9");
			
			if (x>=0) b+="짝";
			if (y>=0) b+="짝";
			if (z>=0) b+="짝";
			
			if (b!="") {
				System.out.println(i+b);
			}
			
			b="";
		}
	}
}
