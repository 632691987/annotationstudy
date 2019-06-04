package org.personal.terms.annotationstudy.cglibstudy;

public class CGLibClient {

	public static void main(String[] args) {
		Engineer engineer = (Engineer)CGLibProxy.getProxy(new Engineer());
		engineer.eat();
	}
}
