package br.edu.ifpb.pps;

import java.util.ArrayList;
import java.util.List;

public class Circulo extends FiguraComposta{
	private List<Figura> figuras = null;

	public Circulo(){
		this.figuras = new ArrayList<Figura>();
		this.add(new Ponto(0,0));
		this.add(new Ponto(3,3));
		this.add(new Reta());
		this.add(new Reta());
	}
	
	public void add(Figura f){
		this.figuras.add(f);
	}
	
	@Override
	public String desenhaFigura(){
		String desenho;
		int pontos = 0;
		int retas = 0;
		for(int i = 0; i<figuras.size(); i++){
			if(Ponto.class.isInstance(figuras.get(i))){
				pontos++;
			}
			if(Reta.class.isInstance(figuras.get(i))){
				retas++;
			}
		}
		desenho = "FigComposta - Circulo:\n[pontos: "+pontos+", retas: "+retas+"]";
		return desenho;
	}
	
	@Override
	public String perimetroFigura(){
		return "Perimetro circulo";
	}
	
	@Override
	public String areaFigura(){
		return "Area circulo";
	}

	@Override
	public int getPontos(){
		return 2;
	}
	
	@Override
	public int getRetas(){
		return 2;
	}
}
