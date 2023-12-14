package org.springframework.demo;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.springframework.demo")
@EnableAspectJAutoProxy(exposeProxy = true)
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class AnnonConfig {
	@Bean
	AServcie aServcie(){
		return new AServcie();
	}
}
