package java1.ch13컬렉션프레임워크;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex3_LikedList {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		long startTime;		// 시작 시간을 저장하는 변수
		long endTime;		// 끝 시간을 저장하는 변수
		
		// 1. ArrayList 삽입을 만번 했을때 걸리는 시간 테스트
		startTime = System.nanoTime();  // System.nanoTime() : 현재시스템[pc]의 시간(나노) 호출
		for(int i = 0 ; i<10000 ; i++) {
			list1.add(0 ,i+""); // 숫자 -> 문자열 변환 : 1. 숫자+""  2. String.valueOf(숫자)
		}
		endTime = System.nanoTime();
		System.out.println(" Arraylist 10000개를 삽입하는데 걸리는 시간 : " +(endTime-startTime)+"ns");
		
		
		//
		startTime = System.nanoTime();
		for( int i = 0; i<10000 ; i++ ) {
			list2.add(0, i+"");
		}
		endTime = System.nanoTime();
		System.out.println(" Linkedlist 10000개를 삽입하는데 걸리는 시간 : "+(endTime-startTime)+"ns");
		
		
	}
	
}

/*
  	
  	Arraylist 클래스
	ArrayList<자료형/클래스> 리스트명 = new ArrayList<>();
	* 동기화 지원X
	* 추가/검색 빠름
	객체1	객체2	객체3	객체4	객체5	
	[0]	[1]	[2]	[3]	[4]

Vector 클래스
	Vector<자료형/클래스> 리스트명 = new Vector<>();
	차이점 : 동기화지원한다.(대기상태)

LinkedList 클래스
	* 구조가 다름
	* 중간 삽입/삭제 빠름
	객체1<--링크-->객체2<--링크-->객체3<-->객체4<-->객체5
  	
 
 */
