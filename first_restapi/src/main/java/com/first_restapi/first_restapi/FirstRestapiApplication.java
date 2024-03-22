package com.first_restapi.first_restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class FirstRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstRestapiApplication.class, args);
	}

	@RestController
	public class HelloApplicationController {
		@RequestMapping("/") // ルートへこのメソッドをマップする
		public String test() {
			return "manji";
	}
	@RequestMapping("/test") // /testへこのメソッドをマップする
	public String test2() {
		return "test";
	}

}
}
