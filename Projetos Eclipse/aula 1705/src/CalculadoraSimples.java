import java.util.Scanner;

public class CalculadoraSimples {
	
	Scanner input = new Scanner(System.in);
	private double n1, n2, resultado;
	
	public int menu() {
		int op; //vari�vel local
		do {
			System.out.println("*-Menu-*");
			System.out.println("1 - Adi��o");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplica��o");
			System.out.println("4 - Divis�o");
			System.out.println("Ope��o: ");
			op = input.nextInt();
		}while(op < 1 || op > 4);
		
		return op;
	}
	
	public double entradaDados() {
		double num;
		System.out.println("*- Entrada de dados - *");
		System.out.println("N�mero: ");
		num = input.nextDouble();
		return num;
	}
	
	public double adicao(double n1, double n2){
		double resultado;
		System.out.println("*- Adi��o -*");
		resultado = n1 + n2;
		return resultado;
	}
	
	public double subtracao(double n1, double n2){
		double resultado;
		System.out.println("*- Subtra��o -*");
		resultado = n1 - n2;
		return resultado;
	}
	
	public double multiplicacao(double n1, double n2){
		double resultado;
		System.out.println("*- Multiplica��o -*");
		resultado = n1 * n2;
		return resultado;
	}
	
	public double divisao(double n1, double n2){
		double resultado;
		System.out.println("*- Divis�o -*");
		resultado = n1 / n2;
		return resultado;
	}
	
	public void imprimeResultado(double resultado) {
		System.out.println("*- Imprime resultado -*");
		System.out.println("Resultado: " + resultado);
	}
	
	public double controlador(double n1, double n2, int op){
		System.out.println("*- Controlador -*");
		double resultado;
		
		switch(op) {
		case 1:
			resultado = adicao(n1, n2);
			break;
		case 2: 
			resultado = subtracao(n1, n2);
			break;
		case 3: 
			resultado = multiplicacao(n1, n2);
			break;
		case 4:
			resultado = divisao(n1, n2);
			break;
			
		default:
			resultado = 0;
		}
		
		return resultado; 
	}
	

}
