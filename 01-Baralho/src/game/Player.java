package game;

import java.util.ArrayList;

public class Player {
	private String nome;
	private ArrayList<Card> cards;
	private int pontos = 0;
	
	public Player(){
		this.nome = "Jogador";
		this.cards = new ArrayList<Card>();
	}
	public Player(String nome){
		this.nome = nome;
	}
	
	public void addCard(Card c){
		if(cards!=null){
			cards.add(c);
			pontos+=c.getValor();
		}
	}
	
	public int getPontos(){
		return this.pontos;
	}

}
