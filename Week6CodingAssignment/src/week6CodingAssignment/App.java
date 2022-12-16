package week6CodingAssignment;

public class App {

	public static void main(String[] args) {
	
	// create and shuffle deck
	Deck deck = new Deck();
	
	deck.shuffle(deck);
	
	// create and name players
	Player player1 = new Player("Hank");
	Player player2 = new Player("Walter");
	
	//call buildHands method to create a hand for each player
	deck.buildHands(deck, player1, player2);
	
	// flip loop to show each player's cards (this loop plays the game)
	for(int i=0; i < 26; i++) {
		System.out.println("Round " + (i+1));
		Card card1 = player1.flip(player1.getHand());
		Card card2 = player2.flip(player2.getHand());
		if(card1.getRank() > card2.getRank()) {
			player1.incrementScore();
			System.out.println(player1.getName() + " wins the round.");
			}else if(card2.getRank() > card1.getRank()) {
			player2.incrementScore();
			System.out.println(player2.getName() + " wins the round.");
			}else {
				System.out.println("The round is a tie.");
			}
		System.out.println("Current scores: " + player1.getName() + " " + player1.getScore() + ", " + player2.getName() + " " + player2.getScore());
		System.out.println();
	}
	
	// display and evaluate player scores
	System.out.println("FINAL SCORES");
	System.out.println(player1.getName() + " " + player1.getScore());
	System.out.println(player2.getName() + " " + player2.getScore());
	System.out.println();
	if(player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " wins!");
		}else if(player1.getScore() < player2.getScore()){
			System.out.println(player2.getName() + " wins!");
		}else {
			System.out.println("It's a draw.");
			
	}
	}
}
