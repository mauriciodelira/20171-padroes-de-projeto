package game;

import java.util.ArrayList;

public class Rule2 implements Rule{
	
//	pegar duas de baixo
	public void drawCard(Deck deck, ArrayList<Player> players){
		for(Player p : players){
			p.addCard(deck.getCard(deck.getSize()));
		}
	}

}
