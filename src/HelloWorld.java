
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.out.println("Hello ASE2017 - How are you now? :)");
		System.out.print("Please enter your name: ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		HelloUser user = new HelloUser(input);
		user.greetUser();
	}

}
