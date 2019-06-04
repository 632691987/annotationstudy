package org.personal.terms.annotationstudy.cglibstudy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy implements MethodInterceptor {

	private Object target;

	public CGLibProxy(Object target) {
		this.target = target;
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("CGLIB Proxy class calling start...");
		Object result = method.invoke(target, args);
		System.out.println("CGLIB Proxy class calling end...");
		return result;
	}

	public static Object getProxy(Object target) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(new CGLibProxy(target));
		return enhancer.create();
	}
}
