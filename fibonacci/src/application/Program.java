package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		while (x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
			} else {
				x = 3 * x + 1;
			}
			System.out.print(x + " -> ");
		}

		sc.close();
	}
}
