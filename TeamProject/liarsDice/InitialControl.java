package liarsDice;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class InitialControl implements ActionListener {
	private JPanel container;

	public InitialControl(JPanel container) {
		this.container = container;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String buttonClicked = e.getActionCommand();

		if (buttonClicked.equals("Login")) {
			LoginPanel loginPanel = (LoginPanel) container.getComponent(1);
			loginPanel.setError("");
			CardLayout cardLayout = (CardLayout) container.getLayout();
			cardLayout.show(container, "2");
		} 
	}
}