
public class varLenArgu {

	public static void main(String[] args) {
		System.out.println(average(1,2,3,4,5,6,7));

	}
	
	public static int average(int...numbers){
		int total = 0;
		for (int x:numbers)
			total += x;
		
		return total/numbers.length;
	}

}
