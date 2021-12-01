package home;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestCollection {
	private ArrayList<String> list;
	void out(String m) {
		JTextArea d=new JTextArea(m,10,50);
		JOptionPane.showMessageDialog(null,d);
		
	}

	public TestCollection() {
	list=new ArrayList<String>();
	list.add("Sok");
	list.add("Dara");
	list.add("Chang");
	out(list.toString());
	list.add(1,"Kong");
	out(list.toString());
	list.set(0, "RUPP");
	out(list.toString());
	list.remove(1);
	out(list.toString());
	}
	public static void main(String[] args) {
		new TestCollection();

	}

}
