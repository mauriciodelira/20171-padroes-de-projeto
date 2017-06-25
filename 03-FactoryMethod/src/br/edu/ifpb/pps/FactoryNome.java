package br.edu.ifpb.pps;

class FactoryNome {
	
//	Sendo estático, poderia ser considerado um Singleton
	public Nome getNome(String nome){
		
//		Se possui vírgula, então chame o criador de nome 1. Se não, nome 2.
		if(nome.contains(","))
			return new NomeComVirgula(nome);
		else
			return new NomeSemVirgula(nome);
	}
}
