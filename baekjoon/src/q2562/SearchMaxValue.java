package q2562;

import java.util.Scanner;

/*
�̸�: �̿���
�й�: 201732023
����: 2562 - 9���� ���� �ٸ� �ڿ��� �� �ִ� ã��
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
		
		//System.out.println("�ִ�: " + max + "\n���°? " + count);
	}

}
