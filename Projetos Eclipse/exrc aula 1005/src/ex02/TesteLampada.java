package ex02;

public class TesteLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada lampada = new Lampada();
		lampada.setDesLmpd();
		System.out.println("A lampada está: " + lampada.getLmpd());
		lampada.setLigLmpd();
		System.out.println("A lampada está: " + lampada.getLmpd());

	}

}
