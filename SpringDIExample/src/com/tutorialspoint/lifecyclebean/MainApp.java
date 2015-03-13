package com.tutorialspoint.lifecyclebean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;




public class MainApp {
	public static void main(String[] args) {
		XmlBeanFactory beanFac=new XmlBeanFactory(new ClassPathResource("lifecycle-context.xml"));
		HelloWorld obj=(HelloWorld)beanFac.getBean("helloWorld");
		obj.getMessage();
	}
}
