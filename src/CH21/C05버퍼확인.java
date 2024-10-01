package CH21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C05버퍼확인 {

	public static void main(String[] args) throws Exception {
		
		InputStream fin = new FileInputStream("C:\\TMP_IO\\data.exe");
		byte [] buffer = new byte[1024];	//1kbyte 버퍼
		
		long size = 0;
		long sTime = System.currentTimeMillis();
		while(true) {
			int data = fin.read(buffer);
			if(data==-1)
				break;
			System.out.println("data : " + data);	
			size++;
		}
		long eTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (eTime - sTime) + " ms");
		System.out.println("파일크기 : " + (size*1.0)/(1024*1024) +" MB");
	}

}
