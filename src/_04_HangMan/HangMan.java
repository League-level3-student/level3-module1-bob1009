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
	String word;
	JLabel label = new JLabel();
	int live =15;
	JLabel EthanHunt = new JLabel();
	Stack<String> stack = new Stack<String>();

	public static void main(String[] args) {
		HangMan ran = new HangMan();

		ran.Running();
	}
	HangMan(){
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(EthanHunt);

		EthanHunt.setText("" + live);
	}

	void Running() {
	
		int wordsearch = 0;
		
		while (wordsearch > 266 || wordsearch < 1) {
			String startnum = JOptionPane.showInputDialog("Type in the number of rounds you want to play(Please don't go over 266)");
			wordsearch = Integer.parseInt(startnum);
			
		}
		for (int i = 0; i < wordsearch; i++) {
			String WORD = Utilities.readRandomLineFromFile("dictionary.txt");
			stack.push(WORD);
		}
		setupnextword();
		
	}

	void setupnextword() {
		word = stack.pop();
		String empty = "";
		System.out.println(word);
		for (int i = 0; i < word.length(); i++) {
			empty += "_";
		}
		label.setText(empty);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String replace = "";
		boolean life = true;
		String textequal = label.getText();
		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) == e.getKeyChar()) {
				replace += e.getKeyChar();
				life = false;
			} else {
				replace += textequal.charAt(i);
			}
		}
		if (life == true) {
			live -= 1;
			EthanHunt.setText("" + live);
		}
		label.setText(replace);
		if (live == 0) {
			JOptionPane.showMessageDialog(null, "You lose!");
			Playagain();
		
		}
		checkrestart();
	}

	void checkrestart() {

		if (!label.getText().contains("_")) {
			if (stack.isEmpty() == true) {
				JOptionPane.showMessageDialog(null, "YOU WIN!!!");
				Playagain();
			} else {
				setupnextword();
				
			}

		}

	}
void Playagain() {
	int playagain=JOptionPane.showConfirmDialog(null,"Do you want to play again?"); 
	if (playagain==JOptionPane.YES_OPTION) {
		Running();
		live=15;
		EthanHunt.setText(""+live);
	}
}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
