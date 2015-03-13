package diexample;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	
	//Duong pro da comment tai day
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new 
					ClassPathXmlApplicationContext("di-context.xml");
		Car car=(Car)context.getBean("car");
		
		
		car.show();
		context.close(); 
	
	}
	

	
}
