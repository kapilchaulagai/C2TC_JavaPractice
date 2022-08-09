package com.cap.prevtest.practice;
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Thread-1 running...");
	}
	public void run(int x)
	{
		System.out.println("Thread-2 running...");
	}
	public void run(long y)
	{
		System.out.println("Thread-3 running...");
	}
}
public class TestThr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
	}

}
