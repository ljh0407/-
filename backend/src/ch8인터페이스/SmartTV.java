package ch8인터페이스;

public class SmartTV implements remoteControl , Searchable {

	private int volume;
	
	@Override
	public void seach(String url) {
		System.out.println(url+"을 검색합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("스마트tv를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트tv를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if( volume > remoteControl.MAX_VOLUME) {
			this.volume = remoteControl.MAX_VOLUME; // tv소음을 10 고정
		}else if(volume < remoteControl.MIN_VOLUME) {
			this.volume = remoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 스마트tv 볼륨 : " + this.volume);
	}
}
