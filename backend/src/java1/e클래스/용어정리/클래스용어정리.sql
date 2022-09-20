		클래스
		
필드 선언 방식
	[1.자료형][2.변수명/객체명] = [3.데이터]			스택 = 데이터
	[참조 자료형] [변수(객체)명 = new 생성자();		스택 = 객체(힙)

	[static][자료형][변수명] = [데이터]		: 정적필드
	[자료형][변수명] = [데이터]	  		: 인스턴스 필드

	[final][자료형][변수명] = [데이터]  		: 수정불가 필드
	[static][final][자료형][변수명] = [데이터] 		: 상수 필드

	[접근제한자][static][final] 자료형 변수명 = 데이터	: 접근제한필드

	( ) [자료형][변수명] = [데이터]
	1. 기본자료형
		1. boolean 불 = true;
		2. char 문자 = 'A';
		3. byte 바이트 = 100;
		4. short 쇼트 = 3만
		5. int 인트 = 20억
		6. long 롱 = 20억 이상
		7. float 플롯 = 3.123 소수점 7자리
		8. double 더블 = 소수점 15자리

	2. 참조자료형
		[ 배열 ]
			1. boolean[ ] 불배열 = new boolean[10];
			2. char [ ] 차배열 = new char [10];
			3. byte [ ] 바이트배열 = new byte [10];
			4. short [ ] 쇼트배열 = new short [10];
			5. int [ ] 인트배열 = new int [10];
			6. long [ ] 롱배열 = new long [10];
			7. float [ ] 플롯배열 = new float [10];
			8. double [ ] 더블배열 = new double [10];

		[클래스]
			1. 정의 클래스 : Member , Board 등 : 직접 만든 클래스
				Member 객체명 = new Member( );
			2. API 클래스 : Scanner , system , String  : 미리 만들어진 클래스
				Scanner 객체명 = new Scanner ( );

	메소드 선언 방식
		반환자료형 메소드명( 매개변수 ) { return 반환데이터 }
		[static] 반환자료형 메소드명(매개변수) { return 반환데이터 }
		[접근제한자] [static] 반환자료형 메소드명( 매개변수 ) { return 반환데이터 }

		* [ setter 메소드 / getter 메소드 ] : private 필드의 간접접근 위한 메소드
		set필드명( 매개변수 ) { this.필드명 = 매개변수 }
		get필드명( ) { return 필드명; }

	생성자 선언 방식
		클래스명( [매개변수] ){ }
		[접근제한자] 클래스명( [매개변수] ) { }