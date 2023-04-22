package org.springframework.demo;

public class AServcie {

	private BServcie bServcie;

	public void test(){
		System.out.println(bServcie);
	}

	public void setbServcie(BServcie bServcie) {
		this.bServcie = bServcie;
	}
}
