package br.edu.ifpb.pps;

public class Teste {
	public static void main(String[] args){
		PessoaClonavel p1 = new PessoaClonavel("Fulano", 30);
		p1.addApelido("Cicrano");
		p1.addApelido("Beltrano");
		System.out.println(p1);
		PessoaClonavel p2 = p1.clone();
		System.out.println(p2);
		
	}
	

}
