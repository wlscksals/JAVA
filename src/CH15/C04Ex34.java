package CH15;

import java.util.Scanner;

abstract class Converter {
   
   abstract protected double convert(double src); // 추상 메소드
   abstract protected String getSrcString(); // 추상 메소드
   abstract protected String getDestString(); // 추상 메소드
  
   protected double ratio; // 비율
   
   public void run() {
      Scanner scanner = new Scanner(System.in);
      System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
      System.out.print(getSrcString()+"을 입력하세요>> ");
      double val = scanner.nextDouble();
      double res = convert(val);
      System.out.println("변환 결과: "+res+getDestString()+"입니다");
      scanner.close();
   }
}

class Won2Dollar extends Converter {
	Won2Dollar(double ratio){this.ratio = ratio;}
	
	
	 protected double convert(double src); // 추상 메소드
	   protected String getSrcString(); // 추상 메소드
	   protected String getDestString(); // 추상 메소드
	   
	   
}

public class C04Ex34 {

	//명품자바 4장 클래스 기본
	//https://security-nanglam.tistory.com/212
	
	//명품자바 5장 상속
	//https://security-nanglam.tistory.com/215
	
	public static void main(String[] args) {
		 
		   
	}
}
