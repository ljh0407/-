package Level.개인과제;

public class Level6 {

	public static void main(String[] args) {
		System.out.println(" >> Level1_6 answer >> \n");
		
		
		short value1 = 30000;			
		int value2 = 2000000000;		
		long value3 = 40000000000L;		
		float value4 = 3.123123123F;	
		double value5 = 3.123123123;	
		
		/* 문제풀이 위치 */
		byte b = (byte)value1;		System.out.println("byte <- short : "+b);
		short s = (short)value2;	System.out.println("short <- int : "+s);
		int i = (int)value3;		System.out.println("int <- long : "+i);
		float f = (float)value4;	System.out.println("long <- folat : "+f);
		double d = (double)value5;	System.out.println("float <- double : "+d);
		/* ----------- */
	}
}
	

