package com.wj.test;

import com.wj.config.Config;
import com.wj.entity.City;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIocTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(Config.class);

		System.out.println(annotationConfigApplicationContext.getBean(City.class));
	}
}
