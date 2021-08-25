

public class Conta {
	
	private double saldo = 100;
	public String nome = "Meu banco";
			
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void verificaSaldo() {
		System.out.println("Saldo: " + getSaldo());
	}
	
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
}


