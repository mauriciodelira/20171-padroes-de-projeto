package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.states.AmareloIntermitenteState;
import br.edu.ifpb.pps.states.SemaforoState;

public class Semaforo {
	private SemaforoState state;
	
	public Semaforo(){
		this.state = new AmareloIntermitenteState();
		System.out.println("Semaforo | Iniciou: amarelo intermitente");
		this.getState();
	}
	
	public void off(){
		this.state = state.off();
		this.getState();
	}

	public void on(){
		this.state = state.on();
		this.getState();
	}

	public void toGreen(){
		this.state = state.toGreen();
		this.getState();
	}

	public void toYellow(){
		this.state = state.toYellow();
		this.getState();
	}

	public void toRed(){
		this.state = state.toRed();
		this.getState();
	}

	public void panic(){
		this.state = state.panic();
		this.getState();
	}

	public void getState(){
		System.out.println(String.format("--- Semaforo | Estado: %s\n", state.getClass().getSimpleName()));
	}
	
}
