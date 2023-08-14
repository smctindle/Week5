package weeksixproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

private List<Card> cards = new ArrayList<Card>();
	
	Deck(){	
        String[] suits = {"Diamond", "Spades", "Hearts", "Clubs"}; 	
        String [] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten","Ace","King","Queen","Jack"};
        
        for(String suit : suits) {
        int count = 2; 
        for(String number : numbers) {
        Card card = new Card(number, count, suit);
        this.cards.add(card);
       	count++;
        }
        }
}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

public void describe() {
	for (Card card: this.cards) {
		card.describe();
	}
}
public void shuffle() {
	Collections.shuffle(this.cards);
}	
public Card draw() {
	Card card = this.cards.remove(0);
 return  card; 
	
}
	

}//end of main