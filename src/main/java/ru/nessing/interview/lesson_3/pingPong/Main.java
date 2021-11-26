package ru.nessing.interview.lesson_3.pingPong;


public class Main {

    public static void main(String[] args) {
        PingPong pingPong = new PingPong();

        Thread thread1 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                pingPong.put("ping");
                pingPong.print();
            }
        });


        Thread thread2 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                pingPong.put("pong");
                pingPong.print();
            }
        });

        thread1.start();
        thread2.start();
    }
}
