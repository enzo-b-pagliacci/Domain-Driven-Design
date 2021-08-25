
public class ClasseTeste {

	public static void main(String[] args) {
		Conta conta = new Conta();
		double saldo = conta.getSaldo();
		conta.verificaSaldo();
		conta.setSaldo(500.00);
		System.out.println("Saldo: " + conta.getSaldo());
		conta.depositar(1000);
		conta.verificaSaldo();
		
	}

}
