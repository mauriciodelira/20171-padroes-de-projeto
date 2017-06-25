package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.IPorta;

public class PortaLuxo implements IPorta{
	
	public PortaLuxo(){
	}
	
	public String getInfo(){
		return this.getClass().getSimpleName()+": Madeira de lei";
	}
	
	
}
