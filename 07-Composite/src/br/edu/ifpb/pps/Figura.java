package br.edu.ifpb.pps;

public class Figura implements IFigura{
	
	public Figura(){}
	
	public String perimetroFigura(){
		return "Perimetro Figura";
	}
	
	public String areaFigura(){
		return "Area Figura";
	}
	
	public String desenhaFigura(){
		return "[Figura]";
	}

	public int getPontos() {
		return 0;
	}

	public int getRetas() {
		return 0;
	}
}
