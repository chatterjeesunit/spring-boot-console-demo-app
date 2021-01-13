package com.example.demo;

import com.example.demo.service.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext appContext;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		String service = "hello";
		if(args.length > 0) {
			service = args[0];
		}

		Task task = (Task)appContext.getBean(service);
		task.execute();

	}
}
