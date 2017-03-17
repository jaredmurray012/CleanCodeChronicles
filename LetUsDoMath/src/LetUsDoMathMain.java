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
		int passedUserInput = 0; 
		
		try
		{
			userSelectedOperand = OperandFromUser.nextInt();
			passedUserInput = testOperand(userSelectedOperand);
			return passedUserInput; 
		}
		
		catch (InputMismatchException e)
		{
			testUserNonIntInput(e);
		}
		
		return testOperand(userSelectedOperand); 
		
	}
	
	public static int testUserIntInput(int userOptionSelected)
	{
		int closeProgramFlag = -1; 
		int firstChoiceAvailable = 1; 
		int lastChoiceAvailable = 4; 
		
		if (userOptionSelected < firstChoiceAvailable || userOptionSelected > lastChoiceAvailable) 
		{
			
			
			if (userOptionSelected == closeProgramFlag)				
			{
					System.out.println("GoodBye");
					System.exit(0);
			}
			
			System.out.println("not a valid entry, Please try again, or enter -1 to exit program");
			determineUserSelection();
		}
		return userOptionSelected; 
	}
	
	public static int testOperand(int userOperand)
	{
		int smallestNonNegativeInt = 0; 
		int largestNumberAnIntCanHandleDividedByTwo = 1073741823; 
		
		if (userOperand < smallestNonNegativeInt || userOperand > largestNumberAnIntCanHandleDividedByTwo)
		{
			System.out.println("The Number you entered was either to big or to small.");
			System.out.println("Please keep the number range between 0 - 1073741823");
			getOperand();    
		} else 
		{
			return userOperand;
		}
		
		return getOperand();
		
		 
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