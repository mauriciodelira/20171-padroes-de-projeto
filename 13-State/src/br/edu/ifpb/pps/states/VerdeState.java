package br.edu.ifpb.pps.states;

public class VerdeState extends SemaforoState {

	@Override
	public SemaforoState toGreen() {
		System.out.println("Verde | Não é possível mudar (Verde >> Verde)");
		return this;
	}

	@Override
	public SemaforoState toYellow() {
		System.out.println("Verde >> Amarelo");
		return new AmareloState();
	}

	@Override
	public SemaforoState toRed() {
		System.out.println("Verde | Não é possível mudar (Verde >> Vermelho)");
		return this;
	}

}
