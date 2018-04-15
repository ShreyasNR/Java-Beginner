
public class multiArray {

	public static void main(String[] args) {
		int firstarray [][] = {{1,2,3}, {3,4,5}};
		int secondarray [][] = {{45,66,78,15},{89,58},{59}};
		
		System.out.println("This is the first array");
		display(firstarray);
		
		System.out.println("This is the second array");
		display(secondarray);

	}
	
	public static void display(int x [][]){
		for (int row = 0; row <x.length; row++){
			for (int column = 0; column<x[row].length; column++){
				System.out.print(x[row][column]+"\t");
			}
			
			System.out.println();
		}
	}

}
