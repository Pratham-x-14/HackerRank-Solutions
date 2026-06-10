class MinAbsoluteDiff {

    public static int minimumAbsoluteDifference(List<Integer> arr) {
    Collections.sort(arr);
    
    int minDiff = Integer.MAX_VALUE;
    
    for(int i = 1 ; i < arr.size() ; i++)
    {
        int diff = Math.abs(arr.get(i)-arr.get(i-1));
        minDiff = Math.min(minDiff , diff);
    }
    return minDiff ;
    }

}