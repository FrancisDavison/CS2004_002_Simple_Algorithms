public class GeometricSummation
{
	public static void main(String args[])
	{
		System.out.println(System.nanoTime());
		int a=2;
		int n=5;
		GeometricSum(a,n);
		}
	
	public static int GeometricSum(int a, int n)
	{
		int SumOut=1;
		for(int i=1;i<=n;i++)
		{
			SumOut+=Math.pow(a,i);
		}
		System.out.println(SumOut);
		System.out.println(System.nanoTime());
		return SumOut;
	}
}