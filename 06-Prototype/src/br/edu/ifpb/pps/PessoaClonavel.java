package br.edu.ifpb.pps;

import java.util.ArrayList;
import java.util.List;

public class PessoaClonavel implements Prototype<PessoaClonavel> {
	private String nome;
	private int idade;
	List<String> apelidos;
	
	public PessoaClonavel(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
		this.apelidos = new ArrayList<String>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void addApelido(String apelido){
		this.apelidos.add(apelido);
	}
	
	public void setApelidos(List<String> ap){
		this.apelidos = ap;
	}
	
	public PessoaClonavel clone(){
		PessoaClonavel p = new PessoaClonavel(this.nome, this.idade);
		p.setApelidos(this.apelidos);
		return p;
	}
	
}
