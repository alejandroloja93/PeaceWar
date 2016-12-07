import java.util.Collections;
import java.util.Stack;
//Used a stack to hold the deck of cards 
public class Deck {
	private Stack<Card> cards = new Stack<Card>();
	//Draw the cards
	public Card draw() {
		return cards.pop();
	}
	//Constructor , choice for either war or peace ;
	//enhanced loops to show the 2 cards that were picked
	public Deck(int choice) {
		if(choice == 0){
			for(Suit suit : Suit.values()) {
				for(Value value : Value.values() ) {
					cards.push(new War(suit, value));
				}
			}
		} else {
			for(Suit suit : Suit.values()) {
				for(Value value : Value.values() ) {
					cards.push(new Peace(suit, value));
				}
			}
		}
		//Method that shuffles the deck of cards
		Collections.shuffle(cards);
	}
}

