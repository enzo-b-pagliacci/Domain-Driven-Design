public class Programa{
	public static void main(String[] args){
		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.saldo = 1000.0;
		
		System.out.println("Saldo atual: " + minhaConta.saldo);

		if (minhaConta.sacar(500.0)){
			System.out.println("Saque Realizado");
		}		
		else{
			System.out.println("Saldo insuficiente");
		}
		System.out.println("Saldo atual: " + minhaConta.saldo);


		Conta meuSonho = new Conta();
		meuSonho.saldo = 500000.0;
		System.out.println("Meu sonho: R$ " + meuSonho.saldo);

		meuSonho.transferir(minhaConta, 100000);
		
		System.out.println("Minha Conta: R$ " + minhaConta.saldo);
		System.out.println("Meu sonho: R$ " + meuSonho.saldo);
		
		

	}
}