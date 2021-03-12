public class Synch_test {
    static int[] arr = {1,1,1,1,1,};

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (arr) {
                    for (int i = 0; i < 5; i++) {

                        System.out.println(arr[i]);
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (arr) {
                    for (int i = 0; i < 5; i++) {
                        arr[i] -= 1;
                        System.out.println(arr[i]);
                    }
                }
            }
        });
        t1.start();
        t2.start();

    }
}
