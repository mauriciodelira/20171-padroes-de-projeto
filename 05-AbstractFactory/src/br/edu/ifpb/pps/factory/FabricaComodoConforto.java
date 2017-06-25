package br.edu.ifpb.pps.factory;

import br.edu.ifpb.pps.interfaces.IFabricaComodo;
import br.edu.ifpb.pps.interfaces.ILouca;
import br.edu.ifpb.pps.interfaces.IMetal;
import br.edu.ifpb.pps.interfaces.IParede;
import br.edu.ifpb.pps.interfaces.IPiso;
import br.edu.ifpb.pps.interfaces.IPorta;
import br.edu.ifpb.pps.interfaces.ITinta;
import br.edu.ifpb.pps.model.LoucaConforto;
import br.edu.ifpb.pps.model.MetalConforto;
import br.edu.ifpb.pps.model.ParedeConforto;
import br.edu.ifpb.pps.model.PisoConforto;
import br.edu.ifpb.pps.model.PortaConforto;
import br.edu.ifpb.pps.model.TintaConforto;

public class FabricaComodoConforto implements IFabricaComodo{
	private static FabricaComodoConforto fbComodoConforto = null;
	
	private FabricaComodoConforto(){
	}
	
	public static FabricaComodoConforto getInstance(){
		if(FabricaComodoConforto.fbComodoConforto == null)
			FabricaComodoConforto.fbComodoConforto = new FabricaComodoConforto();
		
		return FabricaComodoConforto.fbComodoConforto ;
	}
	
	@Override
	public IParede criaParede( ) {
		return new ParedeConforto();
	}

	@Override
	public IPorta criaPorta( ) {
		return new PortaConforto();
	}

	@Override
	public IPiso criaPiso() {
		return new PisoConforto();
	}

	@Override
	public IMetal criaMetal( ) {
		return new MetalConforto();
	}

	@Override
	public ILouca criaLouca( ) {
		return new LoucaConforto();
	}

	@Override
	public ITinta criaTinta() {
		return new TintaConforto();
	}
	
}
