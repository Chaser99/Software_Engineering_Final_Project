package liarsDice;

import java.io.IOException;

import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;

public class Server extends AbstractServer {

	public Server(int port) throws IOException {
		super(port);
		this.listen();
	}

	protected void clientConnected(ConnectionToClient client) {
		System.out.println(client.getId() + " Connected");
	}

	protected void clientDisconnected(ConnectionToClient client, Throwable exception) {
		System.out.println(client.getId()+" Disconnected");
		exception.printStackTrace();
	}
	
	@Override
	protected void handleMessageFromClient(Object arg0, ConnectionToClient arg1) {
		// TODO Auto-generated method stub
		System.out.println("Message from Client " + arg1.getId() + ": " + arg0);
	}
	
//	public void declareWinner() {
//		System.out.println("Player # wins");
//	}
	
}
