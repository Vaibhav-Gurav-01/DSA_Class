package javapackage;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Value of a: ");
		int a = sc.nextInt();

		System.out.println("Enter Value of b: ");
		int b = sc.nextInt();

		Programm1 obj = new Programm1();
		obj.show(a, b);
	}
}
