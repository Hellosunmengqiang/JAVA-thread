package Thread;

public class thread4 {
	public static void main(String[] args) {
		th ta=new th();
		  ta.run();
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
				System.out.println(Thread.currentThread().getName()+"������Ʊ��"+ticket--+"Ʊ");
			}
		}
	}
}
