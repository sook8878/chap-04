package com.greedy.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application1 {
	
	public static void main(String[] args) {
		
		/* 국어, 영어, 수학 점수를 입력받아 
		 * 평균 점수가 60점 이상이면서 각 과목이 40점 이상인 조건이 만족하면 "합격입니다!" 를 출력하세요,
		 * 단, 합격이 아닌 경우 불합격 사유가 무엇인지를 모두 출력해주어야 합니다.
		 * 평균점수 미달인 경우 "평균점수 미달로 불합격입니다." 라고 출력하고,
		 * 과목당 과락 점수가 있는 경우 "xx 과목의 점수 미달로 불합격 입니다." 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 국어 점수를 입력하세요 : 60
		 * 영어 점수를 입력하세요 : 30
		 * 수학 점수를 입력하세요 : 20
		 * 
		 * -- 출력 예시 --
		 * 평균 점수 미달로 불합격입니다.
		 * 영어 점수 미달로 불합격입니다. t삼항이다.!!!!아님 이프임 이프아님 왜냐 하나만 이프를 여러개!!
		 * 수학 점수 미달로 불합격입니다.
		 * */
		Scanner sc = new Scanner (System.in);
		
		System.out.println("국어 점수를 입력하세여 : ");
		int koreanSco = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세여 : ");
		int engSco = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요 : ");
		int mathSco = sc.nextInt();
		
		int averegeSco = ((koreanSco + engSco + mathSco) / 3);
		
	
		//스위치다d 이프 맞음
		if (averegeSco >= 60 && koreanSco >= 40 && engSco >= 40 && mathSco >= 40) {
			System.out.println("합격입니다");
		}else if(averegeSco < 60) {
			System.out.println("평균 점수 미달로 불합");
		}
		
		if (koreanSco < 40) {
			System.out.println("국어점수 미달로 불합");
		}
		
		if (engSco < 40) {
			System.out.println("영어점수 미달로 불합");
		}
			
		if (mathSco < 40) {
			System.out.println("수학점수 미달로 불합");
		}

		
		/*
		if (averegeSco >= 60) {
			if(koreanSco < 40) {
				if(engSco < 40) {
					if(mathSco < 40) {
					System.out.println("합격입니다 !!");
					}
				}
			}else if (averegeSco < 60) {
				System.out.println("평균점수 미달로 불합격입니다.");
			}else {
				
			}
			
			
		}
		
		*/
		/*// 강사님 해설
		if (averegeSco >= 60 && koreanSco >= 40 && engSco >= 40 && mathSco >= 40) {
			System.out.println("합격입니다");
		}else {
			if (averegeSco <60 ) {
				System.out.println("평점 미달로 불합");
			}
		}
		
		*/
		
		
		
		
		
		
		
		
		
	}
}
