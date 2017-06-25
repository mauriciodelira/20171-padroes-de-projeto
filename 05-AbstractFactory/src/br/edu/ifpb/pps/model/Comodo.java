package br.edu.ifpb.pps.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.pps.interfaces.ILouca;
import br.edu.ifpb.pps.interfaces.IMetal;
import br.edu.ifpb.pps.interfaces.IParede;
import br.edu.ifpb.pps.interfaces.IPiso;
import br.edu.ifpb.pps.interfaces.IPorta;
import br.edu.ifpb.pps.interfaces.ITinta;

public class Comodo {
	private List<IParede> paredes;
	private List<ILouca> loucas;
	private List<IMetal> metais;
	private List<IPorta> portas;
	private ITinta tinta;
	private IPiso piso;

	public Comodo() {
		this.paredes = new ArrayList<IParede>();
		this.loucas =  new ArrayList<ILouca>();
		this.portas =  new ArrayList<IPorta>();
		this.metais =  new ArrayList<IMetal>();
	}

	public List<IParede> getParedes() {
		return paredes;
	}
	
	public void setParedes(List<IParede> paredes) {
		this.paredes = paredes;
	}

	public List<ILouca> getLoucas() {
		return loucas;
	}

	public void setLoucas(List<ILouca> loucas) {
		this.loucas = loucas;
	}

	public List<IMetal> getMetais() {
		return metais;
	}
	
	public void setMetais(List<IMetal> metais) {
		this.metais = metais;
	}

	public List<IPorta> getPortas() {
		return portas;
	}
	
	public void setPortas(List<IPorta> portas) {
		this.portas = portas;
	}

	public ITinta getTinta() {
		return tinta;
	}

	public void setTinta(ITinta tinta) {
		this.tinta = tinta;
	}

	public IPiso getPiso() {
		return piso;
	}

	public void setPiso(IPiso piso) {
		this.piso = piso;
	}
	
	public String getInfo(){
		String info = "--- Cômodo ---\n";
		info += this.piso.getInfo()+"\n";
		info += this.tinta.getInfo()+"\n";
		for(IParede p : this.paredes)
			info += p.getInfo()+"\n";
		for(IPorta p : this.portas)
			info += p.getInfo()+"\n";
		for(ILouca l : this.loucas)
			info += l.getInfo()+"\n";
		for(IMetal m : this.metais)
			info += m.getInfo()+"\n";
		
		return info;
		
	}

	/* TODO nas funções "add" abaixo é que se deve
	 * implementar um limitador de quantidade de
	 * cada List<> do Comodo em questão.
	 * */
	
	public void addParede(IParede parede){
		this.paredes.add(parede);
	}
	
	public void addLouca(ILouca louca){
		this.loucas.add(louca);
	}
	
	public void addMetal(IMetal metal){
		this.metais.add(metal);
	}
	
	public void addPorta(IPorta porta){
		this.portas.add(porta);
	}
	
}
