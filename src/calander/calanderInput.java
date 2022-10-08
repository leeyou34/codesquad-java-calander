package calander;

import java.util.Scanner;

public class calanderInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요");
		
		int x =scanner.nextInt();
		int i = 0;
		
		switch(x) {
			case 12:
				i=31;
				break;
			case 11:		
				i=30;
				break;
			case 10:
				i=31;
				break;
			case 9:		
				i=30;
				break;
			case 8:
				i=31;
				break;
			case 7:		
				i=30;
				break;
			case 6:
				i=30;
				break;
			case 5:		
				i=31;
				break;
			case 4:
				i=30;
				break;
			case 3:
				i=31;
				break;
			case 2:
				i=28;
				break;
			case 1:		
				i=31;
				break;	
		}
		System.out.println(x+"달은 총 "+i+"날이 있습니다.");
	}

}
