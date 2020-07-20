package practice01;

import java.util.Scanner;

public class Prob02 {
	public static void main(String[] args) {
		int x;
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
				x=i+j;
				System.out.print(x+" ");
			}
			System.out.print("\n");
		}
	}

}