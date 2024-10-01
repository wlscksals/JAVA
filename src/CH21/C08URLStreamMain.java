package CH21;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

public class C08URLStreamMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// URL 객체 생성()
		@SuppressWarnings("deprecation")
		URL url = new URL("https://n.news.naver.com/mnews/article/079/0003943223");
		
		//스트림 꺼내기
		InputStream bin = url.openStream();
		
		//보조스트림
		BufferedInputStream buffIn = new BufferedInputStream(bin); // 보조스트림, 버퍼공간 단위로 수신
		Reader in = new InputStreamReader(buffIn); //보조스트림,byte 단위 -> char단위 변환
		
		//확인
		Writer out = new FileWriter("c:\\TMP_IO\\index.html");
		while(true) {
			int data = in.read();
			if(data == -1)
				break;
			System.out.print((char)data);
		}
		out.flush();
		out.close();
		in.close();
		buffIn.close();
		bin.close();
	
	}

}
