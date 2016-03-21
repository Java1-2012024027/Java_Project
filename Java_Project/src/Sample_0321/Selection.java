package Sample_0321;

import java.util.*;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int in;
		in = input.nextInt();
		
		if (in ==0){
			System.out.println("In is 0");
		}else if((in % 2) ==0){
			System.out.println("In is even");
		}else {
			System.out.println("In is odd");
		}

		switch(in %2){
			case 0:
				System.out.println("In is even");
				break;
			case 1:
				System.out.println("In is odd");
				break;
		}
		input.close();
	}

	
}
