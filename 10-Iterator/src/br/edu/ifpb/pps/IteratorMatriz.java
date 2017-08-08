package br.edu.ifpb.pps;

public class IteratorMatriz implements IfIterator{
	private Canal[] canais;
	private int count;
	
	public IteratorMatriz(Canal[] canais) {
		this.canais = canais;
		this.count = 0;
	}
	
	@Override
	public void first() {
		this.count = 0;
	}

	@Override
	public void next() {
		this.count++;
	}

	@Override
	public boolean isDone() {
		return this.count == canais.length;
	}

	@Override
	public Canal current() {
		// TODO Auto-generated method stub
		return null;
	}

}
