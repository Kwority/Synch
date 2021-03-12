public class Main {

    static double a = 1;

    public static synchronized void divA() {
        a = a/2;
    }

    public static synchronized void mulA() {
        a = a*2;
    }


    public static void main(String[] args) throws InterruptedException {
        Thread inc_thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {

                    mulA();

                }
            }
        });
        Thread dec_thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {

                    divA();

                }
            }
        });
        inc_thread.start();
        dec_thread.start();
        inc_thread.join();
        dec_thread.join();
        System.out.println(a);
    }
}
