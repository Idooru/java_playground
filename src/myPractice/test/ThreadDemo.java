package myPractice.test;

public class ThreadDemo extends Thread {
    int share;

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();

        t1.start();
        t2.start();
    }

    public void run() {
        for (int count = 0; count < 10; count++) {
            System.out.println(share++);

            try {
                sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}
