import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfCircle {

	public static void main(String[] args) {
		 double radius = 0;
		 System.out.println("Please enter the radius of circle: "); 
		 
		 try
		 {
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 radius = Double.parseDouble(br.readLine());
		 }
		 
		 catch (NumberFormatException ne)
		 {
			 System.out.println("Invalid radius value." + ne);
			 System.exit(0);
		 }
		 
		 catch (IOException ioe)
		 {
			 System.out.println("IO Error:" + ioe);
			 
		 }
		 
		 double area = Math.PI * radius * radius;
		 System.out.println("Area of circle: " + area);
	}

}
