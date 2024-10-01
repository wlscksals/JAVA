package CH22;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C02CharConverStreamMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str = "문자 변환 스트림 사용";
		
		OutputStream out = new FileOutputStream("c:\\tmp_io\\test.txt");
		OutputStreamWriter wout = new OutputStreamWriter(out);
		BufferedWriter bout = new BufferedWriter(wout);
		bout.write(str);
		bout.flush();
		bout.close();
		
		InputStream in = new FileInputStream("c:\\tmp_io\\test.txt");
		BufferedInputStream fin = new BufferedInputStream(in);
		InputStreamReader subin = new InputStreamReader(fin);
		
		
		while(true) {
			int data = subin.read();
			if(data==-1)
				break;
			System.out.print((char)data);		
		}
		
		

	}

}
