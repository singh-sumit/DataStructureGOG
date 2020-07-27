package com.meroProgram.pattern;

public class Patterns {
	public static void pattern1()
	{
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4 
		 */
		for(int i=1;i<=4;++i)
		{
			for(int j=1;j<=i;++j)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	public static void pattern2()
	{
		/*
		 * 1
		 * 2 1
		 * 3 2 1
		 * 4 3 2 1
		 */
		for(int i=1;i<=4;++i)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void pattern3()
	{
		/*
		 * 1 2 3 4
		 * 1 2 3
		 * 1 2
		 * 1
		 */
		for(int i=4;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void pattern4()
	{
		/*
		 * 4 3 2 1
		 * 4 3 2
		 * 4 3
		 * 4
		 */
		for(int i=1;i<5;++i)
		{
			for(int j=4;j>=i;--j)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void pattern5()
	{
		/*
		 * - - - 1
		 * - - 2 1
		 * - 3 2 1
		 * 4 3 2 1
		 */
		
		for(int i=1;i<=4;++i)
		{	
			for(int k=i;k<4;k++)
			{
				System.out.print("- ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print(j+"_");
			}
			System.out.println();
		}
	}
	public static void pattern6()
	{
		/*
		 * 4 3 2 1
		 * - 3 2 1
		 * - - 2 1
		 * - - - 1
		 */
		for(int i=4;i>0;i--)
		{
			for(int k=4-i;k>0;k--)
			{
				System.out.print("- ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void pattern7()
	{
		/*					outerindex	dollars		spaces	
		 * $-$-$-$-$			1		5			0
		 * $1-2-3-4$			2		2			
		 * $       $			3		2
		 * $       $			4		2
		 * $-$-$-$-$			5		5
		 */
		/*
		 * if (outerIndex==begin or outerIndex==end) then
		 * 		print("$-")   n times within inner loop			 		
		 *
		 * else 
		 * 		print("$")
		 * 		followed by 7 spaces
		 * 		print 
		 * 		
		 * up logic are wrong
		 */
		for(int oBegin=1;oBegin<=10;oBegin++)
		{
			for(int iBegin=1;iBegin<=10;iBegin++)
			{
				if(oBegin==1||oBegin==10)
					System.out.print("$-");
				else if((oBegin!=1||oBegin!=10)&&(iBegin==1||iBegin==10))
					System.out.print("$-");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern1();
		System.out.println();
		pattern2();
		System.out.println();
		pattern3();
		System.out.println();
		pattern4();
		System.out.println();
		pattern5();
		System.out.println();
		pattern6();
		System.out.println();
		pattern7();
	}
}
