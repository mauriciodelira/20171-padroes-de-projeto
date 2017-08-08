package br.edu.ifpb.pps.states;

public class AmareloState extends SemaforoState {

	@Override
	public SemaforoState toGreen() {
		System.out.println("Amarelo | Não é possível mudar (Amarelo >> Verde)");
		return this;
	}

	@Override
	public SemaforoState toYellow() {
		System.out.println("Amarelo | Não é possível mudar (Amarelo >> Amarelo)");
		return this;
	}

	@Override
	public SemaforoState toRed() {
		System.out.println("Amarelo >> Vermelho");
		return new VermelhoState();
	}


}
