import java.io.File;

public class apples {

	public static void main(String[] args) {
		
		File x = new File("C:\\Users\\Shreyas\\Shreyas.txt");
		
		if(x.exists())
			System.out.println(x.getName() + " exists");
		else
			System.out.println("This file doesn't exists");

	}

}
