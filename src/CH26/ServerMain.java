package CH26;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(9000);
		System.out.println("[INFO] SERVER SOCKET START");
		//
		Socket client = server.accept();
		
		//Thread 권한
		ServerRecvThread recv = new ServerRecvThread(client);
		ServerSendThread send = new ServerSendThread(); 
		
		Thread th1 = new Thread(recv);
		Thread th2 = new Thread(send);
		
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
	}
	
	

}
