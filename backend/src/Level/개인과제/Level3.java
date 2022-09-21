package Level.개인과제;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level3 {

	public static void main(String[] args) {
		System.out.println(" >> Level1_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		
					
		 			
						
		 			
		
		
		
		
		
		System.out.print("input boolean : " ); 		boolean 불 = scanner.nextBoolean();
		System.out.print("input byte : "); 			byte 바이트 = scanner.nextByte();
		System.out.print("input char : ");			char 차 = scanner.next().charAt(0);
		System.out.print("input short : ");			short 쇼트 = scanner.nextShort();
		System.out.print("input int : ");			int 인트 = scanner.nextInt();
		System.out.print("input long : ");			long 롱 = scanner.nextLong();
		System.out.print("input flort : ");		float 플롯 = scanner.nextFloat();
		System.out.print("input double : ");		double 더블 = scanner.nextDouble();
		System.out.print("output boolean: " +불+"\n");
		System.out.print("output byte: " +바이트+"\n");
		System.out.print("output char: " +차+"\n");
		System.out.print("output short: " +쇼트+"\n");
		System.out.print("output int: " +인트+"\n");
		System.out.print("output long: " +롱+"\n");
		System.out.print("output flort: " +플롯+"\n");
		System.out.print("output double: " +더블+"\n");
		
	}
}