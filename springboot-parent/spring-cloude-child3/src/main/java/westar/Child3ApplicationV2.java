package westar;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@SpringBootApplication
public class Child3ApplicationV2 {
    public static void main(String[] args) {
        SpringApplication.run(Child3ApplicationV2.class,args);
    }

    @Bean
    public HttpMessageConverters fastjsonHttpMessageConverter(){
        //创建消息转换器
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        //创建fastjson配置对象
        FastJsonConfig config = new FastJsonConfig();
        //对json进行格式化
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);

        converter.setFastJsonConfig(config);

        HttpMessageConverter<?> con = converter;
        return new HttpMessageConverters(con);
    }
}
