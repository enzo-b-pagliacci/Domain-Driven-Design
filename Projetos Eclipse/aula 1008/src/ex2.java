import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int v[] = {1, 2, 3, 4, 5};
		int z[] = {6, 7, 8, 9, 10};
		int x[] = new int[5];
		
		for(int i=0; i<x.length; i++) {
			x[i] = v[i] + z[i];
			System.out.printf("%d \n", x[i]);
		}
		

	}

}
