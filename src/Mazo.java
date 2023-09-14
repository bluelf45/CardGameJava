import java.util.ArrayList;

public class Mazo {
	ArrayList<Carta> Deck = new ArrayList<Carta>();
	public Carta draw() {
		Carta carta=Deck.get(0);
		Deck.remove(0);
		return carta;
	}
	
	public void shuffle() {
		int size=Deck.size(), index, i;
		ArrayList<Carta> NewDeck = new ArrayList<Carta>();
		for (i=0; i<size; i++) {
			NewDeck.add(Deck.get(i));
		}
		i=0;
		while(NewDeck.size()>0) {
			index=(int)(Math.random()*NewDeck.size());
			Deck.add(i, NewDeck.remove(index));
		}
	}
	
	public void putBack(Carta carta) {
		Deck.add(0, carta);
	}
}
