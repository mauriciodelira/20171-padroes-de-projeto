package br.edu.ifpb.pps;

public class TipoNormal implements Tipo {
	
	public TipoNormal(){}
	
	public double getValor(double x) {
		if(x > 2)
			return (2 + ((x-2) * 1.5));
		else
			return 2;
	}

}
