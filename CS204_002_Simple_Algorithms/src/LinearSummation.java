public class LinearSummation
{
	public static void main(String args[])
	{
		System.out.println(System.nanoTime());
		long n = 1000000000L;
		Sum(n);
	}
	
	public static double Sum(long n)
	{
		long LinSum=0;
		for(long i=1;i<=n;i++)
		{
			LinSum+=i;
		}
		System.out.println(LinSum);
		System.out.println(System.nanoTime());
		return(LinSum);
	}
}