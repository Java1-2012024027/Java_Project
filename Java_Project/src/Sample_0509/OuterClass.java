package Sample_0509;

public class OuterClass {
	private int value = 10;
	
	class Innerclass{
	public void myMethod(){
		System.out.println("�ܺ� Ŭ������ private ���� �� : " + value);

	}
}

	OuterClass(){
		Innerclass obj = new Innerclass();
		obj.myMethod();
	}
}