package factory;

import interfaces.IFabricaComodo;
import interfaces.ILouca;
import interfaces.IMetal;
import interfaces.IParede;
import interfaces.IPiso;
import interfaces.IPorta;
import interfaces.ITinta;
import model.LoucaConforto;
import model.MetalConforto;
import model.ParedeConforto;
import model.PisoConforto;
import model.PortaConforto;
import model.TintaConforto;

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
