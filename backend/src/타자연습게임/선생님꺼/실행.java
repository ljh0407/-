package 타자연습게임.선생님꺼;

import java.util.Scanner;

import 타자연습게임.geme_control;

public class 실행 {
	
	Scanner scanner = new Scanner(System.in);
	private static geme_control control = new geme_control();
	public geme_control() {}
	
	public static geme_control getInstance() {return control;}
	public static void main(String[] args) {
		
		타자연습.싱글톤.타자_start();
		
		
		
	}

}
