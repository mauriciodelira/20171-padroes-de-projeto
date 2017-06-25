package model;

import interfaces.ITinta;

public class TintaConforto implements ITinta{
	
	public TintaConforto(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Acrílica";
	}
	

}
