package java1.e클래스.Ex6;

public class Member {

	// 1. 필드
	String id; 
	String password;
	String name;
	int point;
	// 2. 생성자
		// 1. 빈생서자
	public Member() {}
		// 2. 회원가입시 사용되는 객체 생성자
	Member (String id , String password , String name , int point){
		this.id = id;  // this 사용하는 이유 [ 내부필드 와 매개변수의 이름이 동일할경우 식별용 ]
		this.password = password;
		this.name = name;
		this.point = point;
	}
		// 3. 회원정보에서 비밀번호가  변경시 사용되는 객체 생성자
	Member ( String password  ){
		this.password = password;
		
	}
	
		// 4. 로그인[아이디,비밀번호]시 사용되는 객체 생성자
	Member (String id, String password){
		this.id = id;
		this.password = password;
	}
	
	// 3. 메소드
	
}
