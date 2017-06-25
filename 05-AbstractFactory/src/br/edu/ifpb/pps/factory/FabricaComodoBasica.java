package br.edu.ifpb.pps.factory;

import br.edu.ifpb.pps.interfaces.IFabricaComodo;
import br.edu.ifpb.pps.interfaces.ILouca;
import br.edu.ifpb.pps.interfaces.IMetal;
import br.edu.ifpb.pps.interfaces.IParede;
import br.edu.ifpb.pps.interfaces.IPiso;
import br.edu.ifpb.pps.interfaces.IPorta;
import br.edu.ifpb.pps.interfaces.ITinta;
import br.edu.ifpb.pps.model.LoucaBasica;
import br.edu.ifpb.pps.model.MetalBasico;
import br.edu.ifpb.pps.model.ParedeBasica;
import br.edu.ifpb.pps.model.PisoBasico;
import br.edu.ifpb.pps.model.PortaBasica;
import br.edu.ifpb.pps.model.TintaBasica;

public class FabricaComodoBasica implements IFabricaComodo{
	private static FabricaComodoBasica fbComodoBasica = null;
	
	private FabricaComodoBasica(){
	}
	
	public static FabricaComodoBasica getInstance(){
		if(FabricaComodoBasica.fbComodoBasica == null)
			FabricaComodoBasica.fbComodoBasica = new FabricaComodoBasica();
		
		return FabricaComodoBasica.fbComodoBasica;
	}
	
	@Override
	public IParede criaParede() {
		return new ParedeBasica();
	}

	@Override
	public IPorta criaPorta() {
		return new PortaBasica();
	}

	@Override
	public IPiso criaPiso() {
		return new PisoBasico();
	}

	@Override
	public IMetal criaMetal() {
		return new MetalBasico();
	}

	@Override
	public ILouca criaLouca() {
		return new LoucaBasica();
	}

	@Override
	public ITinta criaTinta() {
		return new TintaBasica();
	}

}
