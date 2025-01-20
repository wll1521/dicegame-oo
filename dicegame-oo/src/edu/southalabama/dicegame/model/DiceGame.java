package edu.southalabama.dicegame.model;

import java.util.ArrayList;
import java.util.List;


public class DiceGame {
	
	private Die die1;
	private Die die2;
	
	public DiceGame() {
		die1 = new Die(6);
		die2 = new Die(6);	
	}
	
	public void play() {
		die1.roll();
		die2.roll();
	}
	
	public List<Integer> getDieValues() {
		List<Integer> values = new ArrayList<Integer>();
		
		values.add(die1.getFaceValue());
		values.add(die2.getFaceValue());
		
		return values;
	}
	
	public boolean getOutcome() {
		int sum = die1.getFaceValue() + die2.getFaceValue();
		
		if (sum == 7 || sum == 12) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Integer getResult() {
		return die1.getFaceValue() + die2.getFaceValue();
	}
	

	

}
