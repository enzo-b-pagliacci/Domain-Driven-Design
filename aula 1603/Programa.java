class Programa{
	public static void main(String[] args){
		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.dono = "Enzo";
		minhaConta.saldo = 1000.0;
		minhaConta.numero = 1;
		minhaConta.limite = 1000.0;
		System.out.println("Saldo atual: " + minhaConta.saldo);
		System.out.println("Dono: " + minhaConta.dono);
		System.out.println("Numero: " + minhaConta.numero);
		System.out.println("Limite: " + minhaConta.limite);
	}
}