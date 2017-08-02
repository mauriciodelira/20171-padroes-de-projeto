package br.edu.ifpb.pps.listeners;

import br.edu.ifpb.pps.events.PressaoEvent;
import br.edu.ifpb.pps.events.TemperaturaEvent;
import br.edu.ifpb.pps.events.UmidadeEvent;
import br.edu.ifpb.pps.source.ClimaData;

public class AgenciaClimaListener extends ClimaAdapter{
	
	@Override
	public void temperaturaMudou(TemperaturaEvent e){
		System.out.print("AgenciaClimaListener: temperatura mudou: ");
		System.out.println(Double.toString(((ClimaData) e.getSource()).getTemperatura()));
	}
	
	@Override
	public void umidadeMudou(UmidadeEvent e){
		System.out.print("AgenciaClimaListener: umidade mudou: ");
		System.out.println(Double.toString(((ClimaData) e.getSource()).getUmidade()));
	}
	
	@Override
	public void pressaoMudou(PressaoEvent e){
		System.out.print("AgenciaClimaListener: pressão mudou: ");
		System.out.println(Double.toString(((ClimaData) e.getSource()).getPressao()));
	}
	
	
}
