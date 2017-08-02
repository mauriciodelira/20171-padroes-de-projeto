package br.edu.ifpb.pps.events;

import java.util.EventObject;

import br.edu.ifpb.pps.source.ClimaData;

public class PressaoEvent extends EventObject{

	public PressaoEvent(ClimaData source){
		super(source);
	}
}
