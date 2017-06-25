package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.ILouca;

public class LoucaLuxo implements ILouca {
	
	public LoucaLuxo(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Deca (+luxo)";
	}
	

}
