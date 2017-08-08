package br.edu.ifpb.pps.mediator;

import br.edu.ifpb.pps.colleagues.BancoColleague;

public interface Mediator {
	public void transferir(double val, BancoColleague origem, BancoColleague destino);
	public void getSaldos();
}
