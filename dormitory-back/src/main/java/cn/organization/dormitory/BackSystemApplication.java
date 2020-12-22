package cn.organization.dormitory;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@MapperScan("cn.organization.dormitory.dao")
@EnableSwagger2
public class BackSystemApplication {

  public static void main(String[] args) {
    SpringApplication.run(BackSystemApplication.class, args);
  }
}
