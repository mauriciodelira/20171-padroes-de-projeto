package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.IPiso;

public class PisoLuxo implements IPiso{
	
	public PisoLuxo(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Porcelanato";
	}
	
	

}
