package practice01;

import java.util.Scanner;

public class Prob04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		String a;
		int x;
		
		System.out.print("문자열을 입력하세요 : ");
		a= scanner.next();
		
		scanner.close();
		
		System.out.println(a);
		
		x=a.length();
		
		for (int i = 1; i <= x; i++) {
			System.out.println(a.substring(0, i));
		}
	}
}