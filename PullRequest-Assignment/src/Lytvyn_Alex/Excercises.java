/**
 * @author Alex Lytvyn
 */

package Lytvyn_Alex;

public class Excercises
{
	
	static int threeAndFive()
	{
		int sum = 0;
		
		for (int i = 0; i < 1000; i++)
		{
			if (i % 5 == 0 || i % 3 == 0)
				sum += i;
		}
		
		return sum;
	}
	
	static int evenFibSum()
	{
		int prevTerm = 1;
		int currentTerm = 1;
		int sum = 0;
		
		while (currentTerm < 4000000)
		{
			if (currentTerm % 2 == 0)
				sum += currentTerm;
			
			int nextTerm = prevTerm + currentTerm;
			prevTerm = currentTerm;
			currentTerm = nextTerm;
		}
		
		return sum;
	}
	
	static int largestPrimeFactor()
	{
		long BIG = 600851475143l;
		int counter = 2;
		
		while (counter < (BIG / 2) + 1)
		{
			if (BIG % counter == 0)
			{
				BIG = BIG / counter;
				counter = 2;
			}
			else
				counter++;
		}
		
		return (int)BIG;
		
		/*long num = BIG / 2;
		boolean keepGoing = true;
		
		while (keepGoing && (num > (Math.sqrt((double)BIG)) - 1))
		{
			if (BIG % num == 0)
			{
				boolean prime = true;
				
				for (int i = 2; i < Math.sqrt((double)num) + 1; i++)
				{
					if (num % i == 0);
						prime = false;
				}
				
				if (prime)
					keepGoing = false;
			}
			else
				num--;
			
			//System.out.println(num);
		}
		*/
		
		
	}
	
}