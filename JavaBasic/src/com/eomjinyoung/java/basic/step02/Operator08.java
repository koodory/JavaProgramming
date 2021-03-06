package com.eomjinyoung.java.basic.step02;

//////////////////////////////////////////////////////
//주제 : 할당 연산자(Assignment Operator)
//////////////////////////////////////////////////////
//
//만든이 :		엄진영

/* 배정연산자
 * - 값을 변수에 할당할 때 쓰는 연산자
 *		a = 10;
 *	 : 10 이라는 값을 변수 a에 할당한다.
 *
 * - 그밖의 할당 연산자
 *		연산자	 예			의미
 *		  +=	a += b		a = a + b;
 *		  *=	a *= b		a = a * b;
 *		 >>=	a >>= b		a = a >> b;
 *
 *	-=, /=, %=, &=, |=, ^=, >>=, >>>=, <<=
 */


public class Operator08 
{
	public static void main(String[] args) 
	{
		int 정수1 = 10;
		정수1 = 정수1 + 100;

		System.out.println("정수1 = 정수1 + 100 --> " + 정수1);

		int 정수2 = 10;
		정수2 += 100;
		System.out.println("정수2 += 100 --> " + 정수2);
	}
}
