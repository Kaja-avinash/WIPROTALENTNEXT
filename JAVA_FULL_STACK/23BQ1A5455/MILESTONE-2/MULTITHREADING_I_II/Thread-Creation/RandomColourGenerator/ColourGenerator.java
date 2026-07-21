package com.wipro.thread;

import java.util.Random;

class ColourTask implements Runnable {

    String colours[] = {
            "White",
            "Blue",
            "Black",
            "Green",
            "Red",
            "Yellow"
    };

    @Override
    public void run() {

        Random random = new Random();

        for (int i = 0; i < colours.length; i++) {

            int index = random.nextInt(colours.length);

            System.out.println(colours[index]);

            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

}

public class ColourGenerator {

    public static void main(String[] args) {

        Thread thread = new Thread(new ColourTask());

        thread.start();

    }

}