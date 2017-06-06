package br.edu.ifpb.pps;

public class NomeComVirgula implements Nome{
	private String nome;
	
	public NomeComVirgula(String nome){
		this.setNome(nome);
	}
	
	@Override
	public void setNome(String nome) {
		String[] nomes = nome.split(", ");
		String sobrenome = nomes[0];
		String nomeGet = nomes[1];
		this.nome = nomeGet + " " + sobrenome;		
	}

	@Override
	public String getNome() {
		return this.nome;
	}

}
