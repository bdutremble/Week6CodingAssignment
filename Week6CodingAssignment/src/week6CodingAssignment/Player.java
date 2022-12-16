package week6CodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class Player {

	
	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;
	private String name;
	
	public Player (String name){
		setScore(0);
		setName(name);
		setHand(hand);
		
	}
	// method to flip and show a player's next card
	public Card flip(List<Card>hand) {
		Card flippedCard = hand.remove(hand.size()-1);
		System.out.println(this.name + "'s card: " + flippedCard.describeCard());
		return flippedCard;
	}
	
	public void draw(Deck deck) {
		Card drawnCard = deck.removeCard();
		hand.add(drawnCard);
	}
	
	public void incrementScore() {
		setScore(score + 1);
	}
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
