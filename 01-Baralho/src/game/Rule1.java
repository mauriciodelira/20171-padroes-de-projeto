package game;

import java.util.ArrayList;

public class Rule1 implements Rule {
	
//	pegar duas de cima
	public void drawCard(Deck deck, ArrayList<Player> players){
		for(Player p : players){
			p.addCard(deck.getCard(0));
		}
	}

}
