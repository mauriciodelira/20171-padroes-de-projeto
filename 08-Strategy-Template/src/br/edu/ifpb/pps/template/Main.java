package br.edu.ifpb.pps.template;


public class Main {
	
	public static void main(String[] args) {
		Treino t = new TreinoNoInicioDaTemporada();
		t.treinoDiario();
		System.out.println("--");

		t = new TreinoNoMeioDaTemporada();
		t.treinoDiario();
		System.out.println("- end -");
		
	}

}
