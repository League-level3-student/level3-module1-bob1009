package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
		JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	String first;
	JLabel label=new JLabel();
	Stack<String> word=new Stack<String>();
	public static void main(String[] args) {
		HangMan ran=new HangMan();
	
		ran.Running();
	}
	void Running() {
	String startnum=JOptionPane.showInputDialog("Type in the number of rounds you want to play");
	int wordsearch=Integer.parseInt(startnum);
	for (int i = 0; i < wordsearch; i++) {
		String WORD=Utilities.readRandomLineFromFile("dictionary.txt");
		word.push(WORD);
	}
	panel.add(label);
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(500, 500);
	first=word.pop();
	String empty="_ ";
for (int i = 0; i < first.length(); i++) {
		
	}
}
	
}
