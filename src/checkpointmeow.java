import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class checkpointmeow {
public static void main(String[] args) {
	int math;
	int add=0;
	Stack<Integer>stack=new Stack<Integer>();
	Random ran =new Random();
	for (int i = 0; i < 10; i++) {
		int Ran=ran.nextInt(20);
		stack.push(Ran);
	}
	for (int i = 0; i < stack.size(); i++) {
		math=stack.pop();
		add+=math;
	}
	JOptionPane.showMessageDialog(null, ""+add);
}
}
