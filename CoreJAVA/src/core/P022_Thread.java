package core;

class AB implements Runnable{
	Thread t = new Thread();
	@Override
	public void run() {
		t.setName("AB thread");
		long startTime = System.currentTimeMillis();
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(t+" : "+i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("time taken by process is : "+(endTime-startTime));
	}
	
}
class AZX extends Thread{
	Thread t = new Thread();
	public void run() {
		t.setName("AZX thread");
		long startTime = System.currentTimeMillis();
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(t+" : "+i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("time taken by process is : "+(endTime-startTime));
	}
}
public class P022_Thread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread t  =new Thread();
		t.setName("MyThread");
		System.out.println(t);
		long startTime = System.currentTimeMillis();
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(t+" : "+i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("time taken by process is : "+(endTime-startTime));
	
		AZX a = new AZX();
		a.run();
		
		AB aa = new AB();
		aa.run();
	}
}
