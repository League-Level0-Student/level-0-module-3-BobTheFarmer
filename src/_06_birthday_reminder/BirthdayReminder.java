
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
String birthday = JOptionPane.showInputDialog("Which birthday do you want? Say \"moms,\" \"dads, \" or \"mine\"");	
		// 3. Print out what the user typed
		if(birthday.equalsIgnoreCase("moms")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
			else if(birthday.equalsIgnoreCase("dads")) {
	JOptionPane.showMessageDialog(null, dadsBirthday);
}
			else if(birthday.equalsIgnoreCase("mine")) {
	JOptionPane.showMessageDialog(null, myBirthday);
}
			else if(birthday.equalsIgnoreCase("")) {
				JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
			}
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 

