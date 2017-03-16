// Author Jared Murray 
// github jaredmurray012 
// gmail jaredmurray012@gmail.com 
// Main class file for LetUsDoMath

// IN PROGRESS... 

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
	
	
	// Author's Note: I am not pleased with the size of this function, but I am unaware of the best of way
	// Of Shortening it. 
	public static int determineUserSelection() 
	{
		Scanner getOptionFromUser = new Scanner(System.in);
		
		int userOptionSelected = 0; 
		
		try //VALIDATE USER ENTRY 
		{
			userOptionSelected = getOptionFromUser.nextInt();
			
			while(userOptionSelected < 0 || userOptionSelected > 5) 
			{
				System.out.println("not a valid entry, Please try again, or enter -1 to exit program");
				userOptionSelected = getOptionFromUser.nextInt();
				
				if (userOptionSelected == -1)				
				{
					System.exit(0);
				}
			}
		}
		
		catch(InputMismatchException e)
		{	
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
		
		switch(numberFromUserSelection)
		{
		case 1: 
			additionEquation();
			break; 
			
		case 2:
			System.out.println("Math Option Two here");
			break;
			
		case 3:
			System.out.println("Math Option Three here");
			break;
			
		case 4:
			System.out.println("Math Option Four here");
			break;
			
		default: 
			System.out.println("Invalid option selected, Program will now close"); 
			System.exit(0);
			
		}
		 Finally: 
			 System.out.println("A fine selection, one moment please.");
		
	}
	
	public static int additionEquation()
	{
		firstOperand(); 
		secondOperand(); 
		
		return firstOperand() + secondOperand(); 
	}
	
	// Purpose is to ask user for input and validate said input and return it. 
	public static int firstOperand()
	{
		Scanner OperandFromUser = new Scanner(System.in);
		
		int userSelectedOperand = 0;
		
		System.out.println("Please enter a positive whole number"); 
		
		// LEFT OFF AT THE USER VALIDATION FOR THIS FUNCTION
		
		return 0; 
		
		
	}
	
	// Purpose is to ask user for input and validate said input and return it. 
	public static int secondOperand()
	{
		return 0; 
	}

}