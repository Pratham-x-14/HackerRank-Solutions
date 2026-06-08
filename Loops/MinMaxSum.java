class MinMaxSum
{
	public static void miniMaxSum(List <Integer> arr)
	{
		Long sum = 0;

		int min = arr.get(0);
		int max = arr.get(0);

		for(int num : arr)
		{
			sum += num;

			if(num < min)
			{
				min = num;
			}

			if(num > max)
			{
				max = num;
			}
		}
		
		int minimumSum = sum - max;
		int maximumSum = sum - min; 

		System.out.println(minimumSum + " " + maximumSum);
	}
}