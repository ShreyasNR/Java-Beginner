import java.util.Scanner;

public class applemethodone {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		applemethodtwo applemethodtwoObject = new applemethodtwo();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		applemethodtwoObject.simpleMessage(name);
	}

}
