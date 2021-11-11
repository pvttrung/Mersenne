import java.util.*;

class Mersenne
{
	public static void main(String[] arg)
	{
		Scanner inp = new Scanner(System.in);
		int i,j,n,pow,p;
		boolean prime;
		System.out.print("n: ");
		n = inp.nextInt();
		
		prime = true;
		pow =4;
		p=2;
		switch (n)
		{
			case 0:
			{
				System.out.println("Error!");
				break;
			}
			case 1:
			{
				System.out.println(3);
			}
			default:
			{
				System.out.print(3+" ");
				i = 1;
				while(i < n)
				{
					pow = pow * 2;
					p=p+1;
					if(p<=3)
					{
						prime = true;
					} else
					{
						for(j=2;j <= p/2;j++)
						{
							if(j*j <= p)
							{
								if(p%j == 0)
								{
									prime = false;
									break;
								} else
								{
									prime = true;
								}
				
							} else
							{
								break;
							}
						}
					}
						
					if(prime)
					{
						for(j=2;j<=(pow-1)/2;j++)
						{
							if(j*j <= (pow-1))
							{
								if((pow-1)%j == 0)
								{	
									prime = false;
									break;
								} else
								{	
									prime = true;
								}
					
							} else
							{
								break;
							}
						}
							if(prime)
							{
								System.out.print(pow-1+" ");
								i=i+1;
							}
					}
				}
				System.out.println();
			}
		}
	}
}
