class ProgramaApartamento{
	public static void main(String[] args){
		Apartamento a1 = new Apartamento();
		
		a1.andar = 7;
		a1.numero = 3;
		a1.bloco = "C";
        a1.lado = "leste";
        a1.tipoap = "padrão";
        a1.portaolhomagico = true;


		System.out.println(a1.andar);
		System.out.println(a1.numero);
		System.out.println(a1.bloco);
        System.out.println(a1.lado);
        System.out.println(a1.tipoap);
        System.out.println(a1.portaolhomagico);
        System.out.println("========");


		Apartamento a2 = new Apartamento();
		
		a1.andar = 22;
		a1.numero = 4;
		a1.bloco = "D";
        a1.lado = "oeste";
        a1.tipoap = "Cobertura";
        a1.portaolhomagico = true;


		System.out.println(a1.andar);
		System.out.println(a1.numero);
		System.out.println(a1.bloco);
        System.out.println(a1.lado);
        System.out.println(a1.tipoap);
        System.out.println(a1.portaolhomagico);
        System.out.println("========");



		Apartamento a3 = new Apartamento();
		
		a1.andar = 17;
		a1.numero = 2;
		a1.bloco = "A";
        a1.lado = "leste";
        a1.tipoap = "Premium";
        a1.portaolhomagico = false;


		System.out.println(a1.andar);
		System.out.println(a1.numero);
		System.out.println(a1.bloco);
        System.out.println(a1.lado);
        System.out.println(a1.tipoap);
        System.out.println(a1.portaolhomagico);

	}
}