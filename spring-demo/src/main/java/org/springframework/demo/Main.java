package org.springframework.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class Main {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		MyTestBean bean = factory.getBean(MyTestBean.class);
		System.out.println(bean.getTestStr());
	}
}