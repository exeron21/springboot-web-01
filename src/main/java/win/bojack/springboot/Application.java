package win.bojack.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "win.bojack.springboot.mapper")
@EnableTransactionManagement // 开启事务支持
public class Application {

    public static void main(String[] args) {
        // 启动了SpringBoot程序，启动Spring容器，启动内嵌的tomcat
        SpringApplication.run(Application.class, args);
    }
}
