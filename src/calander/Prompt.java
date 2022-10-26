package calander;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Prompt {
	
    private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
    private static final int[] LEAP_MAX_DAYS = {31,29,31,30,31,30,31,31,30,31,30,31};
	
	
    public int maxDaysOfMonth(int year, int month) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return LEAP_MAX_DAYS[month - 1];
        }
        else {
            return MAX_DAYS[month - 1];
        }
    }
	
	
	 public void printCalendar(int year, int month, int weekday) {
	        System.out.printf("\t\t<<%4d년 %3d월>>\n",year, month);
	        System.out.println("\tSU\tMO\tTU\tWE\tTH\tFR\tSA");
	        System.out.println("\t--------------------------");

	        int maxDays = maxDaysOfMonth(year,month);

	        for (int k=0; k<weekday; k++) {
	            System.out.print("\t");
	        }

	        for (int j=1; j<=7-weekday; j++) {
	            System.out.printf("\t%d",j);
	        }
	        System.out.println();

	        for (int i=8-weekday; i<=maxDays; i++) {
	            System.out.printf("\t%d",i);
	            if (i % 7 == 7 - weekday) {
	                System.out.println();
	            }
	        }
	        System.out.println();
	        System.out.println();
	    }

	

	public void printMenu() {
		System.out.println("+------------------+");
		System.out.println("|1. 일정 등록          ");
		System.out.println("|2. 일정 검색          ");
		System.out.println("|3. 달력 보기          ");
		System.out.println("|h. 도움말  q. 종료     ");
		System.out.println("+------------------+");
	}
	
	public int parseDay(String week) {
		if(week.equals("su")) return 0;
		else if(week.equals("mo")) return 1;
		else if(week.equals("tu")) return 2;
		else if(week.equals("we")) return 3;
		else if(week.equals("th")) return 4;
		else if(week.equals("fr")) return 5;
		else if(week.equals("sa")) return 6;
		else
			return 0;
	} 
	
	public void runPrompt() {
		printMenu();
		
		Scanner scanner = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
				

		while (true) {

			String cmd = scanner.next();
			if(cmd.equals("1")) cmdRegister();
			else if(cmd.equals("2")) cmdSearch();
			else if(cmd.equals("3")) cmdCal(scanner, cal);
			else if(cmd.equals("h")) printMenu();
			else if(cmd.equals("q")) break;
			}
		System.out.println("Thank you. Bye");
		scanner.close();
	}		
	
	private void cmdCal(Scanner s, Calendar cal) {
		// TODO Auto-generated method stub
		int month =1;
		int year = 2017;
		System.out.println("년도를 입력하세요.(exit: -1)");
		System.out.println("YEAR> ");
		year = s.nextInt();	
		
		
		System.out.println("달을 입력하세요");
		System.out.print("Month> ");
		month = s.nextInt();
		
		if (month>12 || month <1) {
			System.out.println("잘못 된 입력입니다.");
			return;
		}
		
		cal.printCalendar(year, month);
	}
	
	private void cmdSearch() {
		// TODO Auto-generated method stub
		
	}

	private void cmdRegister() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
