package com.pkochuru.smallestarray;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		int size = 6;
		
		int[] array = {1,3,5,6,4,3};
		
		int inputsum = 9;
		
		System.out.println(smallestsub(size, array, inputsum));
		
	}
	
	public static List<Integer> smallestsub(int size, int[] arr, int ipsum)
	{
		
		List<Integer> minsub = new ArrayList<Integer>();
		int i=0;
		
		for(i=0; i<size; i++)
		{
			if(arr[i]>ipsum)
			{
				minsub.add(arr[i]);
				System.out.println(minsub);
				break;
			}
			else if(i<=4 && arr[i]+arr[i+1] > ipsum)
			{
				minsub.add(arr[i]);
				minsub.add(arr[i+1]);
				System.out.println(minsub);
				break;
			}
			
		}
	
		return minsub;
	}

}
