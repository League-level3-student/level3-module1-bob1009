package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<Character> type = new Stack<Character>();

	public static void main(String[] args) {
		_02_TextUndoRedo con = new _02_TextUndoRedo();

	}

	_02_TextUndoRedo() {
		panel.add(label);
		frame.add(panel);
		frame.addKeyListener(this);
		frame.setVisible(true);
		frame.setSize(250, 250);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char save= e.getKeyChar();
		String labeltext = label.getText();
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			if (labeltext.length() >= 1) {

				char find = labeltext.charAt(labeltext.length() - 1);
				String y = labeltext.substring(0, labeltext.length() - 1);
				label.setText(y);
				type.push(find);
			}
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			
			if (type.size()>=1) {
				char pop=type.pop();
				label.setText(labeltext +pop );
			}
			
		}
		else {
			 
			label.setText(label.getText() + save);
		
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
