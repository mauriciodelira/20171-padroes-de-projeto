package br.edu.ifpb.pps;

import br.edu.ifpb.pps.factory.FabricaComodoBasica;
import br.edu.ifpb.pps.factory.FabricaComodoConforto;
import br.edu.ifpb.pps.factory.FabricaComodoLuxo;
import br.edu.ifpb.pps.interfaces.IFabricaComodo;
import br.edu.ifpb.pps.model.Comodo;

public class Teste {
	
	public static void main(String[] args){
		IFabricaComodo fcB = FabricaComodoBasica.getInstance();
		IFabricaComodo fcC = FabricaComodoConforto.getInstance();
		IFabricaComodo fcL = FabricaComodoLuxo.getInstance();
		Comodo comodo = new Comodo();

		try {
//			Aqui a fábrica cria o elemento de acordo com
//			o tipo de FÁBRICA (no caso, fcC é Conforto).
//			Feito isso, joga para o cômodo.

			comodo.addLouca(fcC.criaLouca()); /* TODO implementar a limitação de louças, metais, e por aí vai. */ 
			comodo.addMetal(fcB.criaMetal());
			comodo.addParede(fcC.criaParede());
			comodo.addParede(fcC.criaParede());
			comodo.addParede(fcC.criaParede());
			comodo.addPorta(fcL.criaPorta());
			comodo.setPiso(fcL.criaPiso());
			comodo.setTinta(fcB.criaTinta());
			
			System.out.println(comodo.getInfo()); /* TODO implementar toString() que exibe todas as informações dos atributos do cômodo */
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
