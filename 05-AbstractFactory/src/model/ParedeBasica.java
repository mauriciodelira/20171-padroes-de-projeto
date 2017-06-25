package model;

import interfaces.IParede;

public class ParedeBasica implements IParede{
	
	public ParedeBasica(){
	}


	public String getInfo() {
		return this.getClass().getSimpleName()+": gesso";
	}
	

}
