package br.edu.ifpb.pps;

public class CanaisFilme implements IfUnificadorCanais {
	Canal[] canais = new Canal[6];
	
	public CanaisFilme(){
		
	}

	@Override
	public IfIterator criarIterator() {
		return new IteratorMatriz(canais);
	}
	
}
