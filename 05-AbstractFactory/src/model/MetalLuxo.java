package model;

import interfaces.IMetal;

public class MetalLuxo implements IMetal{
	
	public MetalLuxo(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Inox";
	}
	

}
