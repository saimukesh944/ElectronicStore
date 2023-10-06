package mobile.example.mobilesDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class MobilesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilesDemoApplication.class, args);
	}

}
