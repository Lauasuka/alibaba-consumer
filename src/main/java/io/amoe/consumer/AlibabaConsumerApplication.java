package io.amoe.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Amoe
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "io.amoe")
public class AlibabaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaConsumerApplication.class, args);
    }

}

