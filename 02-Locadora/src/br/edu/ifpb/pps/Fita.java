package br.edu.ifpb.pps;

public class Fita {
	private String titulo;
	private int codigoDePreco;
	private Tipo tipo;
	
	public Fita(String tit, Tipo tipo){
		this.titulo = tit;
		this.tipo = tipo;
	}
	
	public Fita(String titulo, int codigo) {
		this.titulo = titulo;
		this.codigoDePreco = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public int getCodigoDePreco() {
		return codigoDePreco;
	}
	public void setCodigoDePreco(int codigo) {
		this.codigoDePreco = codigo;
	}  
 	public Tipo getTipo() {
 		return tipo;
 	}
 	public void setTipo(Tipo tipo) {
 		this.tipo = tipo;
 	}
 	
 	public double getValor(double dias){
 		return tipo.getValor(dias);
 	}
}