package com.biz._for;

public class For09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 100;
		
		intNum1 = 200;
		if(intNum1 == 200) {
			
			// {} �ȿ��� ����� ������
			// {} �� ������ �Ҹ�Ǿ
			// ���̻� �а� ���Ⱑ �Ұ����ϴ�.
			int intNum2 = 3400;
			intNum1 = 300;
			System.out.println(intNum2);
		}
		
		// if() { } �ȿ��� �����̸��� intNum2��
		// �����ϰ� ���������
		// {} ���� intNum2�ʹ� ������ �ٸ� �����̴�
		int intNum2 = 500;
		System.out.println(intNum2);
		System.out.println(intNum1);
		
		// for()�ȿ��� ����� i��
		// for() {  } ������
		// �Ҹ�ȴ�.
		// for() {} �� �����Ŀ� i ������
		// ����(�аų� ����)�� �ϸ�
		// ���� ������� ������ ����.
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
		
		// ii ������ for(){} �ۿ��� ����Ⱥ����̴�
		// for(){} �ۿ��� ����� ������
		// for(){} ���� �Ŀ��� ��ȭ�� ä��
		// ���� �����ϰ� �ִ�.
		int ii;
		for(ii = 0; ii<10; ii++) {
			System.out.println(ii);
		}
		
		for(ii = 0 ; ii < 10 ; ii++) {
			System.out.println(ii);
			ii = 100;
		}
		System.out.println(ii);
		
	}

}
