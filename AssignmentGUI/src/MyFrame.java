import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Color;

import javax.swing.JColorChooser;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

import java.rmi.*;
import java.rmi.server.*;

class MyFrame extends JFrame implements ActionListener {
	private JLabel l0 = new JLabel("  Player Profiles  ");
	private JLabel l1 = new JLabel("Player Name");
	private JTextField t1 = new JTextField("", 8);
	private JLabel l2 = new JLabel("Position");
	private JTextField t2 = new JTextField("", 8);
	private JLabel l3 = new JLabel("Date of Birth (mm/yyyy)");
	private JTextField t3 = new JTextField("", 8);

	private JButton b1 = new JButton("Select All");
	private JButton b2 = new JButton("Add");
	private JButton b3 = new JButton("Delete All");
	private JButton b4 = new JButton("Clear");
	private JButton b5 = new JButton("Next");
	private JButton b6 = new JButton("Back");
	private JButton b7 = new JButton("Print");
	private JButton b8 = new JButton("Exit");
	private JPanel p1 = new JPanel();
	private int index = 0;

	private LinkedList list = new LinkedList();

	public MyFrame(String s) {
		super(s);
		Container content = getContentPane();
		Container container = getContentPane();
		container.setLayout(null);

		JWindow window = new JWindow();
		window.getContentPane().add(
				new JLabel("", new ImageIcon("images/images.jpg"),
						SwingConstants.CENTER));
		window.setBounds(500, 150, 300, 200);
		window.setVisible(true);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		window.setVisible(false);
		JFrame frame = new JFrame();
		frame.add(new JLabel(("Welcome to Player Application"),
				SwingConstants.CENTER));
		frame.setVisible(true);
		frame.setSize(300, 100);
		window.dispose();

		content.setLayout(new FlowLayout());
		Font f = new Font("TimesRoman", Font.BOLD, 20);
		p1.setLayout(new GridLayout(7, 2));
		l0.setFont(f);
		content.add(l0);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b8);

		content.add(p1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		setSize(300, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Object target = e.getSource();

		if (target == b1) {
			init_Player_list();
			Player curr = list.readPlayer(index);
			t1.setText(curr.readName());
			t2.setText(curr.readPosition());
			t3.setText(curr.readDateOfBirth());
		}

		if (target == b2) {
			String name = t1.getText();
			String position = t2.getText();
			String dob = t3.getText();
			int indexOf = dob.indexOf("/");
			String part1 = dob.substring(0, indexOf);
			String part2 = dob.substring(indexOf + 1);
			int m1 = Integer.parseInt(part1);
			int y1 = Integer.parseInt(part2);
			list.insert(name, position, m1, y1);
			JOptionPane.showMessageDialog(null,
					"You have successfully added a new player to the list");
		}

		if (target == b3) {
			list.delete_all();
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}

		if (target == b4) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}

		if (target == b5) {
			if (index < list.count())
				index++;
			Player curr = list.readPlayer(index);
			t1.setText(curr.readName());
			t2.setText(curr.readPosition());
			t3.setText(curr.readDateOfBirth());
		}

		if (target == b6) {
			if (index < list.count2())
				index--;
			Player curr = list.readPlayer(index);
			t1.setText(curr.readName());
			t2.setText(curr.readPosition());
			t3.setText(curr.readDateOfBirth());
		}

		if (target == b7) {
			list.printlist();
			JOptionPane.showMessageDialog(null, "Your list has been printed");
		}

		if (target == b8) {
			System.exit(0);
		}

	}

	public void init_Player_list() {
		list.insert("Rob Elliot", "GK", 05, 1987);
		list.insert("Seamus Coleman", "RB", 10, 1988);
		list.insert("Ciaran Clark", "CB", 10, 1989);
		list.insert("Shane Duffy", "CB", 01, 1992);
		list.insert("Robbie Brady", "LB", 01, 1992);
		list.insert("Jon Walters", "RM", 10, 1983);
		list.insert("Jeff Hendrick", "CM", 01, 1992);
		list.insert("Harry Arter", "CM", 12, 1989);
		list.insert("Wes Hoolahan", "CM", 05, 1982);
		list.insert("James McClean", "LM", 04, 1989);
		list.insert("Shane Long", "ST", 01, 1987);
		index = 1;

	}

}