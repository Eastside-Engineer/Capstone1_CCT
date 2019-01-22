package week1Capstone;

import java.util.Scanner;

public class PigTalk {

	public static void main(String[] args) {
		/* TODO Create a program that allows the user to input a word of any case
		 * to be translated into pigatin.
		 */
		Scanner scnr = new Scanner(System.in);

		String userInput = "y";

		do {
			System.out.println("Enter a word: ");

			String line;
			line = scnr.nextLine();
			line = line.toLowerCase();

			for (int i = 0; i < 1; i++) {
				char firstLetter = line.charAt(i);

				line = line.substring(i + 1);
				if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o'
						|| firstLetter == 'u') {
					System.out.println(line + firstLetter + "way");
					
				}else{
                         int firstvowelINdex = 0; 
                         boolean trigger = false; 
                         //for(int ii=0; ii < line.length() - 1  || trigger == true; ii++)
                         int iid = 0; 
                         for( iid=0; iid<=line.length() - 1; iid++)//  || trigger == true; ii++)
                         {
                             char firstVowel = line.charAt(iid); 
                             if (trigger == false)
                             {
                                 if (firstVowel == 'a' || firstVowel == 'e' || firstVowel == 'i' || firstVowel == 'o' || firstVowel == 'u')  
                                 {
                                     firstvowelINdex = iid; 
                                     trigger = true;
                                 }
                             }
                         }
                         if (trigger == true)
                         {
                             String storConstants = line.substring(0, firstvowelINdex);
                             System.out.println(line.substring(firstvowelINdex, line.length()) + storConstants + "ay");
                         }  
			}
			System.out.println("Would you like to learn more? (y/n)");
			userInput = scnr.nextLine();
            
             System.out.println("Blank Line Detected Please try again");
         }
		}while (userInput.equalsIgnoreCase("y"));
		
		System.out.println("Oodbyegay, Ouyay Ilthyfay Nimalaway!");

 
}
}


