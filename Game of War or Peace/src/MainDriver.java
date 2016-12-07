import java.util.EmptyStackException;
import java.util.Scanner;
public class MainDriver {
	public static void main(String [] args) {
		//Choice for card game of either war or piece
		int choice = 0;
		Card firstCard, secondCard;
		boolean incorrectChoice = false;
		int firstPlayerScore = 0, secondPlayerScore = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Would you like to play War or Peace. Enter 0 for War and enter 1 for peace");
			choice = scan.nextInt();
			incorrectChoice = (choice != 0 && choice != 1);
			if(incorrectChoice) {
				System.out.println("Invalid choice. Please enter a valid choice");
			}
		}while(incorrectChoice);
		Deck firstDeck = new Deck(choice), secondDeck = new Deck(choice);
		// Draws the 2 cards and calls method to determine which card is the winner.
		while(true) {
			try{
				firstCard = firstDeck.draw();
				secondCard = secondDeck.draw();
				if(firstCard.winner(secondCard)) {
					System.out.println(firstCard + " " + secondCard + " " + ". The first card is the winner");
					firstPlayerScore++;
				} else if(secondCard.winner(firstCard)){
					System.out.println(firstCard + " " + secondCard + " " + ". The second card is the winner");
					secondPlayerScore++;
				}
			} catch(EmptyStackException e) {
				break;
			}
		}
		if(firstPlayerScore > secondPlayerScore){
			System.out.println("The first player is the winner");
		} else if(secondPlayerScore > firstPlayerScore){
			System.out.println("The second player is the winner");
		} else {
			System.out.println("There is a tie");
		}
		scan.close();
	}
}
