class ProgramaPessoa{
	public static void main(String[] args){
		Pessoa p1 = new Pessoa();
		
		p1.peso = 60.5;
		p1.profissao = "pescador";
		p1.nacionalidade = "brasileiro";


		System.out.println(p1.peso);
		System.out.println(p1.profissao);
		System.out.println(p1.nacionalidade);


		Pessoa p2 = new Pessoa();
		
		p2.peso = 75.0;
		p2.profissao = "professor";
		p2.nacionalidade = "japonês";


		System.out.println(p2.peso);
		System.out.println(p2.profissao);
		System.out.println(p2.nacionalidade);


		Pessoa p3 = new Pessoa();
		
		p3.peso = 120.56;
		p3.profissao = "Senador";
		p3.nacionalidade = "Canadense";


		System.out.println(p3.peso);
		System.out.println(p3.profissao);
		System.out.println(p3.nacionalidade);
	}
}