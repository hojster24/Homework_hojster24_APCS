

public class PrimitiveDataExamples
{
	/**
	 * Use this to test simple addition of ints and print the result
	 */
	public void testAdditionInt()
	{
		int x = 2+2-15;
		System.out.println("here it is " + x);
	}

	/**
	 * Use this to test simple addition of ints and a double and print the result
	 */
	public void testAdditionDouble()
	{
		double x = 2.0+3/4;
		System.out.println("here it is " + x);
	}

	/**
	 * Use this to test order of operations
	 */
	public void testOrderOfOpp()
	{
		int x = 12/2+(15-5);
		System.out.println("here it is " + x);
	}

	/**
	 * Use this to test if a number is evenly divisible by 5
	 * @param x    the number to test if it is divisible
	 * @return     true if it is divisible by 5, false otherwise
	 */
	public boolean divisibleByFive(int x)
	{
		if(x%5==0)
			return true;
		else
			return false;
	}



	/**
	 * Prints out numbers from 1-100 with 10 numbers on each line
	 */
	public void printRows()
	{
		for(int i = 0; i<=100; i++)
			if((i+1)%10 == 0)
				System.out.println(i);
			else
				System.out.print(i);

	}

	/**
	 * Prints out numbers from begin-end with numEachRow numbers on each line
	 * @param begin        the number to begin at
	 * @param end          the number to end at
	 * @param numEachRow   the number of numbers on each row.
	 */
	public void printRows(int begin, int end, int numEachRow)
	{
		for(int i = begin; i<=end; i++)
			if((i+1)%numEachRow == 0)
				System.out.println(i);
			else
				System.out.print(i);
	}

	/**
	 * Prints out the least number of coins that it would take to make cents
	 * @param cents   the number of cents
	 */
	public void leastNumOfCoins(int cents)
	{
		//your code here (currently it returns true)
	}

	/**
	 * given a 3 digit number, it will return true if every number in it goes evenly in the number, or false other wise. 
	 * For example 122 is a self divisor (1 and 2 both evenly go in). Or 128 is a selfDivisor.                   If it has a 0 in it (ie 505), it is NOT a selfDivisor.
	 * @param x   the number
	 */
	public void isSelfDivisor(int x)
	{

		String temp = ""+x;
		int y1 = Integer.parseInt(""+temp.charAt(0));
		int y2 = Integer.parseInt(""+temp.charAt(1));
		int y3 = Integer.parseInt(""+temp.charAt(2));
		if(x % y1 == 0 && x % y2 == 0 && x % y3 == 0)
		{	
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}



	}

	/**
	 * given any digit number, it will return true if every number in it goes evenly in the number, or false other wise. 
	 * For example 122 is a self divisor (1 and 2 both evenly go in). Or 128 is a selfDivisor.                   If it has a 0 in it (ie 505), it is NOT a selfDivisor.
	 * @param x   the number (which has any number of digits)
	 */
	public void APisSelfDivisor(int x)
	{
		//your code here (currently it returns true)

	}      

	//main method for Eclipse
	public static void main(String[] args) 
	{
		PrimitiveDataExamples p=new PrimitiveDataExamples();
		p.isSelfDivisor(122); 

	}


}