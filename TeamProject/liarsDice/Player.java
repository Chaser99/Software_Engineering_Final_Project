package liarsDice;

public class Player {
	private final int no_dice = 6;

	private String username;
	private String password;
	private int points;
	private Dice[] player_dice;

	public Player() {
		player_dice = new Dice[no_dice]; // initialize array that holds the player's dice
		points = 0; // starting points
		setUsername(username);
		setPassword(password);
		rollDice();

	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public int getPoints() {
		return points;
	}
	
	

//	public void addPoints(int quantity) {
//		for(Dice dice: player_dice) {
//			points += dice.getValue()*quantity;
//		}
//	}
//	
	public void rollDice() {
		for (Dice dice : player_dice) { // for every dice object in the array of dice
			dice.roll(); // call dice roll method
		}
	}

}
