package _06_test_scores;

import javax.swing.JOptionPane;

public class Test_Score {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog(null, "What is your test grade out of a hundred?");
		double grade = Integer.parseInt(score);
		if(grade >= 200)
		{
			JOptionPane.showMessageDialog(null, "Wait, is that even possible?!");
		}
		else if(grade >= 80)
		{
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
		}
		else if(grade <= 0)
		{
			JOptionPane.showMessageDialog(null, "DID YOU EVEN TRY?!?!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You need to study harder for the next test!");
		}
		
			
	}
}
