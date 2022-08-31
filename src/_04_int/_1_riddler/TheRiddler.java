package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String question = JOptionPane.showInputDialog("What's orange and green, and sounds like a parrot?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (question.equals(("A carrot"))) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++ ;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "The answer is A carrot");
			score = 0;
		}

		// 6. Add some more riddles

		String question2 = JOptionPane.showInputDialog("How do catch a school of fish?");
if (question2.equals("With a Bookworm")) {

JOptionPane.showMessageDialog(null, "Correct!");
score++;
	}

else { 
	JOptionPane.showMessageDialog(null,"The answer is With a Bookworm ");
	score --;
	
	}
JOptionPane.showMessageDialog(null, "You got" +score);
}
	}


