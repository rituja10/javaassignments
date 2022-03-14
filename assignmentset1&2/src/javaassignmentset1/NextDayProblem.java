package javaassignment;

import java.util.Scanner;
public class NextDayProblem {
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		int year, month , day;
		System.out.println("PE day");
		day = scanner.nextInt();
		System.out.println("PE month");
		month = scanner.nextInt();
		System.out.println("PE year");
		year = scanner.nextInt();

		System.out.println("you have entered date : "+ day +"/"+ month+"/"+ year);

		
		int noOfDays[]={-1, 31,28/29,31,30,31,30,31,31,30,31,30,31};

		if(isLeapYear(year)) {
			noOfDays[2]=29;	
		}
        
		day=day + 1;

		if(day>noOfDays[month]){
			day=1;
			month ++; //13

			if(month >12){
				month =1;
				year++;
			}
		  }


	
		System.out.println("Next date : "+ day +"/"+ month+"/"+ year);

	}

	public static boolean isLeapYear(int year) {
		if( (year%400==0 || year%100!=0) &&(year%4==0))
			return true;
		else
			return false;
	}
}

