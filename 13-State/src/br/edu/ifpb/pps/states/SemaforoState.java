package br.edu.ifpb.pps.states;

public abstract class SemaforoState {
	public abstract SemaforoState toGreen();
	public abstract SemaforoState toYellow();
	public abstract SemaforoState toRed();

	public SemaforoState off() {
		System.out.println("SemaforoState off() | estado: amarelo intermitente");
		return new AmareloIntermitenteState();
	}

	public SemaforoState on() {
		System.out.println("SemaforoState on() | estado: vermelho");
		return new VermelhoState();
	}

	public SemaforoState panic() {
		System.out.println("SemaforoState panic() | estado: vermelho");
		return new VermelhoState();
	}
}
