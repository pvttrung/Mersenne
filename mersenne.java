import java.util.*;

// Число Мерсе́нна — число вида {\displaystyle M_{n}=2^{n}-1}M_{n}=2^{n}-1
// найдите число по мощности числа (2^n -1) и проверьте, является ли число простым числом
// Сложности: O(nlogn)
class Mersenne
{
	public static void main(String[] arg)
	{
		Scanner inp = new Scanner(System.in);
	//	i: подсчет; j: используется для проверки простого числа
	//	pow: используйте для умножения; temp: номер нужно проверить
		int i,j,n,pow,temp;
		boolean prime;
	//	получать ввод с клавиатуры
		System.out.print("n: ");
		n = inp.nextInt();
	
		prime = true;
	//	pow = 2 -> 2^1
		pow = 2;
		switch (n)
		{
		//
			case 0:
			{
				System.out.println("Oшибка!");
				break;
			}
		// первые простые числа Мерсенна равны: 2 = (2^2)-1
			case 1:
			{
				System.out.println(2);
				break;

			}
			default:
			{
		// 	число отсчета начинается от 1 до n
				i = 1;
				while(i <= n)
				{
					pow = pow * 2;
					temp = pow - 1;
		//	Не могу импорт каких-либо пакетов поэтому я не использую Math.sqrt() и j начинается от 2 до n/2
					for(j=2;j < temp/2;j++)
					{
						if(temp%j == 0)
						{
		// Если это не простое число, то остановите цикл и измените логику на false
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
