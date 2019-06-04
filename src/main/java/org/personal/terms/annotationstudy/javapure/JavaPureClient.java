package org.personal.terms.annotationstudy.javapure;


import java.lang.reflect.Proxy;

public class JavaPureClient {

	public static void main(String[] args) {
		ISubject subject = new RealSubject();

		MyInvocationHandler handler = new MyInvocationHandler(subject);

		ISubject proxyClass = (ISubject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{ISubject.class}, handler);

		proxyClass.doNothing();
	}

}
