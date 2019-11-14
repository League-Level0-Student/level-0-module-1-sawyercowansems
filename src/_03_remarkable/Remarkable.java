package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
		// 1. Save something remarkable about each person in a variable.
String noah = "Eyelids";
String griffin = "Glasses";
String sawyer = "YEEET";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("What's your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (name.equals("noah")) {
	JOptionPane.showMessageDialog(null, "Wow! You have remarkable eyelids!");
}
if (name.equals("griffin")) {
	JOptionPane.showMessageDialog(null, "Wow! You have remarkable glasses!");
}
if (name.equals("sawyer")) {
	JOptionPane.showMessageDialog(null, "Wow! You have remarkable YEEEEEEEEEEEEEEEEEET!");
}










	}
}

