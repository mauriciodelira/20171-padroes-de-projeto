package model;

import interfaces.ITinta;

public class TintaBasica implements ITinta{
	public TintaBasica(){
	}

	public String getInfo() {
		return this.getClass().getSimpleName()+": Látex";
	}
	

}
