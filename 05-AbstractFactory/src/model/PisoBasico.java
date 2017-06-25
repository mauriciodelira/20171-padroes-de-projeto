package model;

import interfaces.IPiso;

public class PisoBasico implements IPiso{
	
	public PisoBasico(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Cerâmica";
	}
	
	

}
