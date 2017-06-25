package br.edu.ifpb.pps.factory;

import br.edu.ifpb.pps.interfaces.IFabricaComodo;
import br.edu.ifpb.pps.interfaces.ILouca;
import br.edu.ifpb.pps.interfaces.IMetal;
import br.edu.ifpb.pps.interfaces.IParede;
import br.edu.ifpb.pps.interfaces.IPiso;
import br.edu.ifpb.pps.interfaces.IPorta;
import br.edu.ifpb.pps.interfaces.ITinta;
import br.edu.ifpb.pps.model.LoucaLuxo;
import br.edu.ifpb.pps.model.MetalLuxo;
import br.edu.ifpb.pps.model.ParedeLuxo;
import br.edu.ifpb.pps.model.PisoLuxo;
import br.edu.ifpb.pps.model.PortaLuxo;
import br.edu.ifpb.pps.model.TintaLuxo;

public class FabricaComodoLuxo implements IFabricaComodo {
	private static FabricaComodoLuxo fbComodoLuxo = null;
	
	private FabricaComodoLuxo(){
	}
	
	public static FabricaComodoLuxo getInstance(){
		if(FabricaComodoLuxo.fbComodoLuxo == null)
			FabricaComodoLuxo.fbComodoLuxo = new FabricaComodoLuxo();
		
		return FabricaComodoLuxo.fbComodoLuxo;
	}
	

	@Override
	public IParede criaParede() {
		return new ParedeLuxo();
	}

	@Override
	public IPorta criaPorta() {
		return new PortaLuxo();
	}

	@Override
	public IPiso criaPiso() {
		return new PisoLuxo();
	}

	@Override
	public IMetal criaMetal() {
		return new MetalLuxo();
	}

	@Override
	public ILouca criaLouca() {
		return new LoucaLuxo();
	}

	@Override
	public ITinta criaTinta() {
		return new TintaLuxo();
	}

}
