package Thread;

public class thread3 {
	public static void main(String[] args) {
		ti ta=new ti("����1");
		ti ta1=new ti("����2");
		Thread th=new Thread(ta);
		th.start();
		Thread th1=new Thread(ta1);
		th1.start();
		ti ta2=new ti("����3");
		Thread th2=new Thread(ta2);
		th2.start();
		
		
		/*new Thread(ta,"����1").start();
		new Thread(ta,"����2").start();
		new Thread(ta,"����3").start();
		new Thread(ta,"����4").start();	*/
	}
}
class ti implements Runnable{
	private int ticket=100;
	private String string;
	public ti(String string) {
		this.string=string;
		// TODO �Զ����ɵĹ��캯�����
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
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"������Ʊ��"+ticket--+"Ʊ");
			}
		}
	}
}
