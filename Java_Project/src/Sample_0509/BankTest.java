package Sample_0509;

class Bank{
	double gIR(){
		return 0.0;
	}
}

class BB extends Bank{
	double gIR(){
		return 10.0;
	}
}

class NB extends Bank{
	double gIR(){
		return 5.0;
	}
}
class GB extends Bank{
	double gIR(){
		return 3.0;
	}
}
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB b1 = new BB();
		NB b2 = new NB();
		GB b3 = new GB();
		System.out.println("BB�� ������ : " + b1.gIR());
		System.out.println("NB�� ������ : " + b2.gIR());
		System.out.println("GB�� ������ : " + b3.gIR());
	}

}
