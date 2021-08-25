class Conta{

	int numero;
	String dono;
	double saldo;
	double limite;

	boolean sacar(double quantidade) {
		if(this.saldo < quantidade){
			return false;
		}
		else{
			this.saldo = this.saldo - quantidade;
			return true;
		}	
	}

	void transferir(Conta destino, double valor){
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}

	void depositar(double quantidade){
		this.saldo = this.saldo + quantidade; 
		System.out.println("Saque realizado R$: " + quantidade);
	}
}