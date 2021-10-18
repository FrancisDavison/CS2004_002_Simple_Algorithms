public class ArrayMaxExercise
{
	public static void main(String args[])
	{
		double[] ArrayIn = {0,1,2,3,4,5,6,7,8,9,1,2,33,5,3,3,5,6,999,1};
		ArrayMax(ArrayIn);
	}
	public static double ArrayMax(double[] ArrayIn)
	{
		double CurrentMax=0;
		for(int i=0;i<ArrayIn.length;i++)
		{
			if(ArrayIn[i]>=CurrentMax)
			{
				CurrentMax=ArrayIn[i];
				System.out.println(CurrentMax);
			}
		}
		return CurrentMax;
	}
}