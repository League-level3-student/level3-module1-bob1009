package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.junit.experimental.theories.FromDataPoints;

public class _02_LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 *
	 * Create a GUI with three buttons. Button 1: Add Entry When this button is
	 * clicked, use an input dialog to ask the user to enter an ID number. After an
	 * ID is entered, use another input dialog to ask the user to enter a name. Add
	 * this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	HashMap<Integer, String> Map = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton search = new JButton();
	JButton view = new JButton();
	JButton remove = new JButton();
	String print;
	String IDgot;
	String idgot;

	public static void main(String[] args) {
		_02_LogSearch LS = new _02_LogSearch();
	}

	_02_LogSearch() {
		setup();
	}

	void setup() {
		panel.add(add);
		panel.add(search);
		panel.add(view);
		panel.add(remove);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		add.setText("add entry");
		search.setText("search by ID");
		view.setText("view list");
		remove.setText("remove ID");
		add.addActionListener(this);
		view.addActionListener(this);
		search.addActionListener(this);
		remove.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			String name = JOptionPane.showInputDialog("What name do you want to add?");
			String id = JOptionPane.showInputDialog("please enter a 3 number ID number for this person");
			int ID = Integer.parseInt(id);
			Map.put(ID, name);
		}
		if (e.getSource() == search) {
			String searchid = JOptionPane.showInputDialog("type in ID to search person's name");
			int searchID = Integer.parseInt(searchid);
			for (int i : Map.keySet()) {
				IDgot = Map.get(searchID);
			}
			if (Map.isEmpty()==true) {
				JOptionPane.showMessageDialog(null, "I'm sorry, there is no person with that ID");
			
		}
			else{JOptionPane.showMessageDialog(null, "the person you are searching for is " + IDgot);
			}
			}
		if (e.getSource() == view) {
			print = "";
			for (int k : Map.keySet()) {
				print += Map.get(k) + "'s ID is " + k + "\n";
			}
			if (Map.isEmpty()==true) {
				JOptionPane.showMessageDialog(null, "I'm sorry, no ID's are listed right now");
			
		}else {
			JOptionPane.showMessageDialog(null, " " + print);
			}
		}
		if (e.getSource() == remove) {
			String SearchId = JOptionPane.showInputDialog("type in ID to search person's name");
			int SearchID = Integer.parseInt(SearchId);
			idgot = Map.get(SearchID);

				if (Map.containsKey(SearchID)) {
					JOptionPane.showMessageDialog(null, "" + idgot + " has been removed");
				Map.remove(SearchID);
				}
				else {
					JOptionPane.showMessageDialog(null, "I'm sorry, there is no person with that ID");
				}
				
			
		}
	}

	void listcheck() {
		if (Map.isEmpty() == true) {
			JOptionPane.showMessageDialog(null, "I'm sorry, no ID's are listed right now");
		}
	}
}
