package runnable;


/**
 * @Author qiangl
 * Created by qgl on 2018/2/28.
 */
public class MyRunnableThread implements Runnable {


    public void run() {
        System.out.println("MyRunnableThread");
    }

    public static void main(String[] args) {

        MyRunnableThread myRunnableThread = new MyRunnableThread();
        Thread thread = new Thread(myRunnableThread);
        thread.start();
    }
}
