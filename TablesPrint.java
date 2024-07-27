package numbersprogramming;

import java.util.Scanner;

public class TablesPrint {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Please Enter any Digit No");
		int num;
		int i;
		String Option = "yes";
		String Opion = "yes";
		while( Option.equalsIgnoreCase(Opion)) {
			num = read.nextInt();
			for(i=1;i<20;i++) {
				System.out.println(num+" X "+i+" = "+(num*i));
				
			}System.out.println("if want one more table yes/no ?");
			Opion = read.next();
		}
		

	}

}
