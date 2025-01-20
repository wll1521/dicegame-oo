package edu.southalabama.dicegame.model;

import java.util.Random;

public class Die {
	
	private int faceValue;
	private int numSides;
	
	public Die(int numSides) {
		this.numSides = numSides;
		this.faceValue = 0;
	}
	
	public int getFaceValue() {
		return faceValue;
	}
	
	public void roll() {
		Random value = new Random();
		faceValue = value.nextInt(numSides) + 1;
	}


	
}
