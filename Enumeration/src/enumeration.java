
public enum enumeration {
	
	shreyas("awesome", "25"),
	manja("lambu", "24"),
	rakshith("cool", "25"),
	dhanu("active", "25"),
	dheeraj("techgig", "25");
	
	private final String desc;
	private final String  year;
	
	enumeration(String description, String age){
		desc = description;
		year = age;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getYear(){
		return year;
	}

}
