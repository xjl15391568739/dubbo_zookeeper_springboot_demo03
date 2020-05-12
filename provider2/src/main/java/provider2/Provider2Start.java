package provider2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("provider2.mapper")
public class Provider2Start {

    public static void main(String[] args) {

        SpringApplication.run(Provider2Start.class,args);
    }
}
