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
		
		try
		{
			userOptionSelected = getOptionFromUser.nextInt();
			return testUserIntInput(userOptionSelected);
		}
		catch (InputMismatchException e)
		{
			testUserNonIntInput(e);
		}
		
		return testUserIntInput(userOptionSelected); 
	}

	
	public static void ImplementUserSelection(int numberFromUserSelection)
	{
		switch(numberFromUserSelection)
		{
		case 1: 
			doAddition();
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
		
		
	}
	
	public static void doAddition()
	{	
		System.out.println("You have selected Addition!");
		int operandOne = getOperand(); 
		int operandTwo = getOperand(); 
		
		int result = operandOne + operandTwo; 
		
		printAdditionSolution(result, operandTwo, operandOne);  
	}

	public static int getOperand()
	{
		System.out.println("Please enter a number and press ENTER");
		
		Scanner OperandFromUser = new Scanner(System.in);
		
		int userSelectedOperand = 0;
		
		try
		{
			userSelectedOperand = OperandFromUser.nextInt();
			return testOperand(userSelectedOperand); 
		}
		
		catch (InputMismatchException e)
		{
			testUserNonIntInput(e);
		}
		
		return testOperand(userSelectedOperand); 
		
	}
	
	public static int testUserIntInput(int userOptionSelected)
	{
		
		if (userOptionSelected < 0 || userOptionSelected > 4) 
		{
			System.out.println("not a valid entry, Please try again, or enter -1 to exit program");
			
			if (userOptionSelected == -1)				
			{
				System.out.println("GoodBye");
				System.exit(0);
			}
			
			determineUserSelection();
			
		}
		return userOptionSelected; 
	}
	
	public static int testOperand(int userOperand)
	{
		if (userOperand < 0 || userOperand > 2147483647)
		{
			System.out.println("Invalid operand entry please try again");
			getOperand(); 
		}
		return userOperand; 
	}
	
	public static void testUserNonIntInput(Exception e)
	{
			System.out.println("You did not enter in valid input, Please try again");
			determineUserSelection();
	}
	
	public static void printAdditionSolution(int result, int operandOne, int operandTwo)
	{
		String answerString = String.format("You selected %d and %d, when these 2 "
				+ "numbers are added together we get %d", operandOne, operandTwo, result);
		
		System.out.println(answerString);
	}

}