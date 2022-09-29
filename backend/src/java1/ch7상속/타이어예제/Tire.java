package java1.ch7상속.타이어예제;

public class Tire {

	// 1.필드
	public int maxRotation; // 최대 회전수 (타이어수명)
	public int accumulatedRotation;// 누적 회전수
	public String location;  // 타이어 위치
	
	// 2. 생성자
	public Tire(int maxRotation,  String location) {
		this.maxRotation = maxRotation;
		this.accumulatedRotation = accumulatedRotation;
		this.location = location;
	} 
	
	// 3. 메소드
	public boolean roll() {
		++accumulatedRotation;	// 누적 회전수 1씩 증가
		if(accumulatedRotation<maxRotation) { // 최대회전수 보다 누적회전수가 더 작으면 [ 수명남음 ]
			System.out.println(location + "tire 수명 : "
					+(maxRotation-accumulatedRotation)+"회");
			return true; // 수명 있을경우 true
		}else {System.out.println("***" + location + "tire 펑크 ***");
			return false; // 수명 없을경우 false [ 펑크 일경우 ]
		}
	}
}
