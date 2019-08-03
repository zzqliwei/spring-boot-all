package westar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync //开启一部调用，也可在主类中申明
public class SpringAsyncConfig {
}
