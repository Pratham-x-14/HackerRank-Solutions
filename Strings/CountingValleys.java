class CountingValleys
{
	public static int countingValleys(int steps , String path)
	{
		int level = 0;
		int valley = 0;

		for(char step : path.toCharArray())
		{
			if(step == "U")
			{
				level++ ; 

				if(level == 0)
				{
					valley++ ;
				}
			}
			else
			{
				level-- ;
			}
		}

		return valley ;
	}
}