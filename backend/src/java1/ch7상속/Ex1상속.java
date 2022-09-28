package java1.ch7상속;


// 상위[부모]클래스로 사용할 목적
public class Ex1상속 {
	
	public static void main(String[] args) {
		// 1. 객체생성
		DmbCellphone dmbCellphone = new DmbCellphone("자바폰", "검정", 10);{
			
		}
		
		// 2. 객체[클래스]가 상속받은 필드 호출
		System.out.println("모델:" + dmbCellphone.model);
		System.out.println("색상:"+dmbCellphone.color);
		
		// 3. 본인 클래스
		System.out.println("채널:"+dmbCellphone.channel);
		
		// 4. 객체[클래스]가 상속받은 메소드 호출
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.snedVoice("여보세요");
		dmbCellphone.receiveVoice("안녕하세요 저는 홍길동인데요.");
		dmbCellphone.snedVoice("반갑습니다.");
		dmbCellphone.hangUp();
	}
	// 2. 생성자
	// 3. 메소드
}
