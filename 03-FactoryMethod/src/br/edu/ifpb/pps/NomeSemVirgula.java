package br.edu.ifpb.pps;

public class NomeSemVirgula implements Nome{
	private String nome;
	
	public NomeSemVirgula(String nome){
		this.setNome(nome);
	}
	@Override
	public void setNome(String nome){
		this.nome = nome;
	}
	@Override
	public String getNome() {
		return this.nome;
	}

}
