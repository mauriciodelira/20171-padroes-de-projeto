package factory;

import interfaces.IFabricaComodo;
import interfaces.ILouca;
import interfaces.IMetal;
import interfaces.IParede;
import interfaces.IPiso;
import interfaces.IPorta;
import interfaces.ITinta;
import model.LoucaBasica;
import model.MetalBasico;
import model.ParedeBasica;
import model.PisoBasico;
import model.PortaBasica;
import model.TintaBasica;

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
