package br.edu.ifpb.pps.colleagues;

import br.edu.ifpb.pps.mediator.Mediator;

public class BancoSantander extends BancoColleague {

	public BancoSantander(Mediator m) {
		super(m);
		this.setNome("Santander");
	}

	@Override
	public void aceitarTransferencia(double valor, BancoColleague origin) {
		this.setOrcamentoTotal( valor + this.getOrcamentoTotal());
		System.out.println(String.format("Banco Santander | %s transferiu R$%.2f para o Santander.", origin.getNome(), valor));
		System.out.println(String.format("Banco Santander | Orçamento total: R$%.2f.", this.getOrcamentoTotal()));
		System.out.println(String.format("%s | Orçamento total: R$%.2f.", origin.getNome(), origin.getOrcamentoTotal()));
		System.out.println(" --- --- ");
	}

}
