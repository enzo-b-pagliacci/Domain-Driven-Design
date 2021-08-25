
public class aula14_vetores {

	public static void main(String[] args) {
		String nomes[] = {"Juca", "Maria", "Marcos"};
		
		//length devolve o tamanho do vetor (int)
		int n = nomes.length;
		
		for(int i=0; i<n; i++) {
			System.out.printf("nomes[%d]: %s \n", i, nomes[i]);
		}
	}

}
