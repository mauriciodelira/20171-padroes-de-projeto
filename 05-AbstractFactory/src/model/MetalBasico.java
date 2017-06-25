package model;

import interfaces.IMetal;

public class MetalBasico implements IMetal{
	
	public MetalBasico(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Ferro";
	}
	

}
