package model;

import interfaces.IPiso;

public class PisoLuxo implements IPiso{
	
	public PisoLuxo(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Porcelanato";
	}
	
	

}
