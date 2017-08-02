package br.edu.ifpb.pps.events;

import java.util.EventObject;

import br.edu.ifpb.pps.source.ClimaData;

public class UmidadeEvent extends EventObject{
	
	public UmidadeEvent(ClimaData source){
		super(source);
	}

}
