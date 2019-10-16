package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame=new JFrame();
	JButton button=new JButton();
	JButton button2=new JButton();
	JPanel panel=new JPanel();
	ArrayList <String>names=new ArrayList<String>();
	public static void main(String[] args) {
		_02_GuestBook book=new _02_GuestBook();
	
		
	}
		_02_GuestBook(){
		frame.setSize(500, 500);
		panel.add(button);
		panel.add(button2);
		frame.add(panel);
		button.setText("Add Guest");
		button2.setText("View List");
		frame.setVisible(true);
		button.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			String namesave=JOptionPane.showInputDialog("What is the person's name that you want to put on the list");
			names.add(namesave);
		}
		if (e.getSource()==button2) {
			String blank="";
			for (int i = 0; i <names.size(); i++) {
				blank+="Guest #"+(i+1)+": "+names.get(i)+"\n";
			}
			JOptionPane.showMessageDialog(null,""+blank );
		}
	}
	
}
