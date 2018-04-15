
public class tuna {
	
	private String name;
	private dateClass birthday;
	
	public tuna(String theName, dateClass theDate){
		name  = theName;
		birthday = theDate;
		
	}
	
	public String toString(){
		return String.format("My name is %s, my birthday is %s",name, birthday);
	}

}
