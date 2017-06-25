package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.ILouca;

public class LoucaBasica implements ILouca{	
	public LoucaBasica(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Mais barata";
	}
	

}
