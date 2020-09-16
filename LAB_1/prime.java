import java.lang.Math;
class Prime
{
	public static void main(String args[])
	{
		int s1, s2,count = 0, i, j;
		s1 = Integer.parseInt(args[0]);
		s2 = Integer.parseInt(args[1]);
		System.out.println("Prime numbers between given range are :");

		for(i = s1; i <= s2; i++)
		{
			for( j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					count = 0;
					break;
				}
				else
				{
					count = 1;
				}
			}
			if(count == 1)
			{
				System.out.println(i);
			}
		}
	}
}