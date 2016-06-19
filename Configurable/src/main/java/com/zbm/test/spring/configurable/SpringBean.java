package com.zbm.test.spring.configurable;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
	
	@Override
	public String toString() {
		return "SpringBean [member=" + member + "]";
	}

	private String member = "member";
}
