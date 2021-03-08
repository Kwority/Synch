public class Console_synch {


    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                int time =200;

                try {
                    synchronized (System.out) {
                        System.out.println("я первый");
                        Thread.sleep(time);
                        System.out.println("я первый");
                        Thread.sleep(time);
                        System.out.println("я первый");
                        Thread.sleep(time);
                        System.out.println("я первый");
                        Thread.sleep(time);
                        System.out.println("я первый");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int time =150;

                try {
                    synchronized (System.out) {
                        System.out.println("я второй 2");
                        Thread.sleep(time);
                        System.out.println("я второй 2");
                        Thread.sleep(time);
                        System.out.println("я второй 2");
                        Thread.sleep(time);
                        System.out.println("я второй 2");
                        Thread.sleep(time);
                        System.out.println("я второй 2");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });
        t1.start();
        t2.start();
    }

}

