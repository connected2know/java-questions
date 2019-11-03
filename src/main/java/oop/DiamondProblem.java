package main.java.oop;

public class DiamondProblem {

	public interface Interface1 {

		public void printTestValue();

	}

	public class SuperClass1 implements Interface1 {

		@Override

		public void printTestValue() {

			System.out.println("1");

		}

	}

	public class SuperClass2 implements Interface1 {

		@Override

		public void printTestValue() {

			System.out.println("2");

		}

	}

	public class DiamondProblemClass extends SuperClass1 /* , SuperClass2 */ { // not possible in Java for a class to
																				// extend two classes but, let's imagine
																				// was possible 

	}

	public static void main(String[] args) {

		DiamondProblem diamondProblem = new DiamondProblem();
		DiamondProblem.Interface1 type1 = diamondProblem.new DiamondProblemClass();

		type1.printTestValue(); // which value would be printed? this is the diamond problem in action

	}

}
