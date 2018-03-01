package callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Author qiangl
 * Created by qgl on 2018/2/28.
 */
public class MyCallableThread<V> implements Callable<V> {

    public V call() throws Exception {

        System.out.println("MyCallableThread.call()");
        return null;
    }


    public static void main(String[] args) {

        //由Callable<Integer> 创建一个FutureTask<Integer>对象
        Callable oneCallable = new MyCallableThread();
        //注释：FutureTask<Integer>是一个包装器，它通过接受Callable<Integer>来创建，它同时实现了Future和Runnable接口
        //由FutureTask<Integer>创建一个Thread对象  FutureTask实现了
        FutureTask oneTask = new FutureTask(oneCallable);
        Thread oneThread = new Thread(oneTask);
        oneThread.start();
        //至此一个线程就创建完成了
    }
}
