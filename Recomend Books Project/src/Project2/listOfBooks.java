package Project2;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class listOfBooks {

	public static void main(String[] args) throws Exception {
		// Create a program that gives the user a list of books to check out and let them check out a book with a set price
		
		
		//Variables are created
		int genre = 0;
		double checkOutPrice = 0.00;
		String checkOutChoice = null;
		int keepGoing = 0;
		int counter = 0;
		double totalCheckOutPrice = 0.0;
		
		//parallel arrays will put out a list of books coming soon to our inventory
		String[] bookNames = new String[6];
		String[] bookAuthors = new String[6];
		
		
		//Image objects are created to use to display images
		ImageIcon mlk = new ImageIcon("mlk.jpeg");
		ImageIcon malcolm = new ImageIcon("malcolmx.jpeg");
		ImageIcon drDarity = new ImageIcon("DrDarity.jpeg");
		ImageIcon royBecker = new ImageIcon("royBeck.jpeg");
		ImageIcon avengers = new ImageIcon("AvInfin.jpeg");
		ImageIcon onePiece = new ImageIcon("onePiece.jpeg");
		
		
		//Output box created to welcome users
		JOptionPane.showMessageDialog(null, "Hello and welcome. To get your list of recomended books hit enter or ok - Prgrammed by Jaron Pirtle-Freedmen");
		
		//Arrays get loaded from LoadArray Class
		LoadArray.loadedArray(bookNames, "ComingSoonNames.txt");
		LoadArray.loadedArray(bookAuthors, "ComingSoonPrices.txt");
		
		//do-while loop is created
		do
		{
		
		//Input is taken to create feedback
		genre = Integer.parseInt(JOptionPane.showInputDialog("Please select a genre: \n 1 - Autobiographry \n2 - Historical Fiction \n3 - Comic & Manga "));
		
		//while validation loop will stop program from crashing
		while(genre != 1 && genre != 2 && genre != 3 ) 
		{
			genre = Integer.parseInt(JOptionPane.showInputDialog(" ERROR - Please select a genre: \n 1 - Autobiographry \n2 - Historical Fiction \n3 - Comic & Manga "));
		}
		
		
		//switch statement is used instead of if statement. A lot cleaner.
		switch(genre)
		{
		case 1:
			System.out.println("=================================================================================== ");
			System.out.println("List of Autobiographies: \nA - 'Where Do We Go From Here | Chaos or Community' - Foreward By Correta Scott King \nB - 'The Autobiography of Malcom X' - By Alex Haley");
			System.out.println(" ");
			System.out.println("=================================================================================== ");
			checkOutChoice = JOptionPane.showInputDialog("Which book would you like to check out?");
			checkOutChoice.toLowerCase();
			
			//while validation loop
			while(!checkOutChoice.equalsIgnoreCase("A") && !checkOutChoice.equalsIgnoreCase("B") ) 
			{
				checkOutChoice = JOptionPane.showInputDialog("ERROR - Which book would you like to check out?");
				checkOutChoice.toLowerCase();
			}
			
			//If and else if statement is created to return final price and book
			if(checkOutChoice.equalsIgnoreCase("a"))
			{
				checkOutPrice = 20.00;
				System.out.println("=================================================================================== ");
				System.out.println("You have choose to check out 'Where Do We Go From Here | Chaos or Community' - Foreward By Correta Scott King ");
				
				//formats the output to look like money i.e. $00.00
				System.out.printf("The book price is: $%1.2f", + checkOutPrice);
				System.out.println(" ");
				System.out.println("Thank you and enjoy you day and remember Reparations for American Freedmen Now! ");
				System.out.println("=================================================================================== ");
				
				//Displays the image
				JOptionPane.showMessageDialog(null, "","Here is your book", JOptionPane.INFORMATION_MESSAGE, mlk );
			}
			else if(checkOutChoice.equalsIgnoreCase("b"))
			{
				checkOutPrice = 15.00;
				System.out.println("=================================================================================== ");
				System.out.println("You have choose to check out 'The Autobiography of Malcom X' - By Alex Haley");
				System.out.printf("The book price is: $%1.2f", + checkOutPrice);
				System.out.println(" ");
				System.out.println("Thank you and enjoy you day and remember Reparations for American Freedmen Now! ");
				System.out.println("=================================================================================== ");
				JOptionPane.showMessageDialog(null, "","Here is your book", JOptionPane.INFORMATION_MESSAGE, malcolm );
			}
			break;
		case 2:
			System.out.println("=================================================================================== ");
			System.out.println("List of Historical Ficton: \nA - 'From Here to Equality: Reparations for Black Americans' - By A. Kirsten Mullen and Dr William Darity Jr. \nB - 'Back of the Hiring Line' - By Roy Beck");
			System.out.println(" ");
			System.out.println("=================================================================================== ");
			checkOutChoice = JOptionPane.showInputDialog("Which book would you like to check out?");
			checkOutChoice.toLowerCase();
			
			while(!checkOutChoice.equalsIgnoreCase("A") && !checkOutChoice.equalsIgnoreCase("B") ) 
			{
				checkOutChoice = JOptionPane.showInputDialog("ERROR - Which book would you like to check out?");
				checkOutChoice.toLowerCase();
			}
			
			if(checkOutChoice.equalsIgnoreCase("a"))
			{
				checkOutPrice = 35.00;
				System.out.println("=================================================================================== ");
				System.out.println("You have choose to check out 'From Here to Equality: Reparations for Black Americans' - By A. Kirsten Mullen and Dr William Darity Jr. ");
				System.out.printf("The book price is: $%1.2f", + checkOutPrice);
				System.out.println(" ");
				System.out.println("Thank you and enjoy you day and remember Reparations for American Freedmen Now! ");
				System.out.println("=================================================================================== ");
				JOptionPane.showMessageDialog(null, "","Here is your book", JOptionPane.INFORMATION_MESSAGE, drDarity );
			}
			else if(checkOutChoice.equalsIgnoreCase("b"))
			{
				checkOutPrice = 20.00;
				System.out.println("=================================================================================== ");
				System.out.println("You have choose to check out 'Back of the Hiring Line' - By Roy Beck");
				System.out.printf("The book price is: $%1.2f", + checkOutPrice);
				System.out.println(" ");
				System.out.println("Thank you and enjoy you day and remember Reparations for American Freedmen Now! ");
				System.out.println("=================================================================================== ");
				JOptionPane.showMessageDialog(null, "","Here is your book", JOptionPane.INFORMATION_MESSAGE, royBecker );
				
			}
			break;
		case 3:
			System.out.println("=================================================================================== ");
			System.out.println("List of Comics & Mangas: \nA - 'One Piece' - By Eiichiro Oda \nB - 'The Infinity War Aftermath' - By Marvel Comics");
			System.out.println(" ");
			System.out.println("=================================================================================== ");
			checkOutChoice = JOptionPane.showInputDialog("Which book would you like to check out?");
			checkOutChoice.toLowerCase();
			
			while(!checkOutChoice.equalsIgnoreCase("A") && !checkOutChoice.equalsIgnoreCase("B") ) 
			{
				checkOutChoice = JOptionPane.showInputDialog("ERROR - Which book would you like to check out?");
				checkOutChoice.toLowerCase();
			}
			
			if(checkOutChoice.equalsIgnoreCase("a"))
			{
				checkOutPrice = 50.00;
				System.out.println("=================================================================================== ");
				System.out.println("You have choose to check out 'One Piece' - By Eiichiro Oda ");
				System.out.printf("The book price is: $%1.2f", + checkOutPrice);
				System.out.println(" ");
				System.out.println("Thank you and enjoy you day and remember Reparations for American Freedmen Now! ");
				System.out.println("=================================================================================== ");
				JOptionPane.showMessageDialog(null, "","Here is your book", JOptionPane.INFORMATION_MESSAGE, onePiece );
				
			}
			else if(checkOutChoice.equalsIgnoreCase("b"))
			{
				checkOutPrice = 39.99;
				System.out.println("=================================================================================== ");
				System.out.println("You have choose to check out 'The Infinity War Aftermath' - By Marvel Comics");
				System.out.printf("The book price is: $%1.2f", + checkOutPrice);
				System.out.println(" ");
				System.out.println("Thank you and enjoy you day and remember Reparations for American Freedmen Now! ");
				System.out.println("=================================================================================== ");
				JOptionPane.showMessageDialog(null, "","Here is your book", JOptionPane.INFORMATION_MESSAGE, avengers );
				
			}
			break;
		}//end of switch statement
		
		//re loops if the user wants another book
		keepGoing = JOptionPane.showConfirmDialog(null, "Would you like to check out another book");
		
		//keeps a track of the number of books the user checks out
		counter++;
		
		//keeps a track of the total price
		totalCheckOutPrice += checkOutPrice;
		
		//re loops if the user wants another book and checks yes which equals 0
		}while(keepGoing == 0 );//End of Do-While loop
		
		//displays the total number books checked out and the final price aka as a receipt.
		System.out.println("Number of books checked out: " + counter);
		System.out.printf("The final total price: $%1.2f", + totalCheckOutPrice );
		System.out.println(" ");
		
		//Method takes the counter and if you have bought two or more items you will get a complimentary Drink and snack.
		System.out.println(compDrinkAndSnack.compDrinkAndFood(counter));
		
		//List of upcoming books with authors gets printed out to be viewed
		System.out.println("=================================================================================== ");
		System.out.println("Check out our list of upcoming books that will be added to our store! ");
		System.out.println(" ");
		System.out.println("Autobiographies: ");
		
		//for method will print out 1st two items in Array
		for(int i = 0; i >= 0 && i < 2; i++ )
		{
			System.out.println(bookNames[i] + " - " + bookAuthors[i]);
		}
		
		//for method will print out next two items in Array
		System.out.println(" ");
		System.out.println("Historical Fictions: ");
		
		//for method will print out last two items in Array
		for(int i = 2; i >= 2 && i < 4; i++ )
		{
			System.out.println(bookNames[i] + " - " + bookAuthors[i]);
		}
		System.out.println(" ");
		System.out.println("Comic and Mangas: ");
		for(int i = 4; i >= 4 && i < 6; i++ )
		{
			System.out.println(bookNames[i] + " - " + bookAuthors[i]);
		}


	}//end of main

}//end of class
