package br.edu.ifpb.pps.events;

import java.util.EventObject;

import br.edu.ifpb.pps.source.ClimaData;

public class TemperaturaEvent extends EventObject {

	public TemperaturaEvent(ClimaData source) {
		super(source);
	}

}
