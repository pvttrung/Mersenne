import java.util.*;
import java.lang.*;

// Число Мерсе́нна — число вида {\displaystyle M_{n}=2^{n}-1}M_{n}=2^{n}-1
// найдите число по мощности числа (2^n -1) и проверьте, является ли число простым числом
// Сложности: O(logn^logn)
class Mersenne
{
	public static void main(String[] arg)
	{
		Scanner inp = new Scanner(System.in);
	//	i: подсчет; j: используется для проверки простого числа
	//	: используйте для умножения;
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
				// первые простые числа Мерсенна равны: 2 = (2^2)-1
				System.out.println(3);
			}
			default:
			{
				System.out.print(3+" ");
				i = 1;
		// 	число отсчета начинается от 2-ого число до n-ого число
				while(i < n)
				{
					pow = pow * 2;
					p=p+1;
					if(p<=3)
					{
						prime = true;
					} else
					{
						for(j=2;j <=(int)Math.floor(Math.sqrt(p));j++)
						{
							if(p%j == 0)
							{
								prime = false;
								break;
							} else
							{
								prime = true;
							}
						}
					}
					// если p - простое число, продолжать проверять мощность-1	
					if(prime)
					{
						for(j=2;j<=((int)Math.floor(Math.sqrt(pow-1)))/2;j++)
						{
							if((pow-1)%j == 0)
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
