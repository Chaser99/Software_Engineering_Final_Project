package liarsDice;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JPanel;

public class LoginControl implements ActionListener {
	// Private data fields for the container and chat client.
	private JPanel container;
	private Object client; //placeholder client object for now

	// Constructor for the login controller.
	public LoginControl(JPanel container, Object client) {
		this.container = container;
		this.client = client;
	}

	//button clicks.
	public void actionPerformed(ActionEvent e) {
		// Get the name of the button clicked.
		String buttonClicked = e.getActionCommand();

		// The Cancel button takes the user back to the initial panel.
		if (buttonClicked == "Cancel") {
			CardLayout cardLayout = (CardLayout) container.getLayout();
			cardLayout.show(container, "1");
		}
		
		else if (buttonClicked == "Submit") { // The Submit button submits the login information to the server.
			// Get the username and password the user entered.
			LoginPanel loginPanel = (LoginPanel) container.getComponent(1);
			LoginData data = new LoginData(loginPanel.getUsername(), loginPanel.getPassword());

			// Check the validity of the information locally first.
			if (data.getUsername().equals("") || data.getPassword().equals("")) {
				displayError("You must enter a username and password.");
				return;
			}

			// Submit the login information to the server.
			
			// ((Object) client).sendToServer(data);
			System.out.println("Send to server"); //try-catch for IOException
			
			//When correct username and password is retrieved proceed to game panel
			//CardLayout cardLayout = (CardLayout) container.getLayout();
			//cardLayout.show(container, "3");
		}
	}
	// Method that displays a message in the error 
	public void displayError(String error) {
		LoginPanel loginPanel = (LoginPanel) container.getComponent(1);
		loginPanel.setError(error);
	}
}