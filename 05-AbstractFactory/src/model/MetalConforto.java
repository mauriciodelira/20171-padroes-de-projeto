package model;

import interfaces.IMetal;

public class MetalConforto implements IMetal{
	
	public MetalConforto(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Alumínio";
	}

}
