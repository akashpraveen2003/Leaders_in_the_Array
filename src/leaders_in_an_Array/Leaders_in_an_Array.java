package leaders_in_an_Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 	Given an integer array A containing N distinct integers, you have to find all the leaders in array A. 
 	An element is a leader if it is strictly greater than all the elements to its right side.
	PS: The rightmost element is always a leader.
 */
public class Leaders_in_an_Array {
	
	private static void leaders_in_the_array(int[] array) {
		int i,max=Integer.MIN_VALUE;
		int n=array.length;
		ArrayList<Integer> list=new ArrayList<>();
        for(i=n-1;i>=0;i--)
        {
            if(array[i]>=max)
            {
                list.add(array[i]);
                max=array[i];
            }
        }
        Collections.reverse(list);
        System.out.println(list);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int array_size=scanner.nextInt();
		int array[]=new int[array_size];
		for(int i=0;i<array_size;i++)
		{
			array[i]=scanner.nextInt();
		}
		   
		leaders_in_the_array(array);
	}

	

}

/*
 	Input
		A = [16, 17, 4, 3, 5, 2]

	Output
		[17, 2, 5]
		
	Input
		A = [5, 4]

	Output
		[5, 4]
 */
