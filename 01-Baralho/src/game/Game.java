package game;

import java.util.ArrayList;

public class Game {
	private Deck deck;
	private ArrayList<Player> players;
//	 Pode ser diferentes tipos de regra
	private Rule rule;

	
	public Game(ArrayList<Player> p, Rule rule){
		this.deck = new Deck();
		this.players = p;
		this.rule = rule;
	}
	
	public void startGame(){
		this.deck.shuffle();
		
//		Dividir cartas j� 
		for(int i=0; i<11; i++)
			this.drawCards();
		
		if(checkGame().equals("tie"))
			this.drawCards();
		
		for(int i = 0; i < 10; i++) {
			rule.drawCard(deck, players);
			deck.shuffle();
			System.out.println(deck.toString());
			
		}
	}
	
	private String checkGame() {
		if(players.get(0).getPontos() > players.get(1).getPontos());
		return "";
	}

	public void drawCards(){
		rule.drawCard(deck, players);
		
	}
}
