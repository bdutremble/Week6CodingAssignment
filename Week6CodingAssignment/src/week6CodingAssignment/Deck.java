package week6CodingAssignment;

import java.util.*	;

public class Deck {

	private List<Card> cards= new ArrayList<Card>();
	
	// constructor instantiates a new deck
    public Deck(){
        cards = new ArrayList<Card>();

        for(int a=0; a<=3; a++){
            for(int b=2; b<15;b++){
                cards.add(new Card(b,a));   
            }
        }
    }
	
	public void shuffle(Deck deck) {
		Collections.shuffle(cards);
	}
	
	public void print() {
		for(Card card: cards) {
			System.out.println(card.describeCard());
		}
	}
	
	public int getSize() {
		return cards.size();
	}
	
	
	public Card removeCard () {
		return cards.remove(cards.size()-1);
	}
	
	// split 52-card deck into two 26-card decks (one for each player)
	public void buildHands (Deck cards, Player player1, Player player2) {
			int deckSize = cards.getSize() - 1;
			for(int i=0; i <= deckSize; i++) {
				if(i % 2 == 0) {
					player1.draw(cards);
				}else {
					player2.draw(cards);
				}
			}
		}	
		

}
