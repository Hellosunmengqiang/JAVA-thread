package Thread;
public class thread1 extends Thread{
	
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(currentThread().getName()+":"+i);
			}
			/*try {
				sleep(100);
			}
			catch(InterruptedException e)
			{
				throw new RuntimeException(e);
			}*/
		}
	
	public static void main(String[] args) {
		thread1 ma=new thread1();
		//thread1 ma1=new thread1();
		ma.start();
		//ma1.start();
		//ma.run();
	}

}
