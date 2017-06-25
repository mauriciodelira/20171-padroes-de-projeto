package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.interfaces.ITinta;

public class TintaLuxo implements ITinta{
	public TintaLuxo(){
	}

	public String getInfo(){
		return this.getClass().getSimpleName()+": Superlavável";
	}
	

}
