package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.IMetal;

public class MetalLuxo implements IMetal{
	
	public MetalLuxo(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Inox";
	}
	

}
