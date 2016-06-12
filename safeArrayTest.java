package Final;

public class safeArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		safeArray array = new safeArray(-1);
		
		for (int i = 0; i<(array.length + 1); i++){
			array.put(i,i*10);
		}
	}

}
