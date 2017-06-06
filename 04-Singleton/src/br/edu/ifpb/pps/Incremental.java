package br.edu.ifpb.pps;

public class Incremental {
	
	/*
	private static int count = 0;
	private int numero;
	
	public Incremental(){
		numero = ++count;
	}
	
	public String toString(){
		return "Incremental "+numero;	
	}
	*/
	
	private static Incremental instance = null;
	
	
	private Incremental(){
		
	}
	
	public static Incremental getInstance(){
		if(instance == null)
			instance = new Incremental();
		return instance;
	}
}
