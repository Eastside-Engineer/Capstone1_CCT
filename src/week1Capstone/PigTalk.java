package week1Capstone;

import java.util.Scanner;

public class PigTalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		String userInput = "y";
		
		do {
		System.out.println("Enter a word: ");
		
		
		String line;
		line = scnr.nextLine();
		line = line.toLowerCase();
		
		for (int i = 0; i < 1; i++) {
			char firstLetter = line.charAt(i);
			
			//String pigTongue = "";
			line = line.substring(i+1);
			if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u') {
			    
			    

			    //pigTongue = firstLetter;
				System.out.println(line +firstLetter + "way");
			} else {
				System.out.println(line + firstLetter + "ay");
			}
			System.out.println("Would you like to learn more? (y/n)");
			userInput = scnr.nextLine();
		}
		}while (userInput.equalsIgnoreCase("y"));
		
		System.out.println("Oodbyegay, Ouyay Ilthyfay Nimalaway!");

	}
}
