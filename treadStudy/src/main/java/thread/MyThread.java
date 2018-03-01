package thread;

/**
 * @Author qiangl
 * Created by qgl on 2018/2/28.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread.run()");
    }


    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
    }
}
