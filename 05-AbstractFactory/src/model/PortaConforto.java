package model;

import interfaces.IPorta;

public class PortaConforto implements IPorta{
	
	public PortaConforto(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Madeira";
	}
	
	
}
