class ProgramaAeroporto{
	public static void main(String[] args){
		Aeroporto ae1 = new Aeroporto();
		
		ae1.unidade = "FTP-10";
		ae1.local = "Congonhas";
		ae1.qntPistas = 6;
        ae1.qntAvioesComportados = 18;
        ae1.tamanhoAeroporto = "Grande";
        ae1.pracaAlimentacao = true;


		System.out.println(ae1.unidade);
		System.out.println(ae1.local);
		System.out.println(ae1.qntPistas);
        System.out.println(ae1.qntAvioesComportados);
        System.out.println(ae1.tamanhoAeroporto);
        System.out.println(ae1.pracaAlimentacao);
        System.out.println("========");


		Aeroporto ae2 = new Aeroporto();
		
		ae2.unidade = "RML-7";
		ae2.local = "Guarulhos";
		ae2.qntPistas = 3;
        ae2.qntAvioesComportados = 7;
        ae2.tamanhoAeroporto = "Pequeno";
        ae2.pracaAlimentacao = false;


		System.out.println(ae2.unidade);
		System.out.println(ae2.local);
		System.out.println(ae2.qntPistas);
        System.out.println(ae2.qntAvioesComportados);
        System.out.println(ae2.tamanhoAeroporto);
        System.out.println(ae2.pracaAlimentacao);
        System.out.println("========");



		Aeroporto ae3 = new Aeroporto();
		
		ae3.unidade = "UTP-2";
		ae3.local = "Campinas";
		ae3.qntPistas = 5;
        ae3.qntAvioesComportados = 10;
        ae3.tamanhoAeroporto = "Médio";
        ae3.pracaAlimentacao = true;


		System.out.println(ae3.unidade);
		System.out.println(ae3.local);
		System.out.println(ae3.qntPistas);
        System.out.println(ae3.qntAvioesComportados);
        System.out.println(ae3.tamanhoAeroporto);
        System.out.println(ae3.pracaAlimentacao);

	}
}