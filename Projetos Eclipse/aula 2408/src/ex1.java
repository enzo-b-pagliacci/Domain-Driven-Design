import java.util.Scanner;

public class ex1 {

		Scanner input = new Scanner(System.in);

		public int[] tamanhoMatriz(){
			System.out.println("*-- Tamanho Matriz --*");
			int [] vetor = new int[2];
			System.out.println("Linhas: ");
			vetor[0] = input.nextInt();
			System.out.println("Colunas: ");
			vetor[0] = 	input.nextInt();
			return vetor;
		}
		
		public 	int [][] criaMatriz(int[]v){
			System.out.println("*-- Cria matriz --*");
			int [][] matriz = new int[v[0]][v[1]];
			return matriz;
		}
		
		public int [][] populaMatriz(int[][] matriz) {
			System.out.println("*-- Popula matriz --*");
			for(int i=0; i<matriz.length; i++) {
				for(int j=0; j<matriz[i].length; j++) {
					System.out.printf("matriz[%d][%d]: ", i,j);
					matriz[i][j] = input.nextInt();
				}
			}
			return matriz;
		}
		
		public void imprimeMatriz(int[][] matriz) {
	        System.out.println("-- Imprime Matriz --");
	        for(int i=0; i<matriz.length; i++) {
	            for(int j=0; j<matriz[i].length; j++) {
	                System.out.printf("Matriz[%d][%d]: %d \n",i ,j, matriz[i][j]);
	            }
	        }
	    }
		
		public int obterNumero() {
			System.out.println("*-- Obter o n�mero --*");
			System.out.println("Numero: ");
			int n = input.nextInt();
			return n;
		}
		
		public int verificaOcorrencias(int[][] m, int n) {
			System.out.println("*-- Verifica Ocorrencias --*");
			int cont = 0;
			for(int i=0; i<m.length; i++) {
				for(int j=0; j<m[i].length; j++) {
					if(m[i][j] == n) {
						cont++;
					}
				}
			}
			return cont;
		}
		
		public int 

}


