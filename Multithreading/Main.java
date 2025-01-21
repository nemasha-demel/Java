public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread thread1 = new MyThread();
        
        MyRunnable runnnable = new MyRunnable();
        Thread thread2 = new Thread(runnnable);

        thread1.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //thread1.join(); // After execution of thread1 is done, execution of thread2 will be started.
        thread2.start();
    }
    
}
