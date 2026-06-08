class HurdleRace {
    
    public static int hurdleRace(int k, List<Integer> height) 
    {
        int max = height.get(0);
        
        for(int h : height)
        {
            if(h>max)
            {
                max=h;
            }
        }
        return Math.max(0 , max-k);

    }

}