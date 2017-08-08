package br.edu.ifpb.pps.template;

public class TreinoNoInicioDaTemporada extends Treino {

	@Override
	void preparoFisico() {
		System.out.println("[TM] Preparo físico leve.");
	}

	@Override
	void jogoTreino() {
		System.out.println("[TM] Jogo treino com equipe júnior");
	}

}
