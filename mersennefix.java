import java.util.*;

// Число Мерсе́нна — число вида {\displaystyle M_{n}=2^{n}-1}M_{n}=2^{n}-1
// найдите число по мощности числа (2^n -1) и проверьте, является ли число простым числом
// Сложности: O(n^2logn)
class Mersenne
{
	public static void main(String[] arg)
	{
		Scanner inp = new Scanner(System.in);
	//	i: подсчет; j: используется для проверки простого числа
	//	: используйте для умножения;
		int i,j,n,pow,p;
	//	получать ввод с клавиатуры
		boolean prime;
		System.out.print("n: ");
		n = inp.nextInt();
		
		prime = true;
	//	pow = 4 -> 2^2
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
						//	Не могу импорт каких-либо пакетов поэтому я не использую Math.sqrt() и j начинается от 2 до n/2 и
						// 	условие, квадрат числа больше, чем pow
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
					
					// если p - простое число, продолжать проверять мощность-1
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
