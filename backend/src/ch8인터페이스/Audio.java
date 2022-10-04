package ch8인터페이스;

public class Audio implements remoteControl{

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio 끕니다.");
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
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
	
}
