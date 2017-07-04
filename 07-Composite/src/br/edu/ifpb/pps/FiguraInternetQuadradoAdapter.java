package br.edu.ifpb.pps;

public class FiguraInternetQuadradoAdapter extends InternetQuadrado implements IFigura{

	@Override
	public String perimetroFigura() {
		return volume();
	}

	@Override
	public String areaFigura() {
		return area();
	}

	@Override
	public String desenhaFigura() {
		return draw();
	}

	@Override
	public int getPontos() {
		return 4;
	}

	@Override
	public int getRetas() {
		return 4;
	}

}
