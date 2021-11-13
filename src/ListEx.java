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
	String[] search = { "����", "������", "���ǻ�" };
	String[] list = { "��ǻ�Ͱ��а�", "���Ӱ��а�", "������������", "������", "ȭ��", "���ڻ�����" };

	ListEx() {
		TextArea ta1, ta2, ta3;
		setTitle("Book_List");
		setResizable(false);
		setLocation(800, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();

		contentPane.add(new JButton("HOME"));
		contentPane.add(new JButton("����������"));
		contentPane.add(new JButton("��ٱ���"));
		contentPane.add(new JLabel(
				"                                                                                                                                                                                   "));
		contentPane.add(new JButton("�α׾ƿ�")); // ��� ��ư
		JComboBox combo = new JComboBox(search);
		contentPane.add(combo);
		contentPane.add(new JTextField(55));
		ButtonGroup g = new ButtonGroup();

		contentPane.add(new JLabel(
				"                                                                                              "));
		JRadioButton Major = new JRadioButton("����");
		JRadioButton teacher = new JRadioButton("����");

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