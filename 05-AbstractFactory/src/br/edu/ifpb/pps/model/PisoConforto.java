package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.IPiso;

public class PisoConforto implements IPiso{
	
	public PisoConforto(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Cerâmica esmaltada";
	}
	
	

}
