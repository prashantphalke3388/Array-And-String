package com.array.assignment;
//WAP to sort array on the basis of unit place. For example we are having following 
//numbers:- 10,2,3,41,12,13,19,81,9. Output will be 10,41,81,2,12,3,13,19,9.
public class Problem12SortArrayOnBasisOfUnitPlace {
	public static void main(String[] args) {
		int arr[]= {11,20,35,4,12,13,15,87,44};
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]%10==i)
					System.out.print(arr[j]+" ");
			}
			
		}
		
	}

}
