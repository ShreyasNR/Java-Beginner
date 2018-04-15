import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		int radius = 0;
		System.out.println("Please enter the value for radius:");
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			radius = Integer.parseInt(br.readLine());
		}
		
		catch (NumberFormatException ne)
		{
			System.out.println("Not a valid input" + ne);
			
		}
		
		catch (IOException ioe)
		{
			System.out.println("Error" + ioe);
	
		}
		
		double perimeter = Math.PI * 2 * radius;
		System.out.println("The perimeter of the circle is: " + perimeter);
	}

}
