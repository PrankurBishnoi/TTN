package com.tothenew.JPASessionthree;

import com.tothenew.JPASessionthree.services.ServiceClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaSessionthreeApplication {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext=SpringApplication.run(JpaSessionthreeApplication.class, args);
		ServiceClass serviceClass = applicationContext.getBean(ServiceClass.class);
		serviceClass.oneToOneMapping();
		serviceClass.updateDataOneToone();
		serviceClass.oneToMAnyUniDirectioinal();
		serviceClass.oneToMAnyBiDirectioinal();
		serviceClass.manyToManyMapping();
	}

}
