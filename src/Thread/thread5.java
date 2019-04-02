package Thread;

import java.util.Timer;
import java.util.TimerTask;

public class thread5 {
	public static void main(String[] args) {
		Timer time=new Timer();
		time.schedule(new timer1(), 1000,3*1000);
		
	}

}
class timer1 extends TimerTask{
	public void run()
	{
		System.out.println("update");
		System.out.println("repaint");
	}
	
	
}
