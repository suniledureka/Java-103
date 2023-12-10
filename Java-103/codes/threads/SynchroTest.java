package co.edureka.java.threads;

import java.util.concurrent.TimeUnit;

class Printer{
	//public void printTable(int n) {
	synchronized public void printTable(int n) {
		for(int i=1; i<=5; i++) {
			int p = n * i;
			System.out.printf("%s ---->  %2d x %2d = %3d \n", Thread.currentThread().getName(), n, i, p);
			try {
				TimeUnit.SECONDS.sleep(1);
			}catch(Exception ex) {}			
		}
		System.out.println("-".repeat(50));
		try {
			TimeUnit.SECONDS.sleep(4);
		}catch(Exception ex) {}
	}
}

class ComputerThread1 extends Thread{
	Printer printer;

	public ComputerThread1(Printer printer) {
		super();
		this.printer = printer;
	}
	public void run() {
		printer.printTable(5);
	}
}

class ComputerThread2 extends Thread{
	Printer printer;

	public ComputerThread2(Printer printer) {
		super();
		this.printer = printer;
	}
	public void run() {
		printer.printTable(6);
	}
}
public class SynchroTest {

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		Thread t1 = new ComputerThread1(printer);
		Thread t2 = new ComputerThread2(printer);
		
		t1.setName("DOCUMENT-1");
		t2.setName("DOCUMENT-2");
		t1.setPriority(2);
		t2.setPriority(9);
		
		t1.start();
		t2.start();
	}
}
