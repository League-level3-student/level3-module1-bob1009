package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	String first;
	JLabel label = new JLabel();
	int live=5;
	JLabel EthanHunt=new JLabel();
	Stack<String> word = new Stack<String>();
	
	public static void main(String[] args) {
		HangMan ran = new HangMan();

		ran.Running();
	}

	void Running() {
		
		int wordsearch = 0;
		while (wordsearch>266||wordsearch<1) {
			String startnum = JOptionPane.showInputDialog("Type in the number of rounds you want to play(Please don't go over 266)");
			wordsearch = Integer.parseInt(startnum);
			
		}
		for (int i = 0; i < wordsearch; i++) {
			String WORD = Utilities.readRandomLineFromFile("dictionary.txt");
			word.push(WORD);
		}
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 500);
		first = word.pop();
		String empty = "_";

		for (int i = 0; i < first.length(); i++) {
			empty += "_";
			}
		label.setText(empty);
		EthanHunt.setText(""+live);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(EthanHunt);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(""+live);
		String replace = "";    
		boolean life=true;
		String textequal=label.getText();
		for (int i = 0; i < first.length(); i++) {
			
			if (first.charAt(i) == e.getKeyChar()) {
				replace += e.getKeyChar();
		 		life=false;	
			}
			else {
				replace+=textequal.charAt(i);
			}
		}
		if (life==true) {
			live-=1;
			EthanHunt.setText(""+live);
		}
		label.setText(replace);
		if (live==0) {
			JOptionPane.showMessageDialog(null, "You lose!");
			System.exit(1);
		}
		if (!label.getText().contains("_")) {
		
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
