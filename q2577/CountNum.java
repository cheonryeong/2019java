package q2577;

import java.util.Scanner;

/*
이름: 이영선
학번: 201732023
내용: 2577 - 0~9까지 숫자가 몇 번 사용되었는지 확인
 */

public class CountNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b, c;
		int[] count = new int[10];
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
				
		String result = Integer.toString(a*b*c);

		for(int i = 0 ; i < result.length() ; i++)
		{
			count[Integer.parseInt(result.substring(i, i+1))] += 1;
		}
		
		for(int i = 0 ; i < 10 ; i ++)
			System.out.println(count[i]);
	}

}
