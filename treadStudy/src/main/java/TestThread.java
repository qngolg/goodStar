/**
 * @Author qiangl
 * Created by qgl on 2018/3/21.
 */
public class TestThread {
    public static void main(String[] args) {
        RunnableDemo de = new RunnableDemo("Thread-1");
        de.start();

        RunnableDemo demo = new RunnableDemo("Thread-2");
        demo.start();
    }
}


class RunnableDemo implements Runnable{

    private Thread t;
    private String threadName;

    RunnableDemo(String threadName){
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    public void run() {

        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0 ; i --){
                System.out.println("Thread : "+ threadName + " ," + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread "+ threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start(){
        System.out.println("Starting" + threadName);
        if(t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}