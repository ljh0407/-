package java1.e클래스.Ex18_접근제한자.getset메소드;

public class Car {

	// 1. 필드
	private int speed;  // private : 다른 클래스에서 접근 불가
	private boolean stop;
	
	// 2. 생성자
	
	
	// 3. 메소드 [ 필드에 직접 접근이 불가능하니까 필드에 간접접근 메소드 선언 ]
	public int getSpeed(){ return speed; }
	
	public void setSpeed(int speed) {
		if( speed < 0 ) {this.speed = 0 ; return;}
	else { this.speed = speed; }
	}
	
	public boolean isStop() { return stop; }
	
	public void setStop( boolean stop ) {
		this.stop = stop; this.speed = 0;
	}
}	
