import java.util.Scanner;

public class exemplo1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = 10; //tamanho do vetor
		int v[] = new int[n]; //declarando vetor v
		int i; // indice ou posi��o
		
		//entrada de dados	
		for (i=0; i<n; i++) {
			System.out.printf("Informe o %2do. Valor de %d: ", (i+1), n);
			v[i] = ler.nextInt();
		}
		
		//processamento: somar todos os valores, definir o maior e o menor valor
		int soma = 0;
		int menor = v[0];
		int maior = v[0];
		for (i=0; i<n; i++) {
			soma = soma + v[i];
			
			if (v[i] < menor) {
				menor = v[i];
			}
			
			if (v[i] > maior) {
				maior = v[i];
			}
		}
		
		//saida (resultado)
		System.out.printf("\n");
		for (i=0; i<n; i++) {
			if (v[i] == menor) {
				System.out.printf("v[%d] = [%d] <---- menor valor\n", i, v[i]);
			}
			else if (v[i] == maior) {
				System.out.printf("v[%d] = [%d] <----- maior valor\n", i, v[i]);
				
			}
			
			else {
				System.out.printf("v[%d] = [%d]\n", i, v[i]);
			} 
		}

	}

}
