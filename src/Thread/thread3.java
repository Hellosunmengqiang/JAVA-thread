package Thread;

public class thread3 {
	public static void main(String[] args) {
		ti ta=new ti("窗口1");
		ti ta1=new ti("窗口2");
		Thread th=new Thread(ta);
		th.start();
		Thread th1=new Thread(ta1);
		th1.start();
		ti ta2=new ti("窗口3");
		Thread th2=new Thread(ta2);
		th2.start();
		
		
		/*new Thread(ta,"窗口1").start();
		new Thread(ta,"窗口2").start();
		new Thread(ta,"窗口3").start();
		new Thread(ta,"窗口4").start();	*/
	}
}
class ti implements Runnable{
	private int ticket=100;
	private String string;
	public ti(String string) {
		this.string=string;
		// TODO 自动生成的构造函数存根
	}
	public void run()
	{
		while(true)
		{
			if(ticket>0)
			{
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在售票第"+ticket--+"票");
			}
		}
	}
}
