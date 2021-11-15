import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ListEx extends JFrame {

	public ListEx() {

		setSize(950, 500);
		setLocation(300, 150);
		setVisible(true);
		setTitle("Book_List");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String[] search = { "제목", "지은이", "출판사" };
		String[] list = { "컴퓨터공학과", "게임공학과", "데이터정보학", "물리학", "화학", "분자생물학" };

		JPanel ptop = new JPanel();
		JPanel ptop1 = new JPanel();
		JPanel ptop2 = new JPanel();
		JPanel ptop3 = new JPanel();
		JButton btn_HOME = new JButton("HOME");
		JButton btn_Mypage = new JButton("마이페이지");
		JButton btn_Basket = new JButton("장바구니");
		JButton exit = new JButton("로그아웃");
		TextArea ta1, ta2, ta3;
		JRadioButton major, teacher;
		JTextField search1;
		ButtonGroup cl = new ButtonGroup();
		Container c = getContentPane();

		// 상단 패널
		major = new JRadioButton("전공", true);
		cl.add(major);
		teacher = new JRadioButton("교직");
		cl.add(teacher);

		ptop1.setLayout(new FlowLayout(FlowLayout.LEFT));
		ptop2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		ptop3.setLayout(new FlowLayout(FlowLayout.LEFT));
		ptop.setLayout(new GridLayout(2, 2));
		ptop1.add(btn_HOME);
		ptop1.add(btn_Mypage);
		ptop1.add(btn_Basket);
		ptop2.add(exit);
		JComboBox combo = new JComboBox(search);
		ptop3.add(combo);
		search1 = new JTextField(38);
		ptop3.add(search1);

		ptop.add(ptop1);
		ptop.add(ptop2);
		ptop.add(ptop3);
		add("North", ptop);

		JPanel pwest = new JPanel(new BorderLayout(0, 0)); // 왼쪽
		major = new JRadioButton("전공", true);
		cl.add(major);
		teacher = new JRadioButton("교직");
		cl.add(teacher);
		JPanel group = new JPanel(new GridLayout(1, 2));
		group.add(major);
		group.add(teacher);

		pwest.add("North", group);
		JList lists = new JList(list);
		pwest.add("Center", lists);

		c.add("West", pwest);

		JPanel pcenter = new JPanel(new GridLayout(3, 1));// 가운데
		pcenter.add(ta1 = new TextArea());
		pcenter.add(ta2 = new TextArea());
		pcenter.add(ta3 = new TextArea());

		c.add("Center", pcenter);

	}

//하기 존나 싫다
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListEx f = new ListEx();
	}

}