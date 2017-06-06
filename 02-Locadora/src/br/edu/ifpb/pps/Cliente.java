package br.edu.ifpb.pps;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente {
	
	  private String nome;
	  private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();
	  private int pontosAlugadorFrequente = 0;
	  
	  public Cliente(String nome) {
	    this.nome = nome;
	  }
	  public String getNome() {
	    return nome;
	  }
	  
	  public void adicionaAluguel(Aluguel aluguel) {
	    fitasAlugadas.add(aluguel);
	    this.pontosAlugadorFrequente++;

	    if(TipoLancamento.class.isInstance(aluguel.getFita().getTipo()) && aluguel.getDiasAlugada() > 1)
	    	this.pontosAlugadorFrequente++;
	    
	    
	  }
	  
	  public int getPontosAlugadorFrequente(){
		  return this.pontosAlugadorFrequente;
	  }
	  
	  public double getValorTotal(){
		  double total = 0.0;
		  
		  for(Aluguel a : this.fitasAlugadas)
			  total += a.getFita().getValor( a.getDiasAlugada() );
		  
		  return total;
	  }

	  public String extrato(){
		  int i=0;
		  String res = "";
		  String endline = System.getProperty("line.separator");
		  
		  res += "-- Registro de Alugu�is de "+this.nome + " --" + endline;
		  
		  for(Aluguel a : this.fitasAlugadas){
			  i++;
			 			  
			  res += "\t" + i + ". " + a.getFita().getTitulo() + "\tR$" + a.getFita().getValor( a.getDiasAlugada() ) + endline;
		  
		  }

		  res += "Pontos como alugador frequente: "+this.getPontosAlugadorFrequente()+endline;
		  res += "Total: R$"+this.getValorTotal();
		  return res;
	  }
	  

}