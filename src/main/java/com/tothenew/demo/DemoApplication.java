package com.tothenew.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

		DemoService demoservice;

	public static void main(String[] args)
	{
		//4) Get a Spring Bean from application context and display its properties.
		ApplicationContext apcontext = SpringApplication.run(DemoApplication.class, args);
		LooseCouplingExample tce = (LooseCouplingExample) apcontext.getBean("looseCouplingExample");
		tce.getDemos().showZService();
	}



}
