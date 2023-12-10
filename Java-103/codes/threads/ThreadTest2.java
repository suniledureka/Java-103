package co.edureka.java.threads;

class MyTask2 extends Thread{
	@Override
	public void run() {
		System.out.println("\tinside run method");
		Thread t = Thread.currentThread();
		System.out.println("\t"+ t);
	}	
}

public class ThreadTest2 {
	public static void main(String[] args) {
		System.out.println("no of active threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		Thread ct = new MyTask2(); //new thread
		ct.start(); //runnable thread
		
		System.out.println("no of active threads = " + Thread.activeCount());
	}
}
