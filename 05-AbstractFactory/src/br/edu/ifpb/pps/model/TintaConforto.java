package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.ITinta;

public class TintaConforto implements ITinta{
	
	public TintaConforto(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Acrílica";
	}
	

}
