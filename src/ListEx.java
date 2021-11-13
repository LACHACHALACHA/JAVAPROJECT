import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ListEx extends JFrame {

	JPanel pan1 = new JPanel();
	String[] search = { "제목", "지은이", "출판사" };
	String[] list = { "컴퓨터공학과", "게임공학과", "데이터정보학", "물리학", "화학", "분자생물학" };

	ListEx() {
		TextArea ta1, ta2, ta3;
		setTitle("Book_List");
		setResizable(false);
		setLocation(800, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();

		contentPane.add(new JButton("HOME"));
		contentPane.add(new JButton("마이페이지"));
		contentPane.add(new JButton("장바구니"));
		contentPane.add(new JLabel(
				"                                                                                                                                                                                   "));
		contentPane.add(new JButton("로그아웃")); // 상단 버튼
		JComboBox combo = new JComboBox(search);
		contentPane.add(combo);
		contentPane.add(new JTextField(55));
		ButtonGroup g = new ButtonGroup();

		contentPane.add(new JLabel(
				"                                                                                              "));
		JRadioButton Major = new JRadioButton("전공");
		JRadioButton teacher = new JRadioButton("교직");

		g.add(Major);
		g.add(teacher);
		contentPane.add(Major);
		contentPane.add(teacher);

		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(ta1 = new TextArea(7, 100));
		JList lists = new JList(list);
		contentPane.add(lists);

		add(ta2 = new TextArea(7, 100));
		add(ta3 = new TextArea(7, 100));

		setSize(950, 500);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListEx();
	}

}