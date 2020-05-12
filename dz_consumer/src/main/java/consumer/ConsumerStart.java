package consumer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("provider1.mapper")
public class ConsumerStart {

    public static void main(String[] args) {

        SpringApplication.run(ConsumerStart.class,args);
    }
}
