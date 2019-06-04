package org.personal.terms.annotationstudy.javapure;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	private ISubject iSubject;

	public MyInvocationHandler(ISubject iSubject) {
		this.iSubject = iSubject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println();
		System.out.println("=======================================");
		System.out.println("Calling proxy class");
		System.out.println("Calling " + method.getName() + " method");
		if ( method.getReturnType().isAssignableFrom(int.class) ) {
			System.out.println("Return type is int or Integer");
		} else if ( method.getReturnType().isAssignableFrom(String.class) ) {
			System.out.println("Return type is String");
		} else if ( method.getReturnType() == Void.TYPE ) {
			System.out.println("Return type is Void");
		} else {
			System.out.println("Return type is Other type: " + method.getReturnType());
		}
		System.out.println("=======================================");
		System.out.println();
		return method.invoke(iSubject, args);
	}
}
