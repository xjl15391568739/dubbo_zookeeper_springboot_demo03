package provider1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("provider1.mapper")
public class Provider1Start {

    public static void main(String[] args) {

        SpringApplication.run(Provider1Start.class,args);
    }
}
