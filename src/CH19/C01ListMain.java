package CH19;

import java.util.ArrayList;
import java.util.List;

public class C01ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList(); //UpCasting
		//추가
		list.add("HTML/CSS/JS0");
		list.add("JQUERY");
		list.add("NODEJS");
		list.add("SCSS");
		list.add("REACT");
		list.add("JAVA");
		list.add("JSP/SETVLET");
		list.add("STS");
		list.add("SPRING BOOT");
		list.add("SPRING BOOT");
		//조회
		System.out.println("개수 확인 : "+ list.size());
		System.out.println("Idx로 조히 : "+ list.get(2));
		System.out.println("Value로 idx확인 : "+ list.indexOf("JAVA"));
		System.out.println("Value로 idx확인 : "+ list.indexOf("SPRING BOOT"));
		
		//삭제
		list.remove(0);
		list.remove("JQUERY");
		for (String el : list)
			System.out.println(el);
		// 전체 삭제
		list.clear();
	}

}
