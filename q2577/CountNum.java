package q2577;

import java.util.Scanner;

/*
�̸�: �̿���
�й�: 201732023
����: 2577 - 0~9���� ���ڰ� �� �� ���Ǿ����� Ȯ��
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
