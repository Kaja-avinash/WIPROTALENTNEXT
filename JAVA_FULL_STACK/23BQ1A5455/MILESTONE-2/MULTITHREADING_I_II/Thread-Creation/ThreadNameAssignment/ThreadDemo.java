package com.wipro.thread;

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread Name : " + getName());
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        MyThread thread1 = new MyThread("Scooby");
        MyThread thread2 = new MyThread("Shaggy");

        thread1.start();
        thread2.start();
    }
}