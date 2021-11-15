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

		String[] search = { "����", "������", "���ǻ�" };
		String[] list = { "��ǻ�Ͱ��а�", "���Ӱ��а�", "������������", "������", "ȭ��", "���ڻ�����" };

		JPanel ptop = new JPanel();
		JPanel ptop1 = new JPanel();
		JPanel ptop2 = new JPanel();
		JPanel ptop3 = new JPanel();
		JButton btn_HOME = new JButton("HOME");
		JButton btn_Mypage = new JButton("����������");
		JButton btn_Basket = new JButton("��ٱ���");
		JButton exit = new JButton("�α׾ƿ�");
		TextArea ta1, ta2, ta3;
		JRadioButton major, teacher;
		JTextField search1;
		ButtonGroup cl = new ButtonGroup();
		Container c = getContentPane();

		// ��� �г�
		major = new JRadioButton("����", true);
		cl.add(major);
		teacher = new JRadioButton("����");
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

		JPanel pwest = new JPanel(new BorderLayout(0, 0)); // ����
		major = new JRadioButton("����", true);
		cl.add(major);
		teacher = new JRadioButton("����");
		cl.add(teacher);
		JPanel group = new JPanel(new GridLayout(1, 2));
		group.add(major);
		group.add(teacher);

		pwest.add("North", group);
		JList lists = new JList(list);
		pwest.add("Center", lists);

		c.add("West", pwest);

		JPanel pcenter = new JPanel(new GridLayout(3, 1));// ���
		pcenter.add(ta1 = new TextArea());
		pcenter.add(ta2 = new TextArea());
		pcenter.add(ta3 = new TextArea());

		c.add("Center", pcenter);

	}

//�ϱ� ���� �ȴ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListEx f = new ListEx();
	}

}