package CH20;

import javax.swing.JFrame;

class C02GUI extends JFrame{
	C02GUI(){
		super("두번째 프레임입니다.");
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}





public class C02SwinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		JFrame frame = new JFrame("첫번째 피레임입니다.");
//		frame.setBounds(100,100,500,500);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);
		new C02GUI();
	}

}
