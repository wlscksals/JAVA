package CH19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C03SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet();
		//추가
		set.add("HTML/CSS/JS0");
		set.add("JQUERY");
		set.add("NODEJS");
		set.add("SCSS");
		set.add("REACT");
		set.add("JAVA");
		set.add("JSP/SETVLET");
		set.add("STS");
		set.add("SPRING BOOT");
		set.add("SPRING BOOT");
		//조회
		System.out.println("개수 확인 : "+ set.size());
		//삭제
		set.remove("STS");
		System.out.println("개수 확인 : "+ set.size());
		//전체조회("Interator")
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		for(String el : set)
			System.out.println(el);
		
		set.clear();
	}

}
