package br.edu.ifpb.pps;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		String n = "";
		Scanner in = new Scanner(System.in);
		
		while(!n.equalsIgnoreCase("X"))
		{
			System.out.print("Digite seu nome: ");
			n = in.nextLine();
			
			if(n.equalsIgnoreCase("X")){
				System.out.println("-- encerrado --");
				return;
			};
			
			Nome nome = FactoryNome.getNome(n);
			if(nome != null)
				System.out.println("Nome: " + nome.getNome());
			
			
		}
	}
}
