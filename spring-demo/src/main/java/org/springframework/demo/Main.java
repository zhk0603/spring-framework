package org.springframework.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.logging.Logger;

@SuppressWarnings("deprecation")
public class Main {
	public static void main(String[] args) {
		Logger test = Logger.getLogger("test");
//		test.info("test");
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//		AServcie bean =  (AServcie)factory.getBean("aServcie");

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		AServcie bean =  (AServcie)context.getBean("aServcie");

		bean.test();
	}
}