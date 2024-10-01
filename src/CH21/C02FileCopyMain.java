package CH21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class C02FileCopyMain {

	private static final String DIR = "c:\\TMP_IO\\";
	
	//명령어 원본경로 저장대상경로
	public static void main(String[] args) throws Exception {
		
		for(String arg:args)
			System.out.println(arg);
		
		Reader in = new FileReader(DIR+args[0]);
		Writer out = new FileWriter(DIR+args[1]);
		
		int data=0;
		while((data=in.read())!=-1) {
//			int data=in.read();
//			if(data==-1)
//				break;
			out.write((char)data);
			out.flush();
		}
		
		in.close();
		out.close();
	
	}

}



