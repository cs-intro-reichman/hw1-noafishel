// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		System.out.print(num/100 + " hundreds, ");
		num = num % 100;
		System.out.print(num / 10 + " tens, and ");
		num = num % 10;
		System.out.print(num + " ones.");
	}
}
