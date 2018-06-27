package co.uk.markjesson.examplemicroservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ExampleMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleMicroserviceApplication.class, args);
	}
	
	@RefreshScope
	@RestController
	class MessageRestController {
	 
	    @Value("${msg:Hello World - Config Server down}")
	    private String msg;
	 
	    @RequestMapping("/msg")
	    String getMessage() {
	        return this.msg;
	    }
	}
	
}
