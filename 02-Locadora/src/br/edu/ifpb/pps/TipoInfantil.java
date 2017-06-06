package br.edu.ifpb.pps;

public class TipoInfantil implements Tipo {
	
	public TipoInfantil(){
	}
	
	public double getValor(double x) {
		if(x > 3)
			return (1.5 + ((x-3) * 1.5));
		else
			return 1.5;
	}

}
