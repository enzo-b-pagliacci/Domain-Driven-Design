class Funcionario {

	String nome;
	String departamento;
	double salario;
	String dataContratacao;
	String rg;

	void recebeAumento(double valor) {
		this.salario = this.salario + valor;		
	}

	double calculaGanhoAnual() {
		return this.salario * 12;
	}
} 