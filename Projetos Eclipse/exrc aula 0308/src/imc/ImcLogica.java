package imc;

import java.util.Scanner;

public class ImcLogica {
	
	Scanner input = new Scanner(System.in);
	
	public double EntradaDeDados() {
		double valor;
		valor = input.nextDouble();
		return valor;
	}
	
	public double CalcImc(double peso, double altura) {
		double resultado;
		resultado = peso/(altura*altura);
		return resultado;
	}
	
	public void status(double resultado) {		
		if (resultado < 18.5){
			System.out.println("Você está abaixo do peso");
		}
		else if (resultado > 18.5 && resultado < 24.9){
			System.out.println("Você está com peso normal");
		}
		else if (resultado > 24.5 && resultado < 29.9){
			System.out.println("Você está com sobrepeso");
		}
		else if (resultado > 30 && resultado < 34.9){
			System.out.println("Você está com obesidade grau I");
		}
		else if (resultado > 34.9 && resultado < 39.9){
			System.out.println("Você está com obesidade grau II");
		}
		else{
			System.out.println("Você está com obesidade grau III");
		}
		
		
		
	}
	

}
