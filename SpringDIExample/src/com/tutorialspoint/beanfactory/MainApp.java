package com.tutorialspoint.beanfactory;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;




public class MainApp {
	static final Logger logger=Logger.getLogger(MainApp.class);
	public static void main(String[] args) {
		logger.info("----Start method main----");
		XmlBeanFactory beanFac=new XmlBeanFactory(new ClassPathResource("beans-context.xml"));
		HelloWorld obj=(HelloWorld)beanFac.getBean("helloWorld");
		obj.getMessage();
		logger.info("----End method main----");
	}
}
