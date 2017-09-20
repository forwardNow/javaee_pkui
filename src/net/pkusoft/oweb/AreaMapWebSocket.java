package net.pkusoft.oweb;

import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/noauth/localsense")
public class AreaMapWebSocket {
	@OnMessage
    public void onMessage(String message, Session session) throws IOException, InterruptedException {

		Basic basicRemote = session.getBasicRemote();
		
        // Print the client message for testing purposes
        System.out.println("Received: " + message);


        while (true) {
			Thread.sleep( 1000 / 60 );
            basicRemote.sendText("This is an intermediate server message. Count: ");
        }

    }

    @OnOpen
    public void onOpen() {
        System.out.println("Client connected");
    }

    @OnClose
    public void onClose() {
        System.out.println("Connection closed");
    }
}
