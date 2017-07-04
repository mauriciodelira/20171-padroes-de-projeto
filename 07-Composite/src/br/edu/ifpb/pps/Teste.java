package br.edu.ifpb.pps;

public class Teste {

	public static void main(String[] args) {
		System.out.println(new Ponto().desenhaFigura());
		System.out.println(new Reta().desenhaFigura());
		System.out.println(new Figura().desenhaFigura());
		System.out.println(new FiguraComposta().desenhaFigura());
		System.out.println(new Circulo().desenhaFigura());
		System.out.println(new Triangulo().desenhaFigura());
		System.out.println(new Quadrilatero().desenhaFigura());
		
		FiguraComposta composta = new FiguraComposta();
		
		composta.add(new Triangulo()); // add três pontos e três retas
		System.out.println(composta.desenhaFigura());
		composta.add(new Quadrilatero()); // add quatro pontos e quatro retas
		System.out.println(composta.desenhaFigura());
		composta.add(new Circulo()); // add dois pontos e duas retas
		System.out.println(composta.desenhaFigura());
		composta.add(new Ponto()); // add um ponto
		composta.add(new Ponto()); // add um ponto
		System.out.println(composta.desenhaFigura());
		composta.add(new Reta()); // add uma reta
		
		
//		Novas figuras com adapter!!
		System.out.println(new FiguraInternetLosangoAdapter().desenhaFigura());
		System.out.println(new FiguraInternetQuadradoAdapter().desenhaFigura());
		
	}

}
