package Level.개인과제;

public class Level5 {

	public static void main(String[] args) {
		System.out.println(" >> Level1_5 answer >> \n");
		
		byte value1 = 100;				
		short value2 = 30000;			
		int value3 = 2000000000;		
		long value4 = 40000000000L;		
		float value5 = 3.123123123F;
		
		/* 문제풀이 위치 */
		short s = value1;  	System.out.println("byte -> short : "+ s);
		int i = value2;  		System.out.println("short -> int : "+ i);	
		long l = value3;		System.out.println("int -> long : "+ l );
		float f = value4;	System.out.println("long -> float : "+f);
		double d = value5;	System.out.println("float -> double : "+d);
		/* ----------- */
	}
}
	

