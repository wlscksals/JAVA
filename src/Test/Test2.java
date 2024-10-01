package Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Writer fout = new FileWriter("C:\\TMP_iO\\output.txt");
		fout.write("HEllO\n");
		fout.write("sdfsfsdfsd\n");
		fout.write("TEST1\n");
		fout.write("TEST1\n");
		fout.flush();
		fout.close();


	}

}
