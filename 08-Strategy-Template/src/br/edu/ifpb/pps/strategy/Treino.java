package br.edu.ifpb.pps.strategy;

public class Treino implements ITreino {
	private ITreino treino;
	
	public Treino(ITreino treino){
		this.treino = treino;
	}
	
	public void preparoFisico() {
		treino.preparoFisico();
	}

	public void jogoTreino() {
		treino.jogoTreino();
	}
	
	public void treinoTatico(){
		System.out.println("[ST] Treino tático");
	}
	
	public void treinoDiario(){
		this.preparoFisico();
		this.jogoTreino();
		this.treinoTatico();
	}
	

}
