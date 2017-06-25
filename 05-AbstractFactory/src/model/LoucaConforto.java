package model;

import interfaces.ILouca;

public class LoucaConforto implements ILouca {
	public LoucaConforto(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Elizabeth";
	}
	

}
