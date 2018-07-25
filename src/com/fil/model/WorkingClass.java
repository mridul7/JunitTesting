//Hello Mridul Singh
package com.fil.model;

public class WorkingClass {

	public String sort(String str)
	{
		char[] Array= str.toCharArray();
		for(int i=Array.length-1 ;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(Array[j]>Array[j+1])
				{
					char temp=Array[j];
					Array[j]= Array[j+1];
					Array[j+1]=temp;
				}
			}
		}
		str=new String(Array);
		return str;
	}
}
