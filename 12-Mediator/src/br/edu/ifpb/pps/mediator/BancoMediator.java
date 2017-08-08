package br.edu.ifpb.pps.mediator;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.pps.colleagues.BancoColleague;

public class BancoMediator implements Mediator{
	private List<BancoColleague> bancos;
	
	public BancoMediator(){
		if(bancos==null)
			this.bancos = new ArrayList<BancoColleague>();
	}
	
	public void addBanco(BancoColleague ban){
		this.bancos.add(ban);
	}

	@Override
	public void transferir(double val, BancoColleague origem, BancoColleague destino) {
		for(BancoColleague b : bancos){
			if(b.equals(destino)){
				b.aceitarTransferencia(val, origem);
			}
		}
	}

	@Override
	public void getSaldos() {
		String text = "\nMediator | Saldo total \n";
		for(BancoColleague colleague : bancos){
			text+= String.format("- %s - R$%.2f\n", colleague.getNome(), colleague.getOrcamentoTotal());
		}
		text+=" --- ---\n";
		System.out.println(text);
	}
	

}
