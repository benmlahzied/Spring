package com.zbm.test.spring.configurable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * Bean not managed by Spring container
 */
@Configurable
public class NonSpringBean {
	
	@Autowired
	private SpringBean springBean;

	@Override
	public String toString() {
		return "NonSpringBean [springBean=" + springBean + "]";
	}	
}
