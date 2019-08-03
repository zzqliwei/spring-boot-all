package westar.service.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import westar.service.AsyncService;

import java.util.Random;
import java.util.concurrent.Future;

/**
 *异步调用
 */
@Service
public class AsyncServiceImpl implements AsyncService {
    public static Random random = new Random();

    @Async
    @Override
    public Future<String> doTask1() throws Exception {
        System.out.println("开始做任务1");
        Long startTime = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        Long endTime = System.currentTimeMillis();
        System.out.println("完成任务1，耗时"+(endTime - startTime)+"毫秒！");
        return new AsyncResult<>("任务一完成！");
    }
    @Async
    @Override
    public Future<String> doTask2() throws Exception {
        System.out.println("开始做任务2");
        Long startTime = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        Long endTime = System.currentTimeMillis();
        System.out.println("完成任务2，耗时"+(endTime - startTime)+"毫秒！");
        return new AsyncResult<>("任务2完成！");
    }

    @Async
    @Override
    public Future<String> doTask3() throws Exception {
        System.out.println("开始做任务3");
        Long startTime = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        Long endTime = System.currentTimeMillis();
        System.out.println("完成任务3，耗时"+(endTime - startTime)+"毫秒！");
        return new AsyncResult<>("任务3完成！");
    }
}
