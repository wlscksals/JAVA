package CH06;

public class C01SWITCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ranking = 2;
		char medalColor;
		switch(ranking)
		{case 1:
			medalColor ='G';
			System.out.println("메달 색상 :G");
			break;
		case 2:
			medalColor ='S';
			System.out.println("메달 색상 :S");
			break;
		case 3:
			medalColor ='B';
			System.out.println("메달 색상 :B");
			break;
		default:
			medalColor = 'C';
			System.out.println("메달색상:C");
		}
		System.out.println(ranking + "등 메달의 색은 " + medalColor + "입니다.");
	}

}
