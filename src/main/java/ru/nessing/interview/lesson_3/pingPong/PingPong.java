package ru.nessing.interview.lesson_3.pingPong;


public class PingPong {
    private String pingPong = null;
    private boolean flag = false;
    private final int THREAD_SLEEP = 1000;

    public synchronized void pong() {
        while (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = false;
        notify();
        try {
            Thread.sleep(THREAD_SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("pong");
    }

    public synchronized void ping() {
        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = true;
        notify();
        try {
            Thread.sleep(THREAD_SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ping");
    }

    public synchronized void put(String pingPong) {
        while (this.pingPong != null) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.pingPong = pingPong;
        this.notifyAll();
    }

    public synchronized void print() {
        while (this.pingPong == null) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(pingPong);
        pingPong = null;
        this.notifyAll();
    }
}
