package fi.laurea.polymorphism;

class TestBird {
	public static void main(String[] args) {
		Bird myBird = new Bird();

		myBird.fly();
		myBird.fly(10000);
		myBird.fly("eagle", 10000);
		System.out.println("done");
		System.out.println("again");
	}
}