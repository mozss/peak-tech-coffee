package jmm06double_checked_locking.sample_01;

public class Main {
    public static void main(String[] args) {
        // 线程A
        new Thread() {
            public void run() {
                System.out.println(MySystem.getInstance().getDate());
            }
        }.start();

        // 线程B
        new Thread() {
            public void run() {
                System.out.println(MySystem.getInstance().getDate());
            }
        }.start();
    }
}
