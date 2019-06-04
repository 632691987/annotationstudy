package org.personal.terms.annotationstudy;

public class StaticStudyDemo {

	static {
		System.out.println("Triger StaticStudyDemo ");
	}

	public static class InternalClass {
		static {
			System.out.println("Triger StaticStudyDemo.InternalClass static block");
		}

		public static void display() {
			System.out.println("Hello");
		}
	}

}
