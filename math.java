package snippet;
import java.util.Scanner;
public class math {
	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int first = myobj.nextInt(); 
		System.out.println("Enter your sacond number: ");
		int sacond = myobj.nextInt();
		System.out.println("what you want to do ");
		System.out.println("1/+ \n2/-\n3/x\n4// ");
		int op = myobj.nextInt();
		switch (op) {
		case 1:
			System.out.println("Addition of "+first+ " and "+sacond+ " is " + (first+sacond));
			break;
		case 2:
			System.out.println("Subtraction of "+first+" and "+sacond+" is "+ (first-sacond));
			break;
		case 3:
			System.out.println("Multiplication of "+first+" and "+sacond+" is "+ (first*sacond));
			break;
		case 4:
			float fir = first;
			float sac = sacond;
			float div;
			div = fir/sac;
			System.out.println("Division of "+first+" and "+sacond+" is "+ div);
			break;
		}
	}
}
