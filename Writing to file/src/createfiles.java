import java.util.*;
import java.io.*;
import java.lang.*;

public class createfiles {
	
	private Formatter x;
	
	public void openFile(){
		try{
			x= new Formatter("formal.txt");
		}
		
		catch (Exception e){
			System.out.println("there is a error");
		}
	}
	
	public void addRecords(){
		x.format("%s%s%s", "1 ", "Shreyas ", "NR\n");
		x.format("%s%s%s", "11 ", "Dhanush ", "Bond\n");
		x.format("%s%s%s", "7 ", "rakshith ", "MN\n");
		x.format("%s%s%s", "14 ", "manja ", "babu");
		
	}
	
	public void closeFile(){
		x.close();
	}

}