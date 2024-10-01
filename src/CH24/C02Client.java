package CH24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class C02Client {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub
	Socket server = new Socket("192.168.5.50",9000);
	DataInputStream din = new DataInputStream(server.getInputStream());
	DataOutputStream dout = new DataOutputStream(server.getOutputStream());
	
	Scanner sc = new Scanner(System.in);
	String send = null;
	String recv = null;
	
	//무한루프로 전달받고 잔달
	while(true) {
		//송신
		System.out.println("[ME(q:종료)] :");
		send = sc.nextLine();
		dout.writeUTF(send);
		dout.flush();
		if(send.equals("q"))
			break;
		//수신
		recv = din.readUTF();
		if(recv==null || recv.equals("q"))
			break;
		System.out.println("[SERVER] : "+ recv);
	}
	}
}
