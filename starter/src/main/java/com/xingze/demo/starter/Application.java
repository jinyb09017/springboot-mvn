package com.xingze.demo.starter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//springboot无xml配置，会自动扫描启动类所在包及其子包中的所有带有 @Component，@Service，@Repository，@Controller注解的类
//指定需要被加载成bean的目录对象。这样@service才能被加载起来
@MapperScan(basePackages = {"com.xingze.demo.starter.mapper","com.xingze.demo.dao.mapper"})
@ComponentScan({"com.xingze.demo.serviceImpl", "com.xingze.demo.starter"})


//@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
