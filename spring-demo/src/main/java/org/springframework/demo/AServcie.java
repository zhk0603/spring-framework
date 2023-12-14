package org.springframework.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class AServcie {

	private BServcie bServcie;

	@Transactional
	public void test(){
		System.out.println(bServcie);
	}

	@Autowired
	public void setbServcie(BServcie bServcie) {
		this.bServcie = bServcie;
	}
}
