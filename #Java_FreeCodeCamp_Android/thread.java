public class thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {

                for (int i = 0; i < 5; i++) {
                    System.out.printf("printing %d in thread class t1 %n", i);
                    try {
                        Thread.sleep(1000);
    
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                }
               
        });
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.printf("printing %d in main t1 %n", i);
            try {
                Thread.sleep(1000);
    
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
       
    }

}
