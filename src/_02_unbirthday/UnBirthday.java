package _02_unbirthday;

import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
	String birthday = JOptionPane.showInputDialog("Type in your birthday. (mm/dd)");
	if (birthday.equals("11/13")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	} else {
		JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
	}
	
	
	
	
	
}
}
