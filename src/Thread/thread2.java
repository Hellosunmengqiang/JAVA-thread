package Thread;

public class thread2 {
	public static void main(String[] args) {
		Speak1 speak1=new Speak1();
		Speakcar speakcar=new Speakcar();
		speak1.start();
		speakcar.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("����"+i+" ");
		}
	}

}
class Speak1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=8;i++)
		{
			System.out.println("����"+i+" ");
		}
	}
}
class Speakcar extends Thread
{
	public void run()
	{
		for(int i=0;i<=8;i++)
		{
			System.out.println("�γ�"+i+" ");
		}
	}
}
