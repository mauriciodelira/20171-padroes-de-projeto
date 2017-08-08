package br.edu.ifpb.pps.template;

public class TreinoNoMeioDaTemporada extends Treino {

	@Override
	void preparoFisico() {
		System.out.println("[TM] Preparo físico intenso");
	}

	@Override
	void jogoTreino() {
		System.out.println("[TM] Jogo treino com equipe reserva");
	}

}
