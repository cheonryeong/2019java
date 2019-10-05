package work;

/*
학번: 201732023
이름: 이영선
내용: 백준 10952
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = 1, b = 1;
		
		while(true)
		{
			a = s.nextInt();
			b = s.nextInt();
			if(a == 0 && b == 0)
				break;
			System.out.println(a+b);
		}
	}

} 
