
public class ex1Teste {

	public static void main(String[] args) {
		ex1 ep = new ex1();
		
		int[] vetor = ep.tamanhoMatriz();
		int[] [] matriz = ep.criaMatriz(vetor);
		ep.imprimeMatriz(matriz);
		matriz = ep.populaMatriz(matriz);
		ep.imprimeMatriz(matriz);
		int n = ep.obterNumero();
		ep.verificaOcorrencias(matriz, n);

	}

}
