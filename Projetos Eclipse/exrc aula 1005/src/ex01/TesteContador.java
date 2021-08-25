package ex01;

public class TesteContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador contador = new Contador();
		contador.setContador(500);
		System.out.println("Contador: " + contador.getContador());
		contador.setIncreContador();
		System.out.println("Contador: " + contador.getContador());
		contador.setZeraContador();
		System.out.println("Contador: " + contador.getContador());

	}

}
