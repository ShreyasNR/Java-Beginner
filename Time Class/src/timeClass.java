
public class timeClass {

	public static void main(String[] args) {
		time timeObject = new time();
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toString());
		
		timeObject.setTime(13, 25, 5);
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toString());

	}

}
