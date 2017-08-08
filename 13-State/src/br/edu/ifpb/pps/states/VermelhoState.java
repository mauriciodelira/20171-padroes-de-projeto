package br.edu.ifpb.pps.states;

public class VermelhoState extends SemaforoState{

	@Override
	public SemaforoState toGreen() {
		System.out.println("Vermelho >> Verde");
		return new VerdeState();
	}

	@Override
	public SemaforoState toYellow() {
		System.out.println("Vermelho | Não é possível mudar (Vermelho >> Amarelo)");
		return this;
	}

	@Override
	public SemaforoState toRed() {
		System.out.println("Vermelho | Não é possível mudar (Vermelho >> Vermelho)");
		return this;
	}


}
