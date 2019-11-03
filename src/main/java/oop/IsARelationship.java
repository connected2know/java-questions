package main.java.oop;

public class IsARelationship {

	public class SuperClass2 extends IsARelationship { // SuperClass2 IS-A IsARelationship

	}

	public static void main(String[] args) {

		IsARelationship isARelationship = new IsARelationship();
		IsARelationship type1 = isARelationship.new SuperClass2(); // SuperClass2 IS-A IsARelationship

	}

}
