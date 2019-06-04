package org.personal.terms.annotationstudy.cglibstudy;

/**
 * CGLIB 可以无借口，但是不能是final
 */
public class Engineer {

	public void eat() {
		System.out.println("Engineer::eat method");
	}

	public final void work() {
		System.out.println("Engineer::work method");
	}

	private void play() {
		System.out.println("Engineer::play method");
	}

}
