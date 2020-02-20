package com.human.ex;

public class JavaClass {
	public static void main(String[] args) {
		//아무거나 쓰면 안돼고 자바 문법만
		//아무거나;
		//123;
		//이후과정은 메인에서 사용할 수 있는 자바문법을 배우는 과정
		//상수
		//System.out.println(상수); 사용하면 상수가 화면에 출력
		
		//상수도 데이터여서 자료형에 맞춰서 사용하셔야된다.
		//자료형마다 해당 상수가 있다.
		//boolean 상수
		System.out.println(true);//아무거나 쓴것이아니고 boolean상수를 쓴거다.
		//System.out.println(true1);
		System.out.println(false);
		//System.out.println() 많은 기능중 하나는
		//매개변수가 상수이면 상수를 화면에 그대로 출력하고 줄을 바꾼다.
		
		//char 문자 상수  유닛코드 1개
		//문자상수는 보통 앞뒤에 ''를 사용하여 표시한다.
		//System.out.println(a);  error a에 대해서 약속된 바가 없다.
		System.out.println('a');
		//각 문자를 화면에 출력하려면 어떻게 해야학가요.
		System.out.println('각');
		/*유코드로 출력하고 싶으면 \\u다음에 코드를 넣으면된다.*/
		System.out.println('\u0041');//A
		System.out.println('\u0042');//B
		
		//byte,short,int 자료형은 int형 상수 처리 해당 자료형의 범위가 맞는 
		//숫자를 넣으면 상수처리됨
		//int형 상수의 경우 소수점없는 숫자를 범위에 맞게 기술하면된다.
		//-1123123~~ 121200000
		System.out.println(21232);
		System.out.println(-21232);
		System.out.println(032);//8진수
		System.out.println(0x32);//16진수
		//System.out.println(082);//8때문에 에러
		//System.out.println(10000000000);//왜 에러가 났을까
		//10000000000 은 int형 상수가 아닌데 int형 상수처럼 기술하여서 에러가남
		
		//long형 자료형
		//소수점이 없는 숫자에  long 숫자범위를 벗어나지 않는 숫자끝에 소문자 l
		//또는 대문자 L를 붙이면 된다.
		System.out.println(10000000000L);
		System.out.println(10000000000l);
		
		System.out.println(100);
		System.out.println(100L);
		
		//float형 상수
		//소수점이 있는 수끝에 F,f를 붙여서 표시한다.
		System.out.println(3.14F);
		System.out.println(3.14f);
		System.out.println(3f);
		System.out.println(3.f);
		System.out.println(.14f);
		
		//double형 상수
		//소수점이 있는 수 는 double상수,숫자 끝에 D,d 넣으면 double상수
		System.out.println(3.14);
		System.out.println(3.);
		System.out.println(.14);
		System.out.println(3D);
		System.out.println(.14d);
		System.out.println(3.14D);
		System.out.println(3.14E-4);
		
		//String 형 상수 문자열 상수
		//문자열 상수는  ""로 묶어서 표현한다.
		System.out.println("he\nll\toW\"orld");
		
		//1 , '1' , "1"  3가지가 메모리에 올라가 있는 모양은 다르다.
		
		//상수의 연산  + - * / % 
		//일단 숫자는 수적 연산이 된다.
		//문자열은 + 연산만 가능하다.
		//수+문자열==문자열 수+수==수  문자열+문자열=문자열
		System.out.println(5+3);//수+수==수
		System.out.println(5.1+3.2);//수+수==수
		System.out.println(5+"안녕");//수+문자열==문자열
		System.out.println("안녕"+"안녕");//문자열+문자열=문자열
		System.out.println(5+5+"안녕");//10안녕
		System.out.println("안녕"+5+5);//안녕55
		

	}

}








