package fi.laurea.polymorphism;

class Bird {
	public void fly() {
		System.out.println("Lintu lentää.");
	}
	public void fly(int height) {
		System.out.println("The bird is flying " + height + " feet high.");
	}
	public void fly(String name, int height) {
		System.out.println("The " + name + " is flying " + height + " feet high.");
	}
}
