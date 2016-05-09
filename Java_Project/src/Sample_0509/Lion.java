package Sample_0509;

public class Lion extends Animal {
	private int legs = 4;

	void roar() {
		System.out.println("roar()가 호출되었음");
	}
	void setPicture(String s){
		picture = s;
		System.out.println(picture);
	}
}
