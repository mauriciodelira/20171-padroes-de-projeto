package model;

import interfaces.ITinta;

public class TintaLuxo implements ITinta{
	public TintaLuxo(){
	}

	public String getInfo(){
		return this.getClass().getSimpleName()+": Superlavável";
	}
	

}
