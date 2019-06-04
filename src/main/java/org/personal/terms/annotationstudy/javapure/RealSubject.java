package org.personal.terms.annotationstudy.javapure;

/**
 * 普通的 JDK 类是允许 final 类的。
 * 但是一定要有接口。
 */
public final class RealSubject implements ISubject {
	@Override
	public int sellBooks() {
		System.out.println("RealSubject::sellBooks function triggered");
		return 1;
	}

	@Override
	public String speak() {
		System.out.println("RealSubject::speak function triggered");
		return "speak";
	}

	@Override
	public void doNothing() {
		System.out.println("RealSubject::doNothing function triggered");
	}
}
