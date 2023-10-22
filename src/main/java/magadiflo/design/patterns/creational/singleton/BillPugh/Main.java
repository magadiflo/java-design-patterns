package magadiflo.design.patterns.creational.singleton.BillPugh;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
    }

    private static class Thread1 implements Runnable {
        @Override
        public void run() {
            BillPughSingleton singleton1 = BillPughSingleton.getInstance();
            System.out.println("singleton1 = " + singleton1.hashCode());
        }
    }

    private static class Thread2 implements Runnable {
        @Override
        public void run() {
            BillPughSingleton singleton2 = BillPughSingleton.getInstance();
            System.out.println("singleton2 = " + singleton2.hashCode());
        }
    }
}
