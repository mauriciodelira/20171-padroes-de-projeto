package br.edu.ifpb.pps.strategy;

public class TreinoNoMeioDaTemporada implements ITreino{

	public void preparoFisico() {
		System.out.println("[ST] Preparo físico intenso");
	}

	public void jogoTreino() {
		System.out.println("[ST] Jogo treino com equipe reserva");
	}

}
