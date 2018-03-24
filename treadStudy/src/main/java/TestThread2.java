/**
 * @Author qiangl
 * Created by qgl on 2018/3/21.
 */
public class TestThread2 {
}

class ThreadDemo extends  Thread {

    private Thread t;
    private String threadName;

    ThreadDemo(String threadName){
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running "+ threadName);
//        for (int i = 4 );
    }
}
