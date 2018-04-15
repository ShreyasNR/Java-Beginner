import java.util.EnumSet;
public class apples {
	public static void main (String[] args){
		
		for (enumeration people: enumeration.values())
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		
		
		System.out.println("\nAnd now for the range of constants!!!\n");
		
		for(enumeration people: EnumSet.range(enumeration.manja, enumeration.dhanu))
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
	}

}
