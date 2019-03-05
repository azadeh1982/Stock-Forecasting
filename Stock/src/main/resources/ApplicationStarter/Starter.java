package i.Starter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "Controller,Model"})//**Most important thing is you have to add your all controller's package to @ComponentScan annotation //
public class  Starter {
	public static void main(String[] args) {
	SpringApplication.run( Starter.class, args);
		
	}
}


