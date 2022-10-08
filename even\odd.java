import java.util.*;  
public class uniHW {
	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);
		System.out.println("Einter yor number: ");
		int number = myobj.nextInt();
		if (number % 2 == 0) {
			System.out.println( number+ " is even");
			
		}
		else {
			System.out.println(number+ " is odd");
		}
	}
}
