package factory;

import interfaces.IFabricaComodo;
import interfaces.ILouca;
import interfaces.IMetal;
import interfaces.IParede;
import interfaces.IPiso;
import interfaces.IPorta;
import interfaces.ITinta;
import model.LoucaLuxo;
import model.MetalLuxo;
import model.ParedeLuxo;
import model.PisoLuxo;
import model.PortaLuxo;
import model.TintaLuxo;

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
