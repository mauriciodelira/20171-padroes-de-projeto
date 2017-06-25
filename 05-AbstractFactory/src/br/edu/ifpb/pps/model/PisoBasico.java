package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.IPiso;

public class PisoBasico implements IPiso{
	
	public PisoBasico(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Cerâmica";
	}
	
	

}
