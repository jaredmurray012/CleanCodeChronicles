// Author Jared Murray 
// github jaredmurray012 
// gmail jaredmurray012@gmail.com 
// Main class file for LetUsDoMath

// IN PROGRESS

import java.util.InputMismatchException;
import java.util.Scanner; 

public final class LetUsDoMathMain 
{

	public static void main(String[] args) 
	{
		printMathEquationOptions(); 
		ImplementUserSelection(determineUserSelection()); 

	}
	
	public static void printMathEquationOptions()
	{
		System.out.println("Please Select the math function below by typing in only the OPTION NUMBER");
		System.out.println("Option 1: Addition");
		System.out.println("Option 2: Subtraction");
	}
	
	public static int determineUserSelection() 
	{
		int userOptionSelected = 0; 
		Scanner getOptionFromUser = new Scanner(System.in);
		
		try //VALIDATE USER ENTRY 
		{
			userOptionSelected = getOptionFromUser.nextInt(); 
		}
		
		catch(InputMismatchException e)
		{
			while(userOptionSelected < 0 || userOptionSelected > 9) 
			{
				System.out.println("not a valid entry, Please try again, or enter -1 to exit program");
				userOptionSelected = getOptionFromUser.nextInt();
				if (userOptionSelected == -1)				
				{
					System.exit(0);
				}
			}
			
			while(e != null) // MEANS that user inputed a character/decimal point 
			{
				System.out.println("You did not enter in valid input, program will now shutdown");
				System.exit(0);
			}
		} //END USER VALIDATION 
		
		return userOptionSelected; 
	}

	
	public static void ImplementUserSelection(int numberFromUserSelection)
	{
		System.out.println("Now in ImplementUserSelection");
		// case statement 
	}

}