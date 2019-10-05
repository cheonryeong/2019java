package q2562;

import java.util.Scanner;

/*
이름: 이영선
학번: 201732023
내용: 2562 - 9개의 서로 다른 자연수 중 최댓값 찾기
 */

public class SearchMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[9];
		int max=0, count=1;
		Scanner s = new Scanner(System.in);
		for(int i = 0 ; i < array.length ; i++)
		{
			array[i] = s.nextInt();
			if(max < array[i])
			{
				max = array[i];
				count = i+1;
			}
		}
		
		System.out.println(max + "\n" + count);
		
		//System.out.println("최댓값: " + max + "\n몇번째? " + count);
	}

}
