package br.edu.ifpb.pps;

public class Reta extends Figura implements IFigura{
	public Reta(){};
	
	@Override
	public String desenhaFigura(){
		return "[Reta]";
	}
	
	@Override
	public int getRetas(){
		return 1;
	}
	
	@Override
	public int getPontos(){
		return 2;
	}

	@Override
	public String perimetroFigura() {
		return "[Reta linha]";
	}

	@Override
	public String areaFigura() {
		return "[Area linha]";
	}
}
