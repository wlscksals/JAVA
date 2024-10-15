package CH36.View.GUI.AUTH;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import CH36.View.GUI.MainGUI;
import CH36.View.GUI.MEMBER.MemberUI;
import CH36.View.GUI.USER.UserUI;

public class LoginUI extends JFrame implements ActionListener{

	JTextField id_txt;
	JTextField pw_txt;
	JButton login_btn;
	
	//
	MainGUI mainGUI;
	MemberUI membergui;
	UserUI usergui;
	

	public LoginUI(){
		super("MAIN MENU");
		setBounds(10, 10, 300, 150);

		// 패널
		JPanel panel = new JPanel();
		panel.setLayout(null);

		
		//
		id_txt = new JTextField();
		pw_txt = new JTextField();
		login_btn = new JButton("로그인");
		
		//
		id_txt.setBounds(10,10,150,30);
		pw_txt.setBounds(10,50,150,30);
		login_btn.setBounds(170,10,100,70);
		
		//EVENT
		login_btn.addActionListener(this);
		
		// 컴포넌트를 패널에 추가
		panel.add(id_txt);
		panel.add(pw_txt);
		panel.add(login_btn);
		 
		
		add(panel);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		
		membergui = new MemberUI();
		membergui.setMainUI(mainGUI);
		
		usergui = new UserUI();
		usergui.setMainUI(mainGUI);
		

		
		//X 버튼 이벤트 처리
		addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) { 	
            	mainGUI.setVisible(true);
            }
        });
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	//
	public void setMainUI(MainGUI mainGUI) {
	
	}


	
}
