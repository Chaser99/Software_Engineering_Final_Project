package liarsDice;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ServerGUI extends JFrame {
	private int port;
	private JLabel portLabel;
	private JTextField portField;
	private Server server;

	public ServerGUI() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new GridLayout(1, 2, 5, 3));
		portLabel = new JLabel("Enter a port: ");
		portField = new JTextField(10);

		panel.add(portLabel);
		panel.add(portField);

		JButton submit = new JButton("Submit");
		JPanel buttonPanel = new JPanel();

		buttonPanel.add(submit);

		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				port = Integer.parseInt(portField.getText());

				try {
					server = new Server(port);
					System.out.println("Server is listening on port " + port);
					server.listen();
				} catch (IOException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}
		});

		this.add(buttonPanel, BorderLayout.SOUTH);
		this.add(panel, BorderLayout.NORTH);
		this.setSize(400, 400);
		this.setVisible(true);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		new ServerGUI();
	}

}