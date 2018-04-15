import java.util.*;

public class apples {

	public static void main(String[] args) {
		
		final Formatter x;
		
		try{
			x= new Formatter("simple.txt");
			System.out.println("You have created a file");
		}
		
		catch (Exception e){
			System.out.println("oops!");
		}

	}

}
