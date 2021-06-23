

import java.util.*;

public class Armstrong 
{
    // * This program generates the first n Armstrong numbers */
    
	public boolean isArmStrong(int no)
    {
		int noOfDigits,sum=0;
		noOfDigits = getNoOfDigits(no); 		
		sum = sumDigitsToPower(no, noOfDigits);
		if (sum == no)
			return true;
		else
			return false;
	}

	public int sumDigitsToPower(int no, int noOfDigits)
    {
		int quotient = no, sum = 0, digit;

		while (true)
		{
			digit = quotient % 10;
			sum = sum + (int) Math.pow(digit,noOfDigits); // pow(x,y) = x^y
			quotient = quotient / 10; 	                  // N.B: integer division
			if (quotient == 0)
			{
				break;
			}
		}
		return (int)sum;
	}

	public int getNoOfDigits(int no) // calculate the number of digits in no
	{
		int noOfDigits = 0, tmp = no;
		while (true)
		{
			if (tmp != 0)
			{
				noOfDigits++;
			}
			tmp = tmp/10;
			if (tmp == 0)
			{
				break;
			}
		}
		return noOfDigits;
	}
    
	public void run() 	// generates the first 20 ArmStrong numbers
	{
		int counter = 0, no = 0;
		while (true)
		{
			no++;
			if (isArmStrong(no))
			{
				System.out.println(no + " is an Armstrong number." );
				counter++;
			}
			if (counter == 20)
			{
				break;
			}
		}
	}

	public static void main(String[] args)
	{
		Armstrong objct = new Armstrong();
		objct.run();
	}

}
