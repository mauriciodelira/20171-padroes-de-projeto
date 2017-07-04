package br.edu.ifpb.pps;

import java.util.ArrayList;
import java.util.List;

public class Quadrilatero extends FiguraComposta{
	private List<Figura> figuras = null;

	public Quadrilatero(){
		this.figuras = new ArrayList<Figura>();
		this.add(new Ponto());
		this.add(new Ponto());
		this.add(new Ponto());
		this.add(new Ponto());
		this.add(new Reta());
		this.add(new Reta());
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
		desenho = "FigComposta - Quadrado:\n[pontos: "+pontos+", retas: "+retas+"]";
		return desenho;
	}
	
	@Override
	public String perimetroFigura(){
		return "Perimetro quadrado";
	}
	
	@Override
	public String areaFigura(){
		return "Area quadrado";
	}

	@Override
	public int getPontos(){
		return 4;
	}
	
	@Override
	public int getRetas(){
		return 4;
	}
}
