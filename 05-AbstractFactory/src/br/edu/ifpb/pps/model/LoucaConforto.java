package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.ILouca;

public class LoucaConforto implements ILouca {
	public LoucaConforto(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Elizabeth";
	}
	

}
