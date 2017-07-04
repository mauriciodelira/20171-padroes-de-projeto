package br.edu.ifpb.pps;

public class Ponto extends Figura implements IFigura{
	int x, y;
	public Ponto(){
		this.x=0; 
		this.y=0;
	}
	public Ponto(int x, int y){
		this.x = x;
		this.y = y;
	};
	
	@Override
	public String desenhaFigura(){
		return "[Ponto: x = "+this.x+"+; y = "+this.y+"]";
	}
	
	@Override
	public int getPontos(){
		return 1;
	}

	@Override
	public int getRetas() {
		return 0;
	}
	@Override
	public String perimetroFigura() {
		return "Perimetro ponto: "+x+", "+y+"";
	}

	@Override
	public String areaFigura() {
		return "Area ponto";
	}

	
}
