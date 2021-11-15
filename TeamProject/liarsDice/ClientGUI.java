package liarsDice;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClientGUI extends JFrame {

	public ClientGUI() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CardLayout cardLayout = new CardLayout();
		JPanel container = new JPanel(cardLayout);

		InitialControl ic = new InitialControl(container);
		LoginControl lc = new LoginControl(container, "client object goes here");

		JPanel view1 = new InitialPanel(ic);
		JPanel view2 = new LoginPanel(lc);
		//JPanel view3 = new GameScreenPanel(ic);
		
		container.add(view1, "1");
		container.add(view2, "2");
		//container.add(view3, "3");
		
		cardLayout.show(container, "1");
		// Add the card layout container to the JFrame.
		this.add(container, BorderLayout.CENTER);

		// Show the JFrame.
		this.setSize(550, 350);
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public static void main(String[] args) {
		new ClientGUI();
	}

}
