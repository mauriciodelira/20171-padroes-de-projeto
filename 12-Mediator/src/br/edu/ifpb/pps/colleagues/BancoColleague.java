package br.edu.ifpb.pps.colleagues;

import br.edu.ifpb.pps.mediator.Mediator;

public abstract class BancoColleague {
	private String nome;
	private Mediator mediator;
	private double orcamentoTotal = 0;
	
	public BancoColleague(Mediator m){
		this.setMediator(m);
	}
	
	public void realizarTransferencia(double valor, BancoColleague bancoDestino){
		mediator.transferir(valor, this, bancoDestino);
	}
	
	public abstract void aceitarTransferencia(double valor, BancoColleague origin);

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getOrcamentoTotal() {
		return orcamentoTotal;
	}

	public void setOrcamentoTotal(double orcamentoTotal) {
		this.orcamentoTotal = orcamentoTotal;
	}
}
