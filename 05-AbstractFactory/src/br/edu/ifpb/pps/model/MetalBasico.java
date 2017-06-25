package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.IMetal;

public class MetalBasico implements IMetal{
	
	public MetalBasico(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Ferro";
	}
	

}
