package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.IParede;

public class ParedeLuxo implements IParede{
	
	public ParedeLuxo(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Dry wall";
	}
	

}
