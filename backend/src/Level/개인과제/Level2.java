package Level.개인과제;

import java.time.LocalDateTime;
import java.util.Scanner;
public class Level2 {

	public static void main(String[] args) {
		
		System.out.println(" >> Level1_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		System.out.printf("%-10s   %15s   %30s\n" , "type" , "value" , "range" );
		System.out.println("-------------------------------------------------------------");
		
		
		
		
		
		boolean 불 = true; 			System.out.printf("%-10s   %15b   %30s\n" , "boolean" , 불 , "true or false" );
		byte 바이트 = 100; 			System.out.printf("%-10s   %15d   %30s\n" , "byte" , 바이트 , "-128 ~ 127 ");
		char 차 = 'A';				System.out.printf("%-10s   %15s   %30s\n" , "char" , 차 , "0~65535[ character 1 ]");
		short 쇼트 = 30000; 			System.out.printf("%-10s   %15d   %30s\n" , "int" , 쇼트 , "-32768 ~ 32767");
		int 인트 = 2000000000; 		System.out.printf("%-10s   %15d   %30s\n" , "int" , 인트 , "-+2000 million");
		long 롱 = 4000000000L;  		System.out.printf("%-10s   %15d   %30s\n" , "long" , 롱 , "-+2000 million Excess");
		float 플롯 = 3.123f;			System.out.printf("%-10s   %15s   %30s\n" , "float" , 플롯 , "8 decimal places");
		double 더블 = 3.12312312;		System.out.printf("%-10s   %15s   %30s\n" , "double" , 더블 , "17 decimal places");
		
	}
	
}
