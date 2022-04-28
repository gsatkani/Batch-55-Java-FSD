package com.wipro.apriltwentyeight;

// final class - prevents inheritence
final class Laptop {

}
// Dell cannot subclass the final class Laptop
class Dell extends Laptop {

}

class Book {
	// final method - prevents method overriding
	final public void calculatePrice() {

	}
}

public class App extends Book {
	@Override // Cannot override the final method from Book
	public void calculatePrice() {

	}

	public static void main(String[] args) {
		final int age = 18; // final variable

		// age=20; // The final local variable cannot be assigned / changed

	}
}
