package com.biz._for;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum1 = 34;
		int intMode = (intNum1 % 2);
		boolean even = (intMode == 0);
		
		// if(even == true) {
		if(even) {
			// even�� true�϶� ������ ��ɹ���
			System.out.println("¦�� �³�!!");
			System.out.print("������ ���� ");
			System.out.print(intNum1);
			System.out.println(" �Դϴ�");
		} else {
			// even�� false�϶� ������ ��ɹ���
			System.out.println("�ƴϾ� Ȧ����!!");
		}
		//if��, ���Ǵܹ�
		//if(����, ��) {} : ���� ������ ���� true�ΰ�
		//			�ƴѰ��� �Ǵ��ؼ�
		//			��ɹ��� �帧�� �ٲٴ� keyword
		
		if(intMode == 0) {
			System.out.println("¦����ϱ�!!!");
		}
		// intMode == 0 �� ����� false�̸�
		// �� ���� �ǳ� �ڴ�.
		
		// intMode�� 0�ƴϸ� 1�� ���� �翬�� ���´�
		// ��� ����������
		// � �Ұ��׷����� ������ 0�� 1�� �ƴ�
		// ���� ������ �ִ�.
		// �׷��� ������ �Ǵ� intMode == 0 ��� ����
		// �ݴ�Ǵ� ������ intMode == 1�̾ƴ�
		// intMode != 0 �̶�� ������ �ؾ� �Ѵ�.
		if(intMode == 1) {} 
		if(intMode != 0) {
			
		}
		
		if(intMode == 0) {
			System.out.println("¦������");
		} else {
			System.out.println("Ȧ������");
		}
		
		if(intMode == 0) {
			System.out.println("¦������");
		}
		if(intMode != 0) {
			System.out.println("Ȧ������");
		}
		if(intMode == 1) {
			System.out.println("Ȧ������");
		}
		
		

	}

}