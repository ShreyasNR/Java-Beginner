import java.util.Scanner;
public class apple1 {

	public static void main (String agrs[]){
		Scanner varname = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.print("Enter your first num: ");
		fnum = varname.nextDouble();
		System.out.print("Enter your second num: ");
		snum = varname.nextDouble();
		answer = fnum*snum;
		System.out.println(answer);
	}
}
