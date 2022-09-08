package com.array.assignment;

public class Problem6AssendingDescendingOfArray {

	public static void main(String[] args) {
		int[]arr = {15,27,10,30,25,55,45,32};
		int temp=0;
		int flag=0;
		for(int i=arr.length/2;i>=1;i--) {
			for(int j=i-1;j>=0;j--) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=arr.length/2+1;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					flag=arr[i];
					arr[i]=arr[j];
					arr[j]=flag;
				}
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}

}
