package weeksixproject;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		Deck deck = new Deck(); 
		System.out.print("Player 1");
		Player playerA = new Player("Zoel");
		System.out.print("Player 2");
		Player playerB = new Player("Isaiah"); 
		
		deck.shuffle();
		for(int i = 1; i <=26; i++) {
			playerA.draw(deck);
			playerB.draw(deck);
		}
		
		for (int i = 1; i<= 26; i++) {
			System.out.println("Play Game!" + i);
			Card firstCard = playerA.flip();
			System.out.print(playerA.getName() + "-- ");
			firstCard.describe();
			Card nextCard = playerB.flip();
			System.out.print(playerB.getName() + "-- ");
			nextCard.describe();
		
			if (firstCard.getValue() > nextCard.getValue()) {
				playerA.incrementScore();
				System.out.println(playerA.getName() +" " + "Win!!");
			} else if (firstCard.getValue() < nextCard.getValue()) {
					playerB.incrementScore();
					System.out.println(playerB.getName() + " "+ "Win!!");
		
		
	}else {
		System.out.println("Game is a draw");
		
	}
	}
	 
		
		}
		
		
}
	


	


