package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.ITinta;

public class TintaBasica implements ITinta{
	public TintaBasica(){
	}

	public String getInfo() {
		return this.getClass().getSimpleName()+": Látex";
	}
	

}
