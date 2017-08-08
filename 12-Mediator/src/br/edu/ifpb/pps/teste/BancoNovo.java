package br.edu.ifpb.pps.teste;

import br.edu.ifpb.pps.colleagues.BancoColleague;
import br.edu.ifpb.pps.mediator.Mediator;

public class BancoNovo extends BancoColleague {

	public BancoNovo(Mediator m) {
		super(m);
		this.setNome("Novo");
	}

	@Override
	public void aceitarTransferencia(double valor, BancoColleague origin) {
		this.setOrcamentoTotal( valor + this.getOrcamentoTotal());
		System.out.println(String.format("Banco Novo | %s transferiu R$%.2f para Novo", origin.getNome(), valor));
		System.out.println(String.format("Banco Novo | Orçamento total: R$%.2f.", this.getOrcamentoTotal()));
		System.out.println(String.format("%s | Orçamento total: R$%.2f.", origin.getNome(), origin.getOrcamentoTotal()));
		System.out.println(" --- --- ");
	}

}
