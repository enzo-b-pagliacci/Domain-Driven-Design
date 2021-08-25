import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t, cont=0; //tamanho dos vetores
		int [] v1, v2, v3; //apenas declaração
		
		System.out.println("Tamanho: ");
		t = input.nextInt();
		
		//alocando memória
		v1 = new int[t];
		v2 = new int[t];
		v3 = new int[t*2];
		
		for(int i=0; i<v1.length; i++) {
			System.out.printf("v1[%d]: ", i);
			v1[i] = input.nextInt();
			
		}
		
		for(int i=0; i<v2.length; i++) {
			System.out.printf("v2[%d]: ", i);
			v2[i] = input.nextInt();
		}
		
		for(int i=0; i<v3.length; i++) {
			if (i<v1.length) {
				v3[i] = v1[i];
			}
			else {
				v3[i] = v2[cont];
				cont++;
			}
		}
		for(int i=0; i<v3.length; i++) {
			System.out.printf("v3[%d]: %d \n", i, v3[i]);
		}
		

	}

}
