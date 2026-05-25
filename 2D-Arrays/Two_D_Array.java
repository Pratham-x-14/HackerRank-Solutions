class Two_D_Array 
{

	public static int diagonalDifference(List<List<Integer>> arr)
	{
		int primary = 0;
		int secondary = 0;

		int n = arr.size();

		for(int i=0 ; i<n ; i++)
		{
			// Primary diagonal
			primary += arr.get(i).get(i);

			// Secondary diagonal
			secondary += arr.get(i).get(n-1-i);
		}
			return Math.abs(primary-secondary);
	}
}
