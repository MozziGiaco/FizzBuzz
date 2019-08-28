
public class FizBuzz
	{
		static long num;

		public static void main(String[] args)
			{
				for (num = 1; num <= 1000000; num++)
					{
						if (num % 3 == 0)
							{
								System.out.println("Fizz");
							}

						else if (num % 5 == 0)
							{
								System.out.println("Buzz");
							}

						else if (num % 3 == 0 && num % 5 == 0)
							{
								System.out.println("FizBuzz");
							}
						else
							{
								System.out.println(num);

							}

					}

			}

	}
