package br.edu.ifpb.pps.states;

public class AmareloIntermitenteState extends SemaforoState {

	@Override
	public SemaforoState toGreen() {
		System.out.println("Amarelo intermitente | só volta com on()");
		return this;
	}

	@Override
	public SemaforoState toYellow() {
		System.out.println("Amarelo intermitente | só volta com on()");
		return this;
	}

	@Override
	public SemaforoState toRed() {
		System.out.println("Amarelo intermitente | só volta com on()");
		return this;
	}

}
