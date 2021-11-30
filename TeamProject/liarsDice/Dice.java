package liarsDice;

import java.util.Random;

public class Dice {
	private int value;
	private Random random = new Random();

	public Dice() {
		roll();
	}

	public void roll() {
		value = random.nextInt(6) + 1; //sets dice value to random number (1-6)
	}

	public int getValue() {
		return value;
	}
}