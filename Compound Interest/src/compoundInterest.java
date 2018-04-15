
public class compoundInterest {

	public static void main(String[] args) {
		double average;
		double principle = 10000;
		double rate = .01;
		
		for (int day = 1; day <= 10; day++){
			average = principle*Math.pow(1 + rate, day);
			System.out.println(day + "  " + average);
		}

	}

}
