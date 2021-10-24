import java.util.*;

class Mersenne
{
	public static void main(String[] arg)
	{
		Scanner inp = new Scanner(System.in);
		int i,j,n,pow,temp;
		boolean prime;
		System.out.print("n: ");
		n = inp.nextInt();
		
		prime = true;
		pow =2;
		switch (n)
		{
			case 0:
			{
				System.out.println("Error!");
				break;
			}
			case 1:
			{
				System.out.println(2);
				break;

			}
			default:
			{
				i = 1;
				while(i <= n)
				{
					pow = pow * 2;
					temp = pow - 1;
					for(j=2;j < temp/2;j++)
					{
						if(temp%j == 0)
						{
							prime = false;
							break;
						} else
						{
							prime = true;
						}		
					}
					if(prime)
					{
						System.out.print(temp+" ");
						i = i+1;
					}
				}
				System.out.println();
			}
		}
	}
}
