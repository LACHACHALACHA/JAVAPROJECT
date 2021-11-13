package LoginView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame {

	private MainProcess main;
	private TestFrm testFrm;

	private JButton btnLogin;
	private JButton btnjoin;
	private JButton btnInit;
	private JPasswordField passText;
	private JTextField userText;
	private boolean bLoginCheck;

	public static void main(String[] args) {
		new LoginView();
	}

	public LoginView() {

		JPanel panel = new JPanel();
		add(panel);

		setTitle("login");
		setSize(950, 570);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		placeLoginPanel(panel);
		setVisible(true);

	}

	public void placeLoginPanel(JPanel panel) {
		panel.setLayout(null);

		JLabel userLabel = new JLabel("아이디");
		userLabel.setBounds(360, 270, 80, 25);
		panel.add(userLabel);

		JLabel passLabel = new JLabel("비밀번호");
		passLabel.setBounds(360, 300, 80, 25);
		panel.add(passLabel);

		userText = new JTextField(20);
		userText.setBounds(430, 270, 160, 25);
		panel.add(userText);

		passText = new JPasswordField(20);
		passText.setBounds(430, 300, 160, 25);
		panel.add(passText);

		passText.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isLoginCheck();
			}
		});

		btnLogin = new JButton("로그인");
		btnLogin.setBounds(380, 330, 100, 25);
		panel.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isLoginCheck(); // 회원 정보 판별
			}
		});

		btnjoin = new JButton("회원가입");
		btnjoin.setBounds(490, 330, 100, 25);
		panel.add(btnjoin);
		btnjoin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 회원가입 페이지로 이동
				new JoinView.MainPage();
				dispose();
			}
		});

		ImageIcon img = new ImageIcon("img/backdeu.jpg");
		JLabel back = new JLabel(img);
		back.setBounds(0, 0, getWidth(), getHeight());
		panel.add(back);

	}

	public void isLoginCheck() {
		if (userText.getText().equals("test") && new String(passText.getPassword()).equals("1234")) {
			JOptionPane.showMessageDialog(null, "Success");
			bLoginCheck = true;

			// 로그인 성공이라면 매니져창 뛰우기
			if (isLogin()) {
				main.showFrameTest(); // 메인창 메소드를 이용해 창뛰우기
			}
		} else {
			JOptionPane.showMessageDialog(null, "Faild");
		}
	}

	// mainProcess와 연동
	public void setMain(MainProcess main) {
		this.main = main;
	}

	public boolean isLogin() {
		return bLoginCheck;
	}

}