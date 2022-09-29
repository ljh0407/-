package java1.ch7상속.타이어예제;

public class KumhoTire extends Tire {
	
	
	// 2. 생성자
	public KumhoTire(int maxRotation,   String location) {
		super(maxRotation,location);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;	// 누적 회전수 1씩 증가
		if(accumulatedRotation<maxRotation) { // 최대회전수 보다 누적회전수가 더 작으면 [ 수명남음 ]
			System.out.println(location + "KumhoTire 수명 : "
					+(maxRotation-accumulatedRotation)+"회");
			return true; // 수명 있을경우 true
		}else {System.out.println("***" + location + "KumhoTire 펑크 ***");
			return false; // 수명 없을경우 false [ 펑크 일경우 ]
		}
	}
	
}
