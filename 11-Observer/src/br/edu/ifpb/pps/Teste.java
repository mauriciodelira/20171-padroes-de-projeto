package br.edu.ifpb.pps;

import br.edu.ifpb.pps.listeners.AgenciaClimaListener;
import br.edu.ifpb.pps.listeners.ClimaListener;
import br.edu.ifpb.pps.listeners.CuriosoListener;
import br.edu.ifpb.pps.source.ClimaData;

public class Teste {
	
	public static void main(String[] args){
		ClimaData c = new ClimaData();
		
		c.setPressao(10.0);
		c.setTemperatura(29.8);
		c.setUmidade(87);

		ClimaListener l1 = new AgenciaClimaListener();
		ClimaListener l2 = new CuriosoListener();
		
		c.addListener(l1); // Adicionei a AgenciaClimaListener
		c.measurementsChanged();
		System.out.println(" --- --- ");
		
		c.addListener(l2); // Adicionei o CuriosoListener
		c.measurementsChanged();
		
		System.out.println(" --- --- ");
		
		c.removeListener(l1); // Removi a AgenciaClimaListener
		c.measurementsChanged();
		System.out.println(" --- --- ");
	}

}
