package br.edu.ifpb.pps;

public class Locadora {
	  public static void main(String[] args) {
	    Cliente c1 = new Cliente("Juliana");
	    c1.adicionaAluguel(new Aluguel(new Fita("O Exorcista                  ", new TipoNormal()), 3));
	    c1.adicionaAluguel(new Aluguel(new Fita("Men in Black                 ", new TipoNormal()), 2));
	    c1.adicionaAluguel(new Aluguel(new Fita("Jurassic Park III            ", new TipoLancamento()), 3));
	    c1.adicionaAluguel(new Aluguel(new Fita("Planeta dos Macacos          ", new TipoLancamento()), 4));
	    c1.adicionaAluguel(new Aluguel(new Fita("Pateta no Planeta dos Macacos", new TipoInfantil()), 10));
	    c1.adicionaAluguel(new Aluguel(new Fita("O Rei Leão                   ", new TipoInfantil()), 30));

	    System.out.println(c1.extrato());
	  }
	}