// Write a program to sagrigate two arrays.
package ProgrammingWithArrays;

import java.util.Arrays;

public class Arr32{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar1= {10,20,30,40,2,4,2,45,10,10,30,30};
		int [] count=new int[ar1.length];
		int cot = 0;
		int s=0;

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
			if(count[i]>=1)
			{
				s++;
			}
		}
		int [] rep=new int[ar1.length-cot-1];
		int [] nonrep=new int[s];
		for(int i=0,j=0;i<count.length;i++)
		{
			if(count[i]==0&&j<rep.length)
			{
				rep[j]=ar1[i];
				j++;
			}
		}
		for(int i=0,j=0;i<count.length;i++)
		{
			if(count[i]>0&&j<nonrep.length)
			{
				nonrep[j]=ar1[i];
				j++;
			}
		}
			System.out.println(Arrays.toString(rep));

	}

}





