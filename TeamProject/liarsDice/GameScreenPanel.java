package liarsDice;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GameScreenPanel extends JPanel {
	Random random = new Random();
	private JLabel dice1 = new JLabel("" + (1 + random.nextInt(6)));
	private JLabel dice2 = new JLabel("" + (1 + random.nextInt(6)));
	private JLabel dice3 = new JLabel("" + (1 + random.nextInt(6)));
	private JLabel dice4 = new JLabel("" + (1 + random.nextInt(6)));
	private JLabel dice5 = new JLabel("" + (1 + random.nextInt(6)));
	private JTextField betField;
	String betplaced;
	int total1die;
	int total2die;
	int total3die;
	int total4die;
	int total5die;
	int total6die;
	int totalPoints;
	JLabel updatepoints = new JLabel();
	
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
		JPanel betsMadePanel = new JPanel();
		JTextArea bets = new JTextArea();
		
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
		
		betsMadePanel.add(new JLabel("Bets Made: "));
		
		
		
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
				betplaced = betField.getText();
				//System.out.println(betplaced);
				for(Dice dice : diceArray)
				{
					//some code
					
				}
				
				
				
				if (betplaced.equals("1"))
				{
					if(total1die == 1)
					{
						//challenger loses challenge and the other player gets a point
						totalPoints++;
						String tPoints = Integer.toString(totalPoints);
						
						updatepoints = new JLabel(tPoints);
						//pointsPanel.add(updatepoints);
						System.out.println(tPoints);
						
						
						
						
					}
					else
					{
						//challenger wins challenge and challenger gets a point
						totalPoints++;
						String tPoints = Integer.toString(totalPoints);
						
					}
				}
				else if (betplaced.equals("2"))
				{
					if(total2die == 2)
					{
						//challenger loses challenge and the other player gets a point
						totalPoints++;
						String tPoints = Integer.toString(totalPoints);
						
						updatepoints = new JLabel(tPoints);
						//pointsPanel.add(updatepoints);
						System.out.println(tPoints);
						
						
						
						
					}
					else
					{
						//challenger wins challenge and challenger gets a point
						totalPoints++;
						String tPoints = Integer.toString(totalPoints);
						
					}
				}
				else if (betplaced.equals("3"))
				{
					if(total3die == 3)
					{
						//challenger loses challenge and the other player gets a point
						totalPoints++;
						String tPoints = Integer.toString(totalPoints);
						
						updatepoints = new JLabel(tPoints);
						//pointsPanel.add(updatepoints);
						System.out.println(tPoints);
						
						
					}
					else
					{
						//challenger wins challenge and challenger gets a point
						totalPoints++;
						String tPoints = Integer.toString(totalPoints);
						
					}
				}
				else if (betplaced.equals("4"))
				{
					if(total4die == 4)
					{
						//challenger loses challenge and the other player gets a point
						totalPoints++;
						String tPoints = Integer.toString(totalPoints);
						
						updatepoints = new JLabel(tPoints);
						//pointsPanel.add(updatepoints);
						System.out.println(tPoints);
						
						
					}
					else
					{
						//challenger wins challenge and challenger gets a point
						totalPoints++;
						String tPoints = Integer.toString(totalPoints);
						
					}
				}
				else if (betplaced.equals("5"))
				{
					if(total5die == 5)
					{
						//challenger loses challenge and the other player gets a point
						totalPoints++;
						String tPoints = Integer.toString(totalPoints);
						
						updatepoints = new JLabel(tPoints);
						//pointsPanel.add(updatepoints);
						System.out.println(tPoints);
						
						
					}
					else
					{
						//challenger wins challenge and challenger gets a point
						totalPoints++;
						String tPoints = Integer.toString(totalPoints);
						
					}
				}
				else if (betplaced.equals("6"))
				{
					if(total6die == 6)
					{
						//challenger loses challenge and the other player gets a point
						totalPoints++;
						String tPoints = Integer.toString(totalPoints);
						
						updatepoints = new JLabel(tPoints);
						//pointsPanel.add(updatepoints);
						System.out.println(tPoints);
						
						
					}
					else
					{
						//challenger wins challenge and challenger gets a point
						totalPoints++;
						String tPoints = Integer.toString(totalPoints);
						
					}
				}
				
				


			}
		});
		bet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				betplaced = betField.getText();
				bets.append(betplaced);
				bets.append("--");
				
			}
		});

		buttonPanel.add(roll);
		buttonPanel.add(challenge);
		buttonPanel.add(bet);

		JPanel grid = new JPanel(new GridLayout(6, 1, 0, 10));
		grid.add(pointsPanel);
		grid.add(dicePanel);
		grid.add(bettingPanel);
		grid.add(buttonPanel);
		grid.add(betsMadePanel);
		grid.add(bets);
		this.add(grid);
	}

}
