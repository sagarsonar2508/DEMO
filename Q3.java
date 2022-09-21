package Lab2;

import java.util.Scanner;

//WAP to find  ASCII value of a character .//
public class Q3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char inp = s.nextLine().charAt(0);
		int ASCII = (int)inp;
		System.out.println("ASCII value of "+"inp" +"= " + ASCII);
		System.out.println("upper case value = "+(char)(inp-32)); //For upper case
		s.close();
	}
}
