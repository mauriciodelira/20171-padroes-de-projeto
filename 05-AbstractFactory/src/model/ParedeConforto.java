package model;

import interfaces.IParede;

public class ParedeConforto implements IParede{
	
	public ParedeConforto(){
	}

	@Override
	public String getInfo(){
		return this.getClass().getSimpleName()+": Alvenaria";
	}
	

}
