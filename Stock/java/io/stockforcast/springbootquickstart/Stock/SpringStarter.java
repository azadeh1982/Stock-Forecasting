package io.stockforcast.springbootquickstart.Stock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "Controller,Model","Service"})
public class SpringStarter {
	public static void main(String[] args) {
		SpringApplication.run(SpringStarter.class, args);
	}
}

