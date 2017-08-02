package br.edu.ifpb.pps.listeners;

import java.util.EventListener;

import br.edu.ifpb.pps.events.PressaoEvent;
import br.edu.ifpb.pps.events.TemperaturaEvent;
import br.edu.ifpb.pps.events.UmidadeEvent;

public interface ClimaListener extends EventListener{
	
	void temperaturaMudou(TemperaturaEvent e);
	void pressaoMudou(PressaoEvent e);
	void umidadeMudou(UmidadeEvent e);
	
}
