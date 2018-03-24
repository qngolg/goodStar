**java多线程学习**
java多线程实现方式主要有四种：
1. 继承Thread类
2. 实现Runnable接口
3. 实现Callable接口通过FutureTask包装器来创建Thread线程
4. 使用ExecutorService、Callable、Future实现有返回结果的多线程



1、继承Thread类
    Thread类本质是实现Runnable接口的一个实例，代表一个线程的实例。启动线程的唯一方法就是通过Thread类
 的start()实例方法。start()方法是一个native方法，它将启动一个新线程，并执行run()方法。这种方式实现多
 线程很简单，通过自己的类直接extend Thread，并复写run()方法，就可以启动新的线程，并执行自己的run()方
 法。
 
  
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


2、实现Runnable接口创建线程
    如果自己的类已经extends另一个类，就无法直接extends Thread，此时，可以实现一个Runnable接口，如下
 
 
`
  public class MyRunnableThread implements Runnable {
      public void run() {
          System.out.println("MyRunnableThread");
      }
  }
`
 
 
   为了启动MyThread,需要首先实例化一个Thread,并传入自己的MyThread实例：
`  
   MyRunnableThread myRunnableThread = new MyRunnableThread();
   Thread thread = new Thread(myRunnableThread);
   thread.start();
`
   事实上，当传入一个Runnable target参数给Thread后，Thread的run()方法就会调用target.run()，参考
 JDK源代码
   
`
    public void run() {  
    　　if (target != null) {  
    　　 target.run();  
    　　}  
    }  
`


3、实现Callable接口通过FutureTash包装器来创建Thread线程
    Callable接口（也只有一个方法）定义如下：
    `
    public interface Callable<V>   { 
      V call（） throws Exception;   
    } 
    `
    
    public class MyCallableThread<V> implements Callable<V> {
    
        public V call() throws Exception {
    
            System.out.println("MyCallableThread.call()");
            return null;
        }
    }
    
    
    //由Callable<Integer> 创建一个FutureTask<Integer>对象
    Callable oneCallable = new MyCallableThread();
    //注释：FutureTask<Integer>是一个包装器，它通过接受Callable<Integer>来创建，它同时实现了Future和Runnable接口
    //由FutureTask<Integer>创建一个Thread对象  FutureTask实现了Runnable接口
    FutureTask oneTask = new FutureTask(oneCallable);
    Thread oneThread = new Thread(oneTask);
    oneThread.start();
    //至此一个线程就创建完成了
    
   
4、使用ExecutorService、Callable、Future实现有返回结果的线程
    ExecutorService、Callable、Future三个接口实际上都是属于Executor框架。返回结果的线程是在
  JDK1.5中引入的新特征，有了这种特征就不需要再为了得到返回值而大费周折了。而且自己实现了也可能漏
  洞百出。
    可返回值得任务必须实现Callable接口。类似的，无返回值的任务必须实现Runnable接口。
    执行Callable任务后，可以获取一个Future的对象，在该对象上调用get就可以获取到Callable任务返
  回的Object了。
    注意：get方法是阻塞的，即：线程无返回结果，get方法会一直等待。
    再结合线程池接口ExecutorService就可以实现传送中有返回结果的多线程了。
    下面提供了一个完整的有返回结果的多线程测试例子。
  