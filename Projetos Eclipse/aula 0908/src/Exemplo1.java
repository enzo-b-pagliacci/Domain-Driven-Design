import java.util.Iterator;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.println("Tamanho: ");
		n = input.nextInt();
				
		int v [] = new int [n];
		
		//preenche o vetor com os valores de i
		for(int i=0; i<v.length; i++) {
			System.out.printf("Vetor [%d]: ", i);
			v[i] = input.nextInt();
			//permitir a entrada de dados
		}
		
		for(int i=0; i<v.length; i++) {
			System.out.printf("v[%d]: %d \n", i, v[i]);
		}
	}

}
