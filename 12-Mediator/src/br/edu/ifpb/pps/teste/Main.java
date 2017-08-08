package br.edu.ifpb.pps.teste;

import br.edu.ifpb.pps.colleagues.BancoBrasil;
import br.edu.ifpb.pps.colleagues.BancoItau;
import br.edu.ifpb.pps.colleagues.BancoSantander;
import br.edu.ifpb.pps.mediator.BancoMediator;

public class Main {
	public static void main(String[] args){
		BancoMediator mediator = new BancoMediator();

		BancoBrasil brasil = new BancoBrasil(mediator);
		BancoItau itau = new BancoItau(mediator);
		BancoSantander santander = new BancoSantander(mediator);
		
		mediator.addBanco(itau);
		mediator.addBanco(brasil);
		mediator.addBanco(santander);

		mediator.getSaldos();
		
		itau.realizarTransferencia(400.00, brasil);
		santander.realizarTransferencia(350.00, brasil);
		brasil.realizarTransferencia(200, itau);
		brasil.realizarTransferencia(500.40, santander);
		
		BancoNovo novo = new BancoNovo(mediator);
		mediator.addBanco(novo);
		
		itau.realizarTransferencia(200.00, novo);
		novo.realizarTransferencia(100, santander);
		
		mediator.getSaldos();
	}
}
