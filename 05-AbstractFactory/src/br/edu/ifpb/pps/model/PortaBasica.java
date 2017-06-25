package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.IPorta;

public class PortaBasica implements IPorta{
	
	public PortaBasica(){
	}

	public String getInfo() {
		return this.getClass().getSimpleName()+": MDF";
	}
	
	
}
