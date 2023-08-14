package weeksixproject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
List <Card> hand = new ArrayList(); 
int score; 
String name;



public Player(String name) {
this.score = 0;
this.name = name;
}



public void describe () {
	for(Card card : hand ) {
		card.describe();
	}


}
public void draw(Deck deck) {
	hand.add(deck.draw());
}

public Card flip() {
	Card flipCrad = this.hand.remove(0);
	return flipCrad; 
}
public void incrementScore() {
	score = getScore() + 1;
}
public List<Card> getHand() {
	return hand;
}
public void setHand(List<Card> hand) {
	this.hand = hand;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	
	}

	



