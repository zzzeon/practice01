package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int x;
		int y=0;
		
		System.out.print("숫자를 입력하세요 : ");
		x= scanner.nextInt();
		
		scanner.close();
		
		if (x%2==0) {
			for (int i = 1; i <= x; i++) {
				if (i%2==0) {
					y+=i;
				}
			}
			System.out.println("결과 값 : "+y);
		}
		
		else {
			for (int i = 1; i <= x; i++) {
				if (i%2!=0) {
					y+=i;
				}
			}
			System.out.println("결과 값 : "+y);
		}
	}

}
