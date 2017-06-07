package br.edu.ifpb.pps;

public class Teste {
	public static void main(String[] args){
		for(int i = 0; i<10; i++){
			// Capturar 10x a instância de Incremental
			Incremental inc = Incremental.getInstance();
			System.out.println(inc);
		}
	}
}
