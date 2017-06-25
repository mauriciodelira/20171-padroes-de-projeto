package model;

import interfaces.IPorta;

public class PortaBasica implements IPorta{
	
	public PortaBasica(){
	}

	public String getInfo() {
		return this.getClass().getSimpleName()+": MDF";
	}
	
	
}
