package JoinView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPage extends JFrame {

	private MainProcess main1;

	private JTextField ID;
	private JTextField password;
	private JTextField PWcheck;
	private JTextField Name;
	private JTextField PW;
	private JTextField Addr;
	private JTextField Tel;
	private JTextField Mail;
	private JButton IDcheck;
	private JButton Join;

	private boolean IDpass = false;
	private boolean PWpass = false;

	private JLabel text = new JLabel("");
	private JLabel text2 = new JLabel("");

	private List<Member> members;

	public static void main(String[] args) {
		new MainPage();
	}

	public MainPage() {
		members = new ArrayList<>();

		members.add(new Member("Superman", "1234", "New York", "서울 어쩌구 그런동", "01012345678", "superman@naver.com"));
		members.add(new Member("Batman", "1234", "Boston", "부산 저쩌구 가만안동", "01056498977", "Batman@naver.com"));
		members.add(new Member("Pororo", "1234", "Seoul", "대구 이럴구 저런동", "010425202363", "Pororo@nolja.com"));

		setTitle("회원가입");
		setSize(950, 570);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		placeJoinPanel(panel);
		add(panel);

		setVisible(true);
	}

	public void placeJoinPanel(JPanel panel) {

		panel.setLayout(null);

		JLabel IDLabel = new JLabel("아이디");
		IDLabel.setBounds(360, 170, 80, 25);
		panel.add(IDLabel);

		JLabel PWLabel = new JLabel("비밀번호");
		PWLabel.setBounds(350, 200, 80, 25);
		panel.add(PWLabel);

		JLabel PWCLabel = new JLabel("비밀번호 확인");
		PWCLabel.setBounds(320, 230, 80, 25);
		panel.add(PWCLabel);

		JLabel NameLabel = new JLabel("이름");
		NameLabel.setBounds(370, 260, 80, 25);
		panel.add(NameLabel);

		ID = new JTextField(20);
		ID.setBounds(410, 170, 160, 25);
		panel.add(ID);

		PW = new JTextField(20);
		PW.setBounds(410, 200, 160, 25);
		panel.add(PW);

		PWcheck = new JTextField(20);
		PWcheck.setBounds(410, 230, 160, 25);
		PWcheck.addFocusListener(new MyFocusListener());
		panel.add(PWcheck);

		Name = new JTextField(20);
		Name.setBounds(410, 260, 160, 25);
		panel.add(Name);

		IDcheck = new JButton("확인");
		IDcheck.setBounds(580, 170, 70, 25);
		IDcheck.addActionListener(new MyActionListener());
		panel.add(IDcheck);

		text.setBounds(660, 170, 160, 25);
		panel.add(text);

		text2.setBounds(580, 230, 160, 25);
		panel.add(text2);

		Join = new JButton("가입");
		Join.setBounds(450, 380, 70, 25);
		Join.addActionListener(new MyActionListener2());
		panel.add(Join);

		JLabel AddrLabel = new JLabel("주소");
		AddrLabel.setBounds(370, 290, 80, 25);
		panel.add(AddrLabel);

		JLabel TelLabel = new JLabel("연락처");
		TelLabel.setBounds(360, 320, 80, 25);
		panel.add(TelLabel);

		JLabel MailLabel = new JLabel("이메일");
		MailLabel.setBounds(360, 350, 80, 25);
		panel.add(MailLabel);

		Addr = new JTextField(50);
		Addr.setBounds(410, 290, 160, 25);
		panel.add(Addr);

		Tel = new JTextField(20);
		Tel.setBounds(410, 320, 160, 25);
		panel.add(Tel);

		Mail = new JTextField(20);
		Mail.setBounds(410, 350, 160, 25);
		panel.add(Mail);

		ImageIcon img = new ImageIcon("img/backtest.jpg");
		JLabel back = new JLabel(img);
		back.setBounds(0, 0, getWidth(), getHeight());
		panel.add(back);

	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (IDcheck(ID.getText()) == false) {
				text.setText("사용가능한 ID 입니다.");
				IDpass = true;
			} else {
				text.setText("중복된 ID 입니다.");
				IDpass = false;

			}

		}
	}

	class MyFocusListener implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub

			if (!(PW.getText().equals(PWcheck.getText()))) {
				text2.setText("비밀번호가 일치하지 않습니다.");
				PWpass = false;
			} else if (PW.getText().equals(PWcheck.getText())) {
				text2.setText("비밀번호가 일치합니다.");
				PWpass = true;
			}
		}
	}

	class MyActionListener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (IDpass && PWpass && checkspace(Name.getText())) {
				JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다.");
				members.add(new Member(ID.getText(), password.getText(), Name.getText(), Addr.getText(), Tel.getText(),
						Mail.getText()));
			} else {
				JOptionPane.showMessageDialog(null, "정보를 다시 확인해주세요.");
			}
		}

	}

	private boolean IDcheck(String id) {
		boolean check = true;
		Member member1 = FindById(id);
		if (member1 == null)
			check = false;
		return check;

	}

	private boolean checkspace(String text) {
		boolean check = true;
		if (text.trim().length() == 0)
			check = false;

		return check;
	}

	private Member FindById(String id) {
		for (Member member : members) {
			if (member.getID().equals(id)) {
				return member;
			}
		}
		return null;

	}

	public void setMain(MainProcess main) {
		this.main1 = main;
	}

}
