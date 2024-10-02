package CH26;

import java.net.ServerSocket;
import java.net.Socket;

public class ClientMain {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			ServerSocket server = new ServerSocket("SERVER IP",9000);

			
			//Thread 권한
			ClientRecvThread recv = new ClientRecvThread(server);
			ClientSendThread send = new ClientSendThread(server); 
			
			Thread th1 = new Thread(recv);
			Thread th2 = new Thread(send);
			
			th1.start();
			th2.start();
			
			th1.join();
			th2.join();
	}

}
