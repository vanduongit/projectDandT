package spring;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class DoBeforeMethod implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("Before show message "+arg0.getName());
	}
}
