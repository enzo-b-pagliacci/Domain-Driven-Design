package exercicios;

public class TesteCalculadoraSimples_ {
	
	public static void main(String[] args) {
		CalculadoraSimples_ calc = new CalculadoraSimples_();
		
		int op = calc.menu();
		double n1 = calc.entradaDados();
		double n2 = calc.entradaDados();
		double resultado = calc.controlador(n1, n2, op);
		calc.imprimeResultado(resultado);
	}

}
