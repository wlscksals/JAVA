package CH10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05MainArgsArray {

	public static void main(String[] args) {
		System.out.println("길이 : " + args.length);
		for(String param : args)
			System.out.println(param);
	}
	

}
