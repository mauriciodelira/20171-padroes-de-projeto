package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.IMetal;

public class MetalConforto implements IMetal{
	
	public MetalConforto(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Alumínio";
	}

}
