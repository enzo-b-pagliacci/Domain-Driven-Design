import java.util.Scanner;

public class programaIf {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int estoque = 0;
		
		System.out.println("Estoque: ");
		//permite a entrada de dado
		estoque = input.nextInt(); 
		
		if (estoque >= 100) {
			System.out.println("Produto com quantidade suficiente!");
		}
		else if (estoque < 100 && estoque > 50) {
			System.out.println("Alerta!! Estoque baixo!");
		}
		else {
			System.out.println("Atenção... fazer um novo pedido!");
		}
		
		

	}

}
