package br.edu.ifpb.pps.colleagues;

import br.edu.ifpb.pps.mediator.Mediator;

public class BancoBrasil extends BancoColleague {

	public BancoBrasil(Mediator m) {
		super(m);
		this.setNome("Banco do Brasil");
	}

	@Override
	public void aceitarTransferencia(double valor, BancoColleague origin) {
		this.setOrcamentoTotal( valor + this.getOrcamentoTotal());
		System.out.println(String.format("Banco do Brasil | %s transferiu R$%.2f para o BB.", origin.getNome(), valor));
		System.out.println(String.format("Banco do Brasil | Orçamento total: R$%.2f.", this.getOrcamentoTotal()));
		System.out.println(String.format("%s | Orçamento total: R$%.2f.", origin.getNome(), origin.getOrcamentoTotal()));
		System.out.println(" --- --- ");
	}

}
