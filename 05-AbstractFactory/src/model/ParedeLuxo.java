package model;

import interfaces.IParede;

public class ParedeLuxo implements IParede{
	
	public ParedeLuxo(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Dry wall";
	}
	

}
