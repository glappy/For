package com.biz._for;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bTest = false;
		
		int intNum1 = 30;
		int intNum2 = 40;
		
		// +-*/ % : ���������
		// <> = : �񱳿�����, ���迬����
		bTest = (intNum1 < intNum2); // true
		System.out.println(bTest);
		
		bTest = (intNum1 > intNum2); // false
		System.out.println(bTest);

		bTest = (intNum1 == intNum2); // false
		System.out.println(bTest);

		bTest = (intNum1 <= intNum2); // true
		System.out.println(bTest);

		bTest = (intNum1 >= intNum2); // false
		System.out.println(bTest);

		// ���� �ٸ���?
		bTest = (intNum1 != intNum2); // true
		System.out.println(bTest);
		
		
		

	}

}