package br.edu.ifpb.pps.listeners;

import br.edu.ifpb.pps.events.PressaoEvent;
import br.edu.ifpb.pps.source.ClimaData;

public class CuriosoListener extends ClimaAdapter {
	
	@Override
	public void pressaoMudou(PressaoEvent e) {
		System.out.print("CuriosoListener: pressão mudou! Agora é: ");
		System.out.println(Double.toString(((ClimaData) e.getSource()).getPressao()));
	}
}
