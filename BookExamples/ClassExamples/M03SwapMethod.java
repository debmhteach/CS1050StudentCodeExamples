
//add comments to explain code

public class M03SwapMethod
{

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 82;

		System.out.println("Before Swap");
		System.out.println ("num1 = " + num1);
		System.out.println ("num2 = " + num2);

		swap(num1, num2);
		
		System.out.println("After Swap");
		System.out.println ("num1 = " + num1);                  
		System.out.println ("num2 = " + num2);
	} // main

	public static void swap (int num1, int num2) {
		
		System.out.println("   *** Start Swap ***");
		System.out.println("   Before:  num1 = " + num1 + "  num2 = " + num2);
		
		// Swap the values
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("   After:   num1 = " + num1 + " num2 = " + num2);
		System.out.println("   *** End Swap ***");
	} // swap	

}
