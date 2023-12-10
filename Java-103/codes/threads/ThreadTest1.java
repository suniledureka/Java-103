package co.edureka.java.threads;

class MyTask1 implements Runnable{
	@Override
	public void run() {
		System.out.println("\tinside run method");
		Thread t = Thread.currentThread();
		System.out.println("\t"+ t);
	}	
}

public class ThreadTest1 {
	public static void main(String[] args) {
		System.out.println("no of active threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		Runnable task1 = new MyTask1();
		Thread ct = new Thread(task1); //new thread
		ct.start(); //runnable thread
		
		System.out.println("no of active threads = " + Thread.activeCount());
	}
}
