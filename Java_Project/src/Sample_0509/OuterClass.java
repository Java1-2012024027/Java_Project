package Sample_0509;

public class OuterClass {
	private int value = 10;
	
	class Innerclass{
	public void myMethod(){
		System.out.println("외부 클래스의 private 변수 값 : " + value);

	}
}

	OuterClass(){
		Innerclass obj = new Innerclass();
		obj.myMethod();
	}
}