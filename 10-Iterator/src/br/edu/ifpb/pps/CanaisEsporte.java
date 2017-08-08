package br.edu.ifpb.pps;

import java.util.ArrayList;

public class CanaisEsporte implements IfUnificadorCanais {
	ArrayList<Canal> canais;
	
	public IfIterator criarIterator() {
		return new IteratorLista(canais);
	}

}
