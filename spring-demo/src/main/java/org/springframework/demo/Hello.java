package org.springframework.demo;

import org.springframework.stereotype.Component;

@Component
public class Hello {
	public void sayHi() {
		System.out.println("hi");
	}
}
