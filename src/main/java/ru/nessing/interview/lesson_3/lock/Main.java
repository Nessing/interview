package ru.nessing.interview.lesson_3.lock;

public class Main {

    private static final int THREAD_SLEEP = 1000;

    public static void main(String[] args) {
        LockUnlock lockUnlock = new LockUnlock();

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(THREAD_SLEEP);
                    lockUnlock.perform();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(lockUnlock.getCounter());
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(THREAD_SLEEP);
                    lockUnlock.perform();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(lockUnlock.getCounter());
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(THREAD_SLEEP);
                    lockUnlock.perform();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(lockUnlock.getCounter());
            }
        }).start();
    }
}
