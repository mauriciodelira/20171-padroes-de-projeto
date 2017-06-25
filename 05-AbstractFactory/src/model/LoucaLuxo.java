package model;

import interfaces.ILouca;

public class LoucaLuxo implements ILouca {
	
	public LoucaLuxo(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Deca (+luxo)";
	}
	

}
