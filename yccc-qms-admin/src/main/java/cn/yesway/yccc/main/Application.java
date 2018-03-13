package cn.yesway.yccc.main;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cn.yesway.yccc.qms")
@MapperScan(basePackages="cn.yesway.yccc.qms.dao")
public class Application {

	public static void main(String[] args) {
		 SpringApplication.run(Application.class, args);
	}

}
