package com.kodnest.patterns.assignment;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1 ; i<=7; i++)
		{
			for(int j=1; j<=7; j++)
			{
				if(j==1  || j==7 || i==1 || i==7 || j==8-i || i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}