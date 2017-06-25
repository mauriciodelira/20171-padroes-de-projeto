package model;

import interfaces.IPiso;

public class PisoConforto implements IPiso{
	
	public PisoConforto(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Cerâmica esmaltada";
	}
	
	

}
