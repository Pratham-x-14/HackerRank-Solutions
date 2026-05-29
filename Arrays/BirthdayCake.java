class BirthdayCake
{

public static int birthdayCakeCandles(List<Integer> candles) 
{

    int max = 0;
    int count = 0;

    // Find maximum height
    for(int candle : candles) 
	{

        	if(candle > max) 
		{
            		max = candle;
			count = 1;
        	}
    		
		else if(candle == max)
		count++;
            
        }
    }

    		return count;
   }
}
