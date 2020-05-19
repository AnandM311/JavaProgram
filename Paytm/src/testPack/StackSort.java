package testPack;

import java.util.Arrays;
import java.util.Stack;

public class StackSort {

	public static void main(String[] args) {
		Stack<Integer> input = new Stack<Integer>();
		input.add(34); 
        input.add(3); 
        input.add(31); 
        input.add(98); 
        input.add(92); 
        input.add(23); 
		Stack<Integer> tempStack = new Stack<Integer>();
	while(!input.isEmpty())
	{
		int tempInt = input.pop();
		while(!tempStack.isEmpty() && tempStack.peek()<tempInt)
		{
			input.push(tempStack.pop());
		}
		tempStack.push(tempInt);
	}
	System.out.println(tempStack);
	
	int[] arr = { 1, 3, 2, 7, 5, 4 };
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2!=0)
		{
			arr[i]*=-1;
		}
	}
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2!=0)
		{
			arr[i]*=-1;
		}
	}
	System.out.println(Arrays.toString(arr));
	}

}
