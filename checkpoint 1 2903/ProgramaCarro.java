class ProgramaCarro{
	public static void main(String[] args){
		Carro c1 = new Carro();
		
		c1.modelo = "A3 Sportback";
		c1.marca = "Audi";
		c1.cor = "Cinza";
        c1.ano = 2014;
        c1.placa = "EJG-4959";
        c1.combustivel = "Gasolina";


		System.out.println(c1.modelo);
		System.out.println(c1.marca);
		System.out.println(c1.cor);
        System.out.println(c1.ano);
        System.out.println(c1.placa);
        System.out.println(c1.combustivel);
        System.out.println("========");


		Carro c2 = new Carro();
		
		c1.modelo = "Spyder";
		c1.marca = "Maserati";
		c1.cor = "Preto";
        c1.ano = 2020;
        c1.placa = "HXU-4250";
        c1.combustivel = "Diesel";


		System.out.println(c1.modelo);
		System.out.println(c1.marca);
		System.out.println(c1.cor);
        System.out.println(c1.ano);
        System.out.println(c1.placa);
        System.out.println(c1.combustivel);
        System.out.println("========");


		Carro c3 = new Carro();
		
		c3.modelo = "Fiesta Sedan";
		c3.marca = "Ford";
		c3.cor = "Prata";
        c3.ano = 2011;
        c3.placa = "NDO-3460";
        c3.combustivel = "Etanol";


		System.out.println(c3.modelo);
		System.out.println(c3.marca);
		System.out.println(c3.cor);
        System.out.println(c3.ano);
        System.out.println(c3.placa);
        System.out.println(c3.combustivel);
	}
}