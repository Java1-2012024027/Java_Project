package Sample_0509;

class Animal1 {
	void sound() {
		System.out.println("Animal 努贰胶狼 sound() ");
	}

	void eat() {
		System.out.println("ani eat");
	}
}

class Dog extends Animal1 {
	private int d = 11;

	void sound() {
		System.out.println("港港" +" "+ d);
	}
}

class Cat extends Animal1 {
	private int c = 9;

	void sound() {
		System.out.println("具克" + " " + c);
	}
}

public class DynamicCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 animal = new Animal1();
		Dog dog = new Dog();
		Cat cat = new Cat();

		Animal1 obj;

		obj = animal;
		obj.sound();

		obj = dog;
		obj.sound();

		obj = cat;
		obj.sound();
	}

}
