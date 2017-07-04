package br.edu.ifpb.pps;

import java.util.ArrayList;
import java.util.List;

public class FiguraComposta extends Figura implements IFigura{
	private List<Figura> figuras = null;

	public FiguraComposta(){
		this.figuras = new ArrayList<Figura>();
	}
	
	public void add(Figura f){
		this.figuras.add(f);
	}
	
	@Override
	public int getPontos(){
		return 0;
	}
	
	@Override
	public int getRetas(){
		return 0;
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
			if(FiguraComposta.class.isInstance(figuras.get(i))){
				pontos+=figuras.get(i).getPontos();
				retas+=figuras.get(i).getRetas();
			}
		}
		desenho = "Figura composta:\n[pontos: "+pontos+", retas: "+retas+"]";
		return desenho;
	}
	
	@Override
	public String perimetroFigura(){
		return "Perimetro figura composta";
	}
	
	@Override
	public String areaFigura(){
		return "Area figura composta";
	}

}
