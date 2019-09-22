package hello;

/*
학번: 201732023
이름: 이영선
내용: 백준 10817번 - 세 수
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int array[] = new int[3];
		for(int i = 0 ; i < array.length ; i++)
			array[i] = s.nextInt();

		if(array[0] < array[1])
			swap(array, 1);
		
		if(array[1] < array[2])
			swap(array, 2);

		if(array[0] < array[1])
			swap(array, 1);

		System.out.println(array[1]);
	}
	
	public static void swap(int[] a, int i)
	{
		int temp = a[i];
		a[i] = a[i-1];
		a[i-1] = temp;
	}
}