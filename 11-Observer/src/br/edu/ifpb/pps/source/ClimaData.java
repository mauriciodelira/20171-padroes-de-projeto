package br.edu.ifpb.pps.source;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.pps.events.PressaoEvent;
import br.edu.ifpb.pps.events.TemperaturaEvent;
import br.edu.ifpb.pps.events.UmidadeEvent;
import br.edu.ifpb.pps.listeners.ClimaListener;

public class ClimaData {
	private double temperatura;
	private double umidade;
	private double pressao;
	
	private List<ClimaListener> listeners = new ArrayList<ClimaListener>();
	
	public void addListener(ClimaListener l){
		if(!this.listeners.contains(l))
			this.listeners.add(l);
	}
	
	public void removeListener(ClimaListener l){
		if(this.listeners.contains(l))
			this.listeners.remove(l);
	}
	
	public void measurementsChanged(){
		PressaoEvent p = new PressaoEvent(this);
		TemperaturaEvent t = new TemperaturaEvent(this);
		UmidadeEvent u = new UmidadeEvent(this);
		
		for(ClimaListener l : listeners){
			l.pressaoMudou(p);
			l.temperaturaMudou(t);
			l.umidadeMudou(u);
		}
	}
	
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public double getUmidade() {
		return umidade;
	}
	public void setUmidade(double umidade) {
		this.umidade = umidade;
	}
	public double getPressao() {
		return pressao;
	}
	public void setPressao(double pressao) {
		this.pressao = pressao;
	}
	
	

}
