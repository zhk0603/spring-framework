package org.springframework.demo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BServcie implements ApplicationContextAware {
	private AServcie aServcie;

	public void test(){
		System.out.println(aServcie);
	}

	public void setaServcie(AServcie aServcie) {
		this.aServcie = aServcie;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}
}
