package com.human.ex;

public class JavaClass {
	public static void main(String[] args) {
		//�ƹ��ų� ���� �ȵŰ� �ڹ� ������
		//�ƹ��ų�;
		//123;
		//���İ����� ���ο��� ����� �� �ִ� �ڹٹ����� ���� ����
		//���
		//System.out.println(���); ����ϸ� ����� ȭ�鿡 ���
		
		//����� �����Ϳ��� �ڷ����� ���缭 ����ϼžߵȴ�.
		//�ڷ������� �ش� ����� �ִ�.
		//boolean ���
		System.out.println(true);//�ƹ��ų� �����̾ƴϰ� boolean����� ���Ŵ�.
		//System.out.println(true1);
		System.out.println(false);
		//System.out.println() ���� ����� �ϳ���
		//�Ű������� ����̸� ����� ȭ�鿡 �״�� ����ϰ� ���� �ٲ۴�.
		
		//char ���� ���  �����ڵ� 1��
		//���ڻ���� ���� �յڿ� ''�� ����Ͽ� ǥ���Ѵ�.
		//System.out.println(a);  error a�� ���ؼ� ��ӵ� �ٰ� ����.
		System.out.println('a');
		//�� ���ڸ� ȭ�鿡 ����Ϸ��� ��� �ؾ��а���.
		System.out.println('��');
		/*���ڵ�� ����ϰ� ������ \\u������ �ڵ带 ������ȴ�.*/
		System.out.println('\u0041');//A
		System.out.println('\u0042');//B
		
		//byte,short,int �ڷ����� int�� ��� ó�� �ش� �ڷ����� ������ �´� 
		//���ڸ� ������ ���ó����
		//int�� ����� ��� �Ҽ������� ���ڸ� ������ �°� ����ϸ�ȴ�.
		//-1123123~~ 121200000
		System.out.println(21232);
		System.out.println(-21232);
		System.out.println(032);//8����
		System.out.println(0x32);//16����
		//System.out.println(082);//8������ ����
		//System.out.println(10000000000);//�� ������ ������
		//10000000000 �� int�� ����� �ƴѵ� int�� ���ó�� ����Ͽ��� ��������
		
		//long�� �ڷ���
		//�Ҽ����� ���� ���ڿ�  long ���ڹ����� ����� �ʴ� ���ڳ��� �ҹ��� l
		//�Ǵ� �빮�� L�� ���̸� �ȴ�.
		System.out.println(10000000000L);
		System.out.println(10000000000l);
		
		System.out.println(100);
		System.out.println(100L);
		
		//float�� ���
		//�Ҽ����� �ִ� ������ F,f�� �ٿ��� ǥ���Ѵ�.
		System.out.println(3.14F);
		System.out.println(3.14f);
		System.out.println(3f);
		System.out.println(3.f);
		System.out.println(.14f);
		
		//double�� ���
		//�Ҽ����� �ִ� �� �� double���,���� ���� D,d ������ double���
		System.out.println(3.14);
		System.out.println(3.);
		System.out.println(.14);
		System.out.println(3D);
		System.out.println(.14d);
		System.out.println(3.14D);
		System.out.println(3.14E-4);
		
		//String �� ��� ���ڿ� ���
		//���ڿ� �����  ""�� ��� ǥ���Ѵ�.
		System.out.println("he\nll\toW\"orld");
		
		//1 , '1' , "1"  3������ �޸𸮿� �ö� �ִ� ����� �ٸ���.
		
		//����� ����  + - * / % 
		//�ϴ� ���ڴ� ���� ������ �ȴ�.
		//���ڿ��� + ���길 �����ϴ�.
		//��+���ڿ�==���ڿ� ��+��==��  ���ڿ�+���ڿ�=���ڿ�
		System.out.println(5+3);//��+��==��
		System.out.println(5.1+3.2);//��+��==��
		System.out.println(5+"�ȳ�");//��+���ڿ�==���ڿ�
		System.out.println("�ȳ�"+"�ȳ�");//���ڿ�+���ڿ�=���ڿ�
		System.out.println(5+5+"�ȳ�");//10�ȳ�
		System.out.println("�ȳ�"+5+5);//�ȳ�55
		

	}

}








