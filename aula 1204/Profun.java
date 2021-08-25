class Profun {
	public static void main(String[] args) {

	Funcionario tony = new Funcionario();	

	tony.nome = "Tony";
	tony.departamento = "comercio";
	tony.salario = 5000.0;
	tony.dataContratacao = "09/03/2020";
	tony.rg = "98798798";
 		
	System.out.println("Salario mensal R$: " + tony.salario);

	tony.recebeAumento(550.35);

	System.out.println("Salario mensal R$: " + tony.salario);
	
	tony.recebeAumento(1235.35);

	System.out.println("Salario mensal R$: " + tony.salario);

	double salarioDoAno = tony.calculaGanhoAnual();

	System.out.println("Salario anual R$: " + salarioDoAno);
	
	}
} 