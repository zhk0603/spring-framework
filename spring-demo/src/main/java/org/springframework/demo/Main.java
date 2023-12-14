package org.springframework.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

@SuppressWarnings("deprecation")
public class Main {
	public static void main(String[] args) {
		Logger test = Logger.getLogger("test");
//		test.info("test");
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//		AServcie bean =  (AServcie)factory.getBean("aServcie");

//		ApplicationContext context = new ClassPathXmlApplicationContext("aopTest.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnonConfig.class);

		AServcie bean =  (AServcie)context.getBean("aServcie");
		bean.test();
	}
}