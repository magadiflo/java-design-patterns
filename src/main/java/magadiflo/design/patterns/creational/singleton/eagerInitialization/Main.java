package magadiflo.design.patterns.creational.singleton.eagerInitialization;

public class Main {
    public static void main(String[] args) {
        Thread threadEager1 = new Thread(new ThreadEager1());
        Thread threadEager2 = new Thread(new ThreadEager2());

        threadEager1.start();
        threadEager2.start();
    }

    private static class ThreadEager1 implements Runnable {
        @Override
        public void run() {
            EagerInitializedSingleton s1 = EagerInitializedSingleton.getInstance();
            System.out.println("s1 = " + s1.hashCode());
        }
    }

    private static class ThreadEager2 implements Runnable {
        @Override
        public void run() {
            EagerInitializedSingleton s2 = EagerInitializedSingleton.getInstance();
            System.out.println("s2 = " + s2.hashCode());
        }
    }
}
