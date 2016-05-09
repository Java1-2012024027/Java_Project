package Sample_0425;

import java.util.Scanner;

public class MidTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		MidTest1 cc = new MidTest1();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("1. I. S");
			System.out.println("2. I. A");
			System.out.println("3. Quit");
			System.out.println("Input menu number : ");
			menu = input.nextInt();

			if (menu == 1)
				cc.function1();
			else if (menu == 2)
				cc.function2();
			else if (menu == 3)
				System.out.println("You Missed");
			else
				System.out.println("Re-input menu number");

		} while (menu != 3);

	}

}
