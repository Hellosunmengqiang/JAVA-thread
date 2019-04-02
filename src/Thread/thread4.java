package Thread;

public class thread4 {
	public static void main(String[] args) {
		th ta=new th();
		  //ta.run();
		  Thread as=new Thread(ta);
		  as.start();
		  Thread aa=new Thread(ta);
		  aa.start();
	}
}
class th implements Runnable{
	private int ticket=100;
	public void run()
	{
		while(true)
		{
			if(ticket>0)
			{
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在售票第"+ticket--+"票");
			}
		}
	}
}
