package CH24;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class C01Client {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub
	Socket server = new Socket("192.168.5.50",7000);
	// 연결 요청을 보내면 Server에서 accept가 요청을 받는다.
	InputStream in = server.getInputStream();
	DataInputStream din = new DataInputStream(in);
	String recv = din.readUTF();
	System.out.println("서버 메서지 :"+ recv);
	}
}
