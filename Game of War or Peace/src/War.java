public class War implements Card{
	private final Suit suit;
	private final Value value;
	//Prints out value and suit of the card
	public String toString() {
		return value.toString() + " of " + suit.toString() + "s";
	}
	
	//Constructor 
	public War(Suit suit, Value value) {
		 this.suit = suit;
		 this.value = value;
	}
//Top card is the winner
	@Override
	public boolean winner(Card card) {
		// TODO Auto-generated method stub
		return (value.compareTo(((War)card).value) > 0);   
	}
}
