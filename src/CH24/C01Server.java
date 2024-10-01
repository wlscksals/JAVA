package CH24;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 서버 소켓 생성
		ServerSocket server = new ServerSocket(7000);
		System.out.println("[INFO] SERVER SOCKET LISTENING");
		
		while(true) {
		Socket client = server.accept();
		//accept : 클라이언트의 요청이 왔을 때 연결을 수락하는 역할
		System.out.print("[INFO] SERVER ACCEPTD...CLIENT IP:" + client.getInetAddress());
		OutputStream out = client.getOutputStream();
		DataOutputStream dout = new DataOutputStream(out);
		dout.writeUTF("WELCOME TO SERVER!..");
		
		dout.close();
		out.close();
		client.close();
		server.close();
		}
	}

}
