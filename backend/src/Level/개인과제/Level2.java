package Level.개인과제;

import java.time.LocalDateTime;
import java.util.Scanner;
public class Level2 {

	public static void main(String[] args) {
		
		System.out.println(" >> Level1_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		System.out.printf("%-10s   %15s   %30s\n" , "type" , "value" , "range" );
		System.out.println("-------------------------------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		String 문자열 = scanner.next();
		int 숫자열 = scanner.nextInt();
		Double 소수점 = scanner.nextDouble();
		
		
		boolean 불 = true; 			System.out.printf("bololean  	\t"+"\t" +불+"\t"+"\n");
		byte 바이트 = 100; 			System.out.printf("byte  	\t"+"\t" +바이트+"\t"+"\n");
		char 차 = 'A';				System.out.printf("char  	\t"+"\t" +차+"\t"+"\n");
		short 쇼트 = 30000; 			System.out.printf("short 	\t"+"\t" +쇼트+"\t"+"\n");
		int 인트 = 2000000000; 		System.out.printf("int 	\t"+"\t" +인트+"\t"+"\n");
		long 롱 = 4000000000L;  		System.out.printf("long 	\t"+"\t" +롱+"\t"+"\n");
		float 플롯 = 3.123f;			System.out.printf("float 	\t"+"\t" +플롯+"\t"+"\n");
		double 더블 = 3.12312312;		System.out.printf("double 	\t"+"\t" +더블+"\t"+"\n");
		
	}
	
}
