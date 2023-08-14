package weeksixproject;

import java.util.ArrayList;

public class Card {

	 String name; 
	 int value;
	 String suit;

Card(String name, int value, String suit){
	this.name = name; 
	this.value = value; 
	this.suit = suit; 
}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	} 
	
	
public void describe() {
	System.out.println(name + " of " + suit + "  " + value);
	
}


















}//endMain

