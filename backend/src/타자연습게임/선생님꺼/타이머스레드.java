package 타자연습게임.선생님꺼;

public class 타이머스레드 extends Thread {

	public int count = 0;
	private boolean stop = true;
	public static 타이머스레드 싱글톤 = new 타이머스레드();
	private 타이머스레드() {}
	
	public void setstop( boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(stop) {
			{
				count++;
				System.out.print( count +"초");
				
				try{ Thread.sleep(1000); }
				catch (Exception e) {}
				if( count == 5 ) {
					System.out.println("타이머 종료 ");
					타자연습.싱글톤.setstop( false );
					break;
				}
			}
		}
	}
}
