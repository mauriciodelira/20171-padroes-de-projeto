package br.edu.ifpb.pps.colleagues;

import br.edu.ifpb.pps.mediator.Mediator;

public class BancoItau extends BancoColleague {

	public BancoItau(Mediator m) {
		super(m);
		this.setNome("Itaú");
	}

	@Override
	public void aceitarTransferencia(double valor, BancoColleague origin) {
		this.setOrcamentoTotal( valor + this.getOrcamentoTotal());
		System.out.println(String.format("Banco Itaú | %s transferiu R$%.2f para Itaú", origin.getNome(), valor));
		System.out.println(String.format("Banco Itaú | Orçamento total: R$%.2f.", this.getOrcamentoTotal()));
		System.out.println(String.format("%s | Orçamento total: R$%.2f.", origin.getNome(), origin.getOrcamentoTotal()));
		System.out.println(" --- --- ");
	}

}
