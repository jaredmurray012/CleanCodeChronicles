// Author Jared Murray 
// github jaredmurray012 
// gmail jaredmurray012@gmail.com 
// Main class file for LetUsDoMath

// IN PROGRESS... 

import java.util.InputMismatchException;
import java.util.Scanner;

public class LetUsDoMathMain 
{

	public static void main(String[] args) 
	{
		String again = ""; 
		Scanner input = new Scanner(System.in); 
		mathEquations test = new mathEquations(); 
		
		test.intialPrintStatements();
		
		do 
		{
			test.menuOptionsExplanation();
			
			
			
		}while(again.startsWith("y")|| again.startsWith("Y"));
		
		input.close();
		//test.askForInput();
		//test.addition(); 
		//test.subtraction();
		//test.multiplication();
		//test.division();
		
		
		

	}
	
}