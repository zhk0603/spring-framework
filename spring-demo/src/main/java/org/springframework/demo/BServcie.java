package org.springframework.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class BServcie implements ApplicationContextAware {
	private AServcie aServcie;

	public void test(){
		System.out.println(aServcie);
	}

	@Autowired
	public void setaServcie(AServcie aServcie) {
		this.aServcie = aServcie;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}
}
