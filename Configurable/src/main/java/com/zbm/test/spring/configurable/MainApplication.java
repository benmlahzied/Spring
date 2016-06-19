package com.zbm.test.spring.configurable;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext( "/mainContext.xml" );
		NonSpringBean nonSpringBean = new NonSpringBean();
		System.out.println(nonSpringBean);
	}
}