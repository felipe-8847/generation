package ForWhileDo; // 1

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner read = new Scanner(System.in);
			
			for (int i = 1000; i <= 1999; i++) {
				if(i% 11 == 5) {
					System.out.println("\nNumero divisivel por 11 resto 5: "+i);
				}
			}
	}

}
