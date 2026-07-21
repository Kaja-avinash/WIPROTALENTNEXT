package com.wipro.thread;

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                    getName() +
                    " | Priority = " +
                    getPriority() +
                    " | Count = " +
                    i);

        }
    }
}

public class PriorityDemo {

    public static void main(String[] args) {

        MyThread max = new MyThread("MAX Thread");
        MyThread norm = new MyThread("NORM Thread");
        MyThread min = new MyThread("MIN Thread");

        max.setPriority(Thread.MAX_PRIORITY);

        norm.setPriority(Thread.NORM_PRIORITY);

        min.setPriority(Thread.MIN_PRIORITY);

        max.start();

        norm.start();

        min.start();

    }
}