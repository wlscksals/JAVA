package CH36.View.GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import CH36.View.GUI.AUTH.LoginUI;



public class MainGUI extends JFrame implements ActionListener {

	
	
	JTable table;
	JScrollPane tableScroll;
	JLabel label;
	JTextField txt;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	
	JButton prev;
	JLabel idx;
	JButton next;

	//로그인 UI
	public LoginUI loginUI;
	
	//
	public Integer mySessionId;
	
	public String myRole;
	
	public MainGUI() throws Exception {

		super("MAIN MENU");
		setBounds(10, 10, 500, 450);

		// 패널
		JPanel panel = new JPanel();
		panel.setLayout(null);

		
		//테이블 열이름
		String[] columnNames = {"도서코드", "도서명", "출판사","ISBN"};
		// 테이블 데이터 x 
		//테이블 모델
		DefaultTableModel model = new DefaultTableModel(columnNames,0);
		
		
		// 컴포넌트
		label = new JLabel("BOOKCODE : ");
		table = new JTable(model);
		tableScroll = new JScrollPane(table);
		
		txt = new JTextField();
		btn1 = new JButton("도서조회");
		btn2 = new JButton("회원가입");
		btn3 = new JButton("로그인");
		
		
		prev = new JButton("<");	
		next = new JButton(">");
		idx = new JLabel("001");


		Font font = new Font("Arial", Font.PLAIN, 8);
		prev.setFont(font);
		next.setFont(font);
		

		// 위치 조정
		label.setBounds(10,10,200,15);
		txt.setBounds(10,30,200,30);
		btn1.setBounds(350,10,100,30);
		btn2.setBounds(350,50,100,30);
		btn3.setBounds(350,90,100,30);
		tableScroll.setBounds(10,140,440,200);
		
		
		prev.setBounds(10,350,40,30);	
		idx.setBounds(60,350,50,30);
		next.setBounds(120,350,40,30);
		
		
		prev.setVisible(false);
		next.setVisible(false);
		idx.setVisible(false);
		
		
		//EVENT
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		prev.addActionListener(this);
		next.addActionListener(this);
		
	

		// 컴포넌트를 패널에 추가
		panel.add(label);
		panel.add(txt);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(tableScroll);
		
		panel.add(prev);
		panel.add(next);
		panel.add(idx);

		
		//EVENT
		
		
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//loginUI
		loginUI = new LoginUI();
		loginUI.setVisible(false);
		loginUI.setMainUI(this);
	
		this.mySessionId = 0;	//로그인된상태x
		

	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1)	//도서조회 
		{
			
		}
		else if(e.getSource()==btn2) //회원가입
		{
			
		}
		else if(e.getSource()==btn3)	//로그인 
		{
			System.out.println("로그인 버튼 클릭");
			loginUI.setVisible(true);
			this.setVisible(false);
			
		}
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		new MainGUI();
	}
}
