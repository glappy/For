package com.biz._for;

public class For10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intSum = 0;
		for(int count = 0;count<100;count++) {
//			System.out.println("count:" + (count+1));
			System.out.println(count+1);
			intSum += (count+1);
		}
		System.out.println("intSum:" + intSum);
		
		intSum = 0;
		for(int count = 1;count <= 100;count++) {
			System.out.println(count);
			intSum += count;
		}
		System.out.println(intSum);
		
		// 1���� 100���� ¦���� Ȧ���� ��������
		int intEven = 0;
		int intOdd = 0;
		for(int count = 1;count <=100;count++) {
			if((count%2)==0) intEven ++;
			else intOdd ++;
		}
		System.out.println("EVEN:" + intEven);
		System.out.println("ODD:" + intOdd);
		
		// 1���� 100���� ¦���� Ȧ���� �� ���ϱ�
		int intEvenSum = 0;
		int intOddSum = 0;
		for(int count = 1;count <=100;count++) {
			
			// count : 2,4,6,8,10...
			if((count%2)==0) intEvenSum += count;
			// count : 1,3,5,7,9...
			else intOddSum += count;
		}
		System.out.println("EVEN:" + intEven);
		System.out.println("ODD:" + intOdd);
		
		// 1���� 100���� ������ 3�� ����� ����??
		int thCount = 0;
		for(int c = 1; c <100 ; c++) {
			if(c%3 == 0) thCount ++; 
		}
		System.out.println("3�� ����� ����:" + thCount);
		
		// 1���� 100���� ������ 3�� ����� ����?
		int thSum = 0;
		for(int c = 1 ; c < 100 ; c++) {
			if(c%3 == 0) thSum += c;
		}
		System.out.println("3�� ����� ��:" + thSum);
		
		
		
		int a = 3; 
		// ���������� a�� �����ϰ�,
		//  clear���� 3�� �����϶�
		
		System.out.println(a);
		// ���� a�� ����� ��(3)�� console�� ������
		
		int b = 3;
		// ���������� b�� �����ϰ�,
		// clear���� 3�� �����϶�
		
		System.out.println(a+b);
		// ���� a�� ����� ��(3)��
		// ���� b�� ����� ��(4)�� �����Ͽ�
		// console�� ������

		
		
		
	}

}