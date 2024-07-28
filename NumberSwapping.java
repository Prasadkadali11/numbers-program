package numbersprogramming;

public class NumberSwapping {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("Before Swapping Values");
		System.out.println("a value is : "+a+" and b value is : "+b);
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("after Swapping Values");
		System.out.println("a value is : "+a+" and b value is : "+b);
		

	}

}
