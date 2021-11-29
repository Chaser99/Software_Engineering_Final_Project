package liarsDice;

import java.io.IOException;

import ocsf.client.AbstractClient;

public class Client extends AbstractClient {
	public Client(String host, int port) {
		super(host, port);
	}

	public void dataToServer(Object arg0) throws IOException {
		sendToServer(arg0);
	}

	public void connectionException(Exception exception) {
		exception.printStackTrace();
	}

	@Override
	protected void handleMessageFromServer(Object arg0) {
		// TODO Auto-generated method stub
		System.out.println("Message from server: " + arg0);
	}
}