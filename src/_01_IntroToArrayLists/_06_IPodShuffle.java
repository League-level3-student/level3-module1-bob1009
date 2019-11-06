package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button=new JButton();
	Random ran=new Random();
	ArrayList<Song> playSong = new ArrayList<Song>();
	Song currentsong=null;
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
				
				panel.add(button);
				frame.add(panel);
				frame.setSize(500,500);
				frame.setVisible(true);
				button.setText("Surprise me!");
				button.addActionListener((ActionListener) this);
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
				
				Song no=new Song("Queen - Don't Stop Me Now (Official Video).mp3");
				Song sand=new Song("Metallica - Enter Sandman [Official Music Video].mp3");
				Song quake=new Song("ACDC - You Shook Me All Night Long (Official Video).mp3");
				playSong.add(sand);
				playSong.add(no);
				playSong.add(quake);
				
				
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (currentsong!=null) {
			currentsong.stop();
		}
		
		currentsong=playSong.get(ran.nextInt(playSong.size()));
		currentsong.play();
		
	
		
	}
}