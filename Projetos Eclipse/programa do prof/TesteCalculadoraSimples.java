package exercicios;

public class TesteCalculadoraSimples {
	public static void main(String[] args) {
		
		CalculadoraSimples calc = new CalculadoraSimples();
		
		calc.setTeste(123);
		System.out.println(calc.getTeste()); //123
		
		calc.setTeste(-123);
		System.out.println(calc.getTeste()); //0
		
		int op = calc.menu();
		double n1 = calc.entradaDados();
		double n2 = calc.entradaDados();
		double result = calc.controlador(n1, n2, op);
		calc.imprimeResultado(result);
	}
}
