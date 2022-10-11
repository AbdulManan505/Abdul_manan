import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter your Matriculation marks in parcentage: ");
		int Matriculation = myobj.nextInt();
		System.out.println("Enter your Intermediate marks in parcentage: ");
		int Intermediate = myobj.nextInt();
		System.out.println("Enter your Test results: ");
		int Testresults = myobj.nextInt();
		int CPN = (int) ((Matriculation* 0.1) +(Intermediate* 0.3)+(Testresults*0.6));
		System.out.println("this is your calculated CPN: " + CPN);
		
		
	}
}
