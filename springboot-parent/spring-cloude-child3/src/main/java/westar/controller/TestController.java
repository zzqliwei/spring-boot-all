package westar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import westar.model.Person;
import westar.service.AsyncService;

import java.nio.charset.Charset;
import java.util.concurrent.Future;

/**
 * 演示fastjson 以及 全局exception
 */
@Controller
public class TestController {

    @Autowired
    private AsyncService asyncService;

    //乱码需要开启spring.http.encoding.force=true

    @ResponseBody
    @RequestMapping("/person")
    public Object show(){
        Person person = new Person();
        person.setId(1);
        person.setName("zzq");
        int a = 5/0;
        return person;
    }

    @ResponseBody
    @RequestMapping("/async")
    public String asyncTest() throws Exception {

        Long startTime = System.currentTimeMillis();


        Future<String> task1 = asyncService.doTask1();
        Future<String> task2 =asyncService.doTask2();
        Future<String> task3 =asyncService.doTask3();

        while (true){
            if(task1.isDone() && task2.isDone() &&task3.isDone()){
                break;
            }
            Thread.sleep(1000);
        }
        Long endTime = System.currentTimeMillis();
        return "完成任务，总耗时"+(endTime - startTime)+"毫秒！";

    }

}
