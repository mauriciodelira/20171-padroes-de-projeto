package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.IParede;

public class ParedeBasica implements IParede{
	
	public ParedeBasica(){
	}


	public String getInfo() {
		return this.getClass().getSimpleName()+": gesso";
	}
	

}
