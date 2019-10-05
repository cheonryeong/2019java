package hello;

import java.util.Scanner;

/*
학번: 201732023
이름: 이영선
내용: 백준 10818
 */

public class baeg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, number, max = 0, min;
		a = s.nextInt();
		int array[] = new int[a];
		for(int i = 0 ; i < a ; i++)
		{
			number = s.nextInt();
			array[i] = number;
		}
		
		max = array[0];
		min = array[0];
		
		for(int i = 0 ; i < array.length ; i++)
		{
			if(max < array[i])
				max = array[i];
		}
		
		for(int i = 0 ; i < array.length ; i++)
			if(min > array[i])
				min = array[i];
		
		System.out.println(min + " " + max);
	}

}
