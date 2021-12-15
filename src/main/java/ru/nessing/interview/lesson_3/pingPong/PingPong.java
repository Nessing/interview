package ru.nessing.interview.lesson_3.pingPong;


public class PingPong {
    private String pingPong = null;

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
