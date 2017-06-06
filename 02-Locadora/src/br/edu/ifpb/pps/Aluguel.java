package br.edu.ifpb.pps;

public class Aluguel {
	  private Fita fita;
	  private int diasAlugada;
	  
	  public Aluguel(Fita fita, int diasAlugada) {
	    this.fita = fita;
	    this.diasAlugada = diasAlugada;
	  }
	  public Fita getFita() {
	    return this.fita;
	  }
	  public int getDiasAlugada() {
	    return this.diasAlugada;
	  }
	  
	  public double getValor(){
		  return fita.getValor(diasAlugada);
	  }
	}
