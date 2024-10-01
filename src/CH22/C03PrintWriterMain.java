package CH22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class C03PrintWriterMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer out = new FileWriter("c:\\tmp_io\\test2.txt");
		BufferedWriter bout = new BufferedWriter(out);
		PrintWriter pout = new PrintWriter(bout);
		pout.println("HELLO");
		pout.println("HELLO");
		pout.println("HELLO");
		pout.flush();
		pout.close();
		
		Reader in = new FileReader("c:\\tmp_io\\test2.txt");
		BufferedReader bin = new BufferedReader(in);
		
		
		while(true) {
			int data = bin.read();
			if(data==-1)
				break;
			System.out.print((char)data);		
		}
		
	}

}
