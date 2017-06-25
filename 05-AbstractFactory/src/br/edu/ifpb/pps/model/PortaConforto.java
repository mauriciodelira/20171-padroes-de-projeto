package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.IPorta;

public class PortaConforto implements IPorta{
	
	public PortaConforto(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Madeira";
	}
	
	
}
