package com.qa.testdrivendevelopment;

import java.awt.List;
import java.util.Arrays;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Write a function which takes 2 integers greater than 0, X,Y as input and generates a 2-dimensional array. 
	 * The element value in the i-th row and j-th column of the array should be i*j.  <br>
	 * Note: i=0,1.., X-1; j=0,1,¡­Y-1.  <br>
	 *   <br>
	 * For Example:  <br>
	 * multiply(3,2) → [[0,0,0],[0,1,2]]  <br>
	 * multiply(2,1) → [[0,0]]  <br>
	 * multiply(3,4) → [[0,0,0],[0,1,2],[0,2,4],[0,3,6]]
	 */
	public int[][] multiply(int arrayLength, int numOfArrays){
		return null;
	}
	
	/**
	 * Write a function that accepts a comma separated sequence of words as input and prints the words in a comma-separated
	 * sequence after sorting them alphabetically.
	 * 
	 * For Example:
	 * sortAlphabetically({"bag","car","dog"}) → {"bag","car","dog"}
	 * sortAlphabetically({"dog","car","bag"}) → {"bag","car","dog"}
	 * sortAlphabetically({"car","bark","bag","dog"}) → {"bag","bark","car","dog"}
	 */
	public String[] sortAlphabetically(String[] wordSequence) {
		String[] SortedArray = Arrays.sort(wordSequence);
		
		return SortedArray;
	}

	/**
	 * Write a function which takes an input, a, and returns the sum a+aa+aaa+aaaa.
	 * So if 2 was the input, the function should return 2+22+222+2222 which is 2468.
	 * 
	 * For Example:
	 * aPlus(5) → 6170
	 * aPlus(9) → 11106
	 */
	public int aPlus(int num) {
				
		String Number = Integer.toString(num);

        String TotalTwo = Number + Number;
        String TotalThree = Number + Number + Number;
        String TotalFour = Number + Number + Number + Number;

        int result = num + Integer.parseInt(TotalTwo) + Integer.parseInt(TotalThree) + Integer.parseInt(TotalFour);

        return result;
	}

	/**
	 * Write a function which takes a string of numbers, separated by commas, and returns all the odd numbers as a string, separated by commas.
	 * If there are no odd numbers then the function should return "null".
	 * 
	 * Inputs will always be given in ascending order, eg "3,4,5". Outputs should also be given in ascending order.
	 * 
	 * For Example:
	 * oddNum("1,2,3,4,5") → "1,3,5"
	 * oddNum("2,4,6,8") → "null"
	 * oddNum("23,48,52,57") → "23,57"
	 */
	public String oddNum(String allNums) {
		for()
		return "";
	}

	/**
	 * Define a function that can accept two strings as input and returns the string of largest length 
	 * 
	 * If two strings have the same length, then the function should return both strings separated by a single space.
	 * In this case, the strings should be returned in the same order in which they were given.
	 * 
	 * For Example:
	 * longString("hi","hello") → "hello"
	 * longString("three", "two") → "three"
	 * longString("three", "hello") → "three hello"
	 */
	public String longString(String input1, String input2) {
		
		String Finnish = ""; 
		
		int inOneLength = input1.length();
		int inTwoLength = input2.length();
		
		if(inOneLength < inTwoLength) {
			Finnish = input2;
		}
		else if(inTwoLength < inOneLength) {
			Finnish = input1;
		}
		else if( inOneLength == inTwoLength) {
			Finnish = input1 + " " + input2;
		}
		
		return Finnish;
	}

	
	/**
	 * Given an email address person@company.com, and a parameter "person" or "company",
	 * write a function which returns the corresponding piece of information.
	 * Your function should ignore case.
	 * 
	 * For Example:
	 * email("john@google.com", "person") → "john"
	 * email("jane@Microsoft.com", "company") → "microsoft"
	 * email("Dave@amazon.com", "person") → "dave"
	 */
	public String email(String email, String parameter) {
		return "";
	}

	/**
	 * 	The fibonacci sequence is the sum of the last two numbers, 
	 * 	with index 0 and 1 having a value of 0 and 1 respectively
	 * 
	 * So fibonacci(5) is the sum of fibonacci(4) + fibonacci(3)
	 * 
	 * For Example:
	 * fibbonaci(0) → 0
	 * fibbonaci(1) → 1
	 * fibbonaci(2) → 1
	 * fibbonaci(3) → 2
	 * fibbonaci(4) → 3
	 * fibbonaci(5) → 5
	 * fibbonaci(8) → 21
	 */
	public int fibonacci(int num) {

        int Number1 = 0;
        int Number2 = 1;
        int Number3 = 0;
        for(int Position = 2 ; Position < num; Position++) {
            Number3 = Number1 + Number2;

            System.out.println(Number3);

            Number1 = Number3;
            Number2 = Number1;
        }

        return Number3;
    }


	/**
	 * Write a function which, given a string input, returns a string which contains only the characters with odd indexes.
	 * 
	 * For Example:
	 * oddLetters("Sponge") → "pne"
	 * oddLetters("hi") → "i"
	 * oddLetters("0H1e2l3l4o5w6o7r8l9d") → "Helloworld"
	 */
	public String oddLetters(String input) {
		
		String output = "";
		
		for(int i = 0 ; i < input.length() ; i++) {
			if(i%2 == 0) {
				output = output + input.charAt(i);
			}
		}
		
		return output;
	}


	/**
	 * Write a function which solves the following puzzle.
	 * A farm has chickens and rabbits, and scanners are able to detect the number of heads and legs.
	 * How many chickens do we have, if we know the number of heads and legs?
	 * The values for 'heads' and 'legs' will be inputs.
	 * If there are no solutions to the puzzle, return null
	 * 
	 * For Example:
	 * chickenAndRabbits(35, 94) → 23
	 * chickenAndRabbits(2, 6) → 1
	 * chickenAndRabbits(12,63) → null
	 */
	public Integer chickenAndRabbits(int heads, int legs) {
		if( legs%2 != 0) {
			return null;
		}
		
		//int rabbits = legs/heads;
		int chickens = legs%heads;
		return chickens;
	}


	/**
	 * Write a function which checks the validity of a credit card number.
	 * The function should return a boolean, True if the card is valid, or False if it is not.
	 * 
	 * A credit card has a valid number if it satisfies the following criteria.
	 * - it must start with a 4, 5 or 6.
	 * - it must contain exactly 16 digits.
	 * - each digit must be 0-9 inclusive.
	 * - it may contain hyphens ("-"), to separate groups of 4 digits only, but it cannot contain any other characters.
	 * - it must not have 4 or more consecutive repeated digits.
	 * 
	 * For Example:
	 * validCard("4012-3456-7890-1234") → True
	 * validCard("0123-4567-8901-2345") → False
	 * validCard("401234567890123") → False
	 * validCard("4012 3456 7890 1234") → False
	 * validCard("4444-0123-4567-8901") → False
	 * validCard("4012345678901234") → True
	 */
	public boolean validCard(String cardNumber) {
		boolean Checker = false;
		if(cardNumber.startsWith("4") || cardNumber.startsWith("5") || cardNumber.startsWith("6")) {
			if(cardNumber.length() == 16) {
				if(!cardNumber.contains("1111") || !cardNumber.contains("2222") || !cardNumber.contains("3333") || 
					!cardNumber.contains("4444") || !cardNumber.contains("5555") || !cardNumber.contains("6666") || 
					!cardNumber.contains("7777") || !cardNumber.contains("8888") || !cardNumber.contains("9999")){
					if()
				}
			}
		}
		return Checker;
	}
}