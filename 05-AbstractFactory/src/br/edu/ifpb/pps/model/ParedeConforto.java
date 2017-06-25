package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.IParede;

public class ParedeConforto implements IParede{
	
	public ParedeConforto(){
	}

	@Override
	public String getInfo(){
		return this.getClass().getSimpleName()+": Alvenaria";
	}
	

}
