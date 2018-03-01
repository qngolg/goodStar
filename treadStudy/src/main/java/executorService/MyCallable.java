package executorService;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * @Author qiangl
 * Created by qgl on 2018/2/28.
 */
public class MyCallable implements Callable<Object> {


        private String taskNum;

        MyCallable(String taskNum){
            this.taskNum = taskNum;
        }

        public Object call() throws Exception {

            System.out.println(">>>"+taskNum+" 任务启动<<<");
            Date dateTemp = new Date();
            Thread.sleep(1000);
            Date dateTemp1 = new Date();
            long time = dateTemp1.getTime() - dateTemp.getTime();
            System.out.println(">>>"+taskNum+"任务终止<<<");
            return taskNum+"任务返回运行结果，当前任务时间【"+time+"毫秒】";
        }
}
