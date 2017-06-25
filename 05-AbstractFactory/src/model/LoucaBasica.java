package model;

import interfaces.ILouca;

public class LoucaBasica implements ILouca{	
	public LoucaBasica(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Mais barata";
	}
	

}
