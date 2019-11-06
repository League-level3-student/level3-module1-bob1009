package _03_IntroToStacks;

import java.awt.JobAttributes;
import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {

	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		Random ran=new Random();
		//   Don't forget to import the Stack class
		Stack<Double> nums=new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		
		for (int i = 0; i < 100; i++) {
			nums.push(ran.nextDouble()*100);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String ask=JOptionPane.showInputDialog("type in a number");
		String ask2=JOptionPane.showInputDialog("type in a number");
		Double saved=Double.parseDouble(ask);
		Double saved2=Double.parseDouble(ask2);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		for (int i = 0; i < nums.size(); ) {
			Double rescued=nums.pop();
			if (rescued>=saved) {
			 if (rescued<=saved2) {
				
				 System.out.println(i+"    "+rescued);
			}
			}
				
			
		}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
