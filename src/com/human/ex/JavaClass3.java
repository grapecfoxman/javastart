package com.human.ex;

public class JavaClass3 {
	public static void main(String[] args) {
		//byte,short
		byte b1;
		//�Ҵ���� ���� ������ ����Ҽ� ����.
		//System.out.println(b1);
		b1=10;
		System.out.println(b1);
		
		short s1=11;
		System.out.println(s1);
		
		int i1=10;
		System.out.println(i1);
		
		i1=20;
		i1=3*20+10;//������� ����� ������ i1�� ����ȴ�.
		i1=10+3*20;//����� ��  ���� ���� ���ؼ� ����.
		//�켱������ ����ż�  ����ȴ�.
		//1.i1�� ���� 10���� ����
		//2.���� i1���� 10�� �߰��Ͽ� i1�� ����
		//3.i1���� ���
		i1=10;
		i1=10+i1;
		i1=i1+10;
		//i1+=10;
		System.out.println(i1);
		//1.i2 ������ �����Ͽ� 10�� �ְ�
		//2.i2�� i1�� ���� ���� ���� ������ i3�� �־�
		//3.i3�� ����غ���.
		int i2=10;
		int i3=i1+i2;
		System.out.println(i3);
		System.out.println(i1+i2);
		
		long l1=10l;
		System.out.println(l1);
		
		//float a=1.4;//error
		float a=1.4f;
		System.out.println(a);
		
		double b=3.14;
		System.out.println(b);
		
		String str="helloWorld";
		System.out.println(str);
		//ī�� ���� �÷� �帲  �Է� ������ �����͸� �����ø� ��.
		//double b=3.14;
		//������ Ǯ�� ������ ī���� ��۷� �����Ͻÿ�.
		//�Է°��� ������ �־ ó���Ͻÿ�.
		//�Է°��� ���α׷��߰��� ����� ó���������ÿ�.
		
		System.out.println(Math.sqrt(9));
	
		
		
		
		

	}

}








