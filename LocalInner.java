package Final;

public class LocalInner {

	private int data = 30;
	
	void display(){
		final String msg = "������ ������ ����";
		
		class Local{
			void printMsg(){
				System.out.println(msg + data);
			}
		}
		Local obj = new Local();
		obj.printMsg();
	}
}

