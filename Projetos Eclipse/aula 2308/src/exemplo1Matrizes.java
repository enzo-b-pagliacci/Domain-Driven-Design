
public class exemplo1Matrizes {

	public static void main(String[] args) {
		int m[] [] = {{1,2}, {3}, {4,5,6}};
		
		for(int i=0; i<m.length; i++) {
				System.out.printf("%da. linha: ", i+1);
				for(int j=0; j<m[i].length; j++) {
					System.out.printf("matriz[%d] [%d]: %d \n", i, j, m[i] [j]);
				}
		}

	}

}
