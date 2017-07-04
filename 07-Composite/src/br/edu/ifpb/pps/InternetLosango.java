package br.edu.ifpb.pps;

import java.util.ArrayList;
import java.util.List;

public class InternetLosango {
	private List<Figura> figuras = null;

	public InternetLosango(){
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
	
	public String draw(){
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
		desenho = "FigInternet - Losango:\n[pontos: "+pontos+", retas: "+retas+"]";
		return desenho;
	}
	
	public String volume(){
		return "Volume internet losango";
	}
	
	public String area(){
		return "Area internet losango";
	}

	public int getPontos(){
		return 4;
	}
	
	public int getRetas(){
		return 4;
	}
}
