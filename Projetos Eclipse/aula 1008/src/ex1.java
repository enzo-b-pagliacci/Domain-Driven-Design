import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.println("Tamanho: ");
		n = input.nextInt();
		
		int v [] = new int[n];
		
		for(int i=0; i<v.length; i++) {
			System.out.printf("Vetor [%d]: ", i);
			v[i] = input.nextInt();
		}
		int x = 0;
		
		for(int i=0; i<v.length; i++) {			
			if(v[i] > 0) {
				x++;
				System.out.printf("v[%d]: %d \n", i, v[i]);
				
			}
		}
		System.out.printf("Quantidade de elementos positivos: %d ", x);
	}

}
