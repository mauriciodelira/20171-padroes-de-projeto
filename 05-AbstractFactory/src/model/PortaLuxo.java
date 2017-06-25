package model;

import interfaces.IPorta;

public class PortaLuxo implements IPorta{
	
	public PortaLuxo(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Madeira de lei";
	}
	
	
}
