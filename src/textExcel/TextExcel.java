package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
	    // Add your command loop here
		Spreadsheet s= new Spreadsheet();
		Scanner userInput= new Scanner(System.in);
		String userInputed= userInput.nextLine();
		
		while (!userInputed.equals("quit")) {
			
			s.processCommand(userInputed);
			
		}
	}
}
