package com.cg.daythree;
import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Employee name: ");
		String name = sc.nextLine();
		System.out.println("Employee name: "+name);
		System.out.println("Enployee id: "+id);

	}

}
