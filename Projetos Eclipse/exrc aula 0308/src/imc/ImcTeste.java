package imc;

public class ImcTeste {

	public static void main(String[] args) {
		ImcLogica imc = new ImcLogica();
		
		System.out.println("Calculo do IMC");
		System.out.println("Insira seu peso:");
		double peso = imc.EntradaDeDados();
		System.out.println("Insira sua altura");
		double altura = imc.EntradaDeDados();
		double resultado = imc.CalcImc(peso, altura);
		System.out.println("Seu IMC é: " + resultado);
		imc.status(resultado);
		

	}

}
