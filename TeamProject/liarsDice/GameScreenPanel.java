package liarsDice;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameScreenPanel extends JPanel {
	Random random = new Random();
	private JLabel dice1 = new JLabel("" + (1 + random.nextInt(6)));
	private JLabel dice2 = new JLabel("" + (1 + random.nextInt(6)));
	private JLabel dice3 = new JLabel("" + (1 + random.nextInt(6)));
	private JLabel dice4 = new JLabel("" + (1 + random.nextInt(6)));
	private JLabel dice5 = new JLabel("" + (1 + random.nextInt(6)));
	private JTextField betField;
	
	public void rollDice() {
		dice1.setText("" + (1 + random.nextInt(6)));
		dice2.setText("" + (1 + random.nextInt(6)));
		dice3.setText("" + (1 + random.nextInt(6)));
		dice4.setText("" + (1 + random.nextInt(6)));
		dice5.setText("" + (1 + random.nextInt(6)));
	}

	public void Bet(JTextField bet) {
		
	}
	
	public GameScreenPanel() {
		JPanel pointsPanel = new JPanel();
		JLabel points = new JLabel("Points: ", JLabel.CENTER);
		JPanel dicePanel = new JPanel(new GridLayout(1, 5, 5, 5));
		JPanel bettingPanel = new JPanel();
		
		pointsPanel.add(points);
		dicePanel.add(dice1);
		dicePanel.add(dice2);
		dicePanel.add(dice3);
		dicePanel.add(dice4);
		dicePanel.add(dice5);

		bettingPanel.add(new JLabel("Enter your bet: "));
		betField = new JTextField(10);		
		bettingPanel.add(betField);
		
		JPanel buttonPanel = new JPanel();
		JButton roll = new JButton("Roll");
		JButton challenge = new JButton("Challenge Bid");
		JButton bet = new JButton("Bet");

		roll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				rollDice();
			}
		});
		challenge.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		bet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Bet(betField);
			}
		});

		buttonPanel.add(roll);
		buttonPanel.add(challenge);
		buttonPanel.add(bet);

		JPanel grid = new JPanel(new GridLayout(4, 1, 0, 10));
		grid.add(pointsPanel);
		grid.add(dicePanel);
		grid.add(bettingPanel);
		grid.add(buttonPanel);
		this.add(grid);
	}

}
