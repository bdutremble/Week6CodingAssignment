package week6CodingAssignment;

public class Card {

	private int rank;
	private int suit;
	
	// card Rank and Suit names for printouts
	private static final String[] cardSuits = {"Diamonds", "Clubs", "Spades", "Hearts"};
	
	private static final String[] cardRanks = {null, null, "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
	public Card(int rank, int suit) {
        this.setRank(rank);
        this.setSuit(suit);
    }
	
	public int getRank() {
		
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public String describeRank(int r) {
		
		return cardRanks[r];
	}
	
	public String describeSuit(int s) {
		
		return cardSuits[s];
	}
	
	// displays card information
	public String describeCard() {
		return describeRank(getRank()) + " of " + describeSuit(getSuit());
	}
}