package br.edu.ifpb.pps.strategy;

public class Main {
	
	public static void main(String[] args) {
		Treino s = new Treino(new TreinoNoInicioDaTemporada());
		s.treinoDiario();
		System.out.println("--");
		
		
		s = new Treino(new TreinoNoMeioDaTemporada());
		s.treinoDiario();
		System.out.println("- end -");
		
	}
}
