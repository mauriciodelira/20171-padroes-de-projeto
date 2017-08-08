package br.edu.ifpb.pps.strategy;

public class TreinoNoInicioDaTemporada implements ITreino {

	public void preparoFisico() {
		System.out.println("[ST] Preparo físico leve.");
	}

	public void jogoTreino() {
		System.out.println("[ST] Jogo treino com equipe júnior.");
	}

}
