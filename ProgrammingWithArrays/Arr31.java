// Write a program to remove all the duplicate elements of an array;
package ProgrammingWithArrays;

import java.util.Arrays;

public class Arr31{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []ar1= {10,20,30,40,05,10,30,50,30};
		int []count= new int [ar1.length];
		int cot = 0;
		
		
		
		for(int i=0;i<ar1.length;i++)
		{
			int ct=0;
			for(int j=i+1;j<count.length;j++)
			{
				if(count[i]==-1)
				{
					break;
				}
				if(ar1[i]==ar1[j])
				{
					ct++;
					count[j]=-1;
				}
				if(count[i]!=-1)
				{
					count[i]=ct;
				}
			}
			if(count[i]>-1)
			{
				cot++;
			}
		}
	
		int []rem=new int [ar1.length-cot];

		for(int i=0,j=0;i<count.length;i++)
		{
			if(count[i]==0&&j<rem.length)
			{
				rem[j]=ar1[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(rem));
	}
	

}


