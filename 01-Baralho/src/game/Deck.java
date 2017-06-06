package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Deck {
	private ArrayList<Card> deck = new ArrayList<Card>();
	private String[] casas = {"A","2","3","4","5","6","7","8","9","10","J","Q", "K"};
	private String[] naipes = {"ouro","copas","espadas","paus"};
	private Map <String, Integer> valores = new HashMap<String, Integer>();
	
	public Deck() {
		
		for(int i=1; i<casas.length; i++){
			valores.put(casas[i-1], i); ;
		}
		
		for(int i=0; i < naipes.length; i++){
			for(String casa : valores.keySet()){
				deck.add(new Card(naipes[i],casa,valores.get(casa)));
			}		
		}
	}

	public void shuffle(){
		Collections.shuffle(deck, new Random(System.nanoTime()));
	}
	
	public void showDeck(){
		System.out.println(deck.toString());
	}

	public Card getCard(int i){
		Card aux = this.deck.get(i);
		this.deck.remove(i);
		return aux;
	}
	
	public int getSize(){
		return this.deck.size();
	}
	
	public Card getLastCard() {
		return this.deck.get(this.deck.size());
	}
	
	@Override
	public String toString() {
		return "Deck [deck=" + deck + "]";
	}
}
