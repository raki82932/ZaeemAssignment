//This is the solution file
import java.util.Scanner;

public class CS12DateClientZA
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		CS12Date today, myBday, halloween, christmas;
		int month,day,year;
		System.out.print("Enter month for today: ");
		month=input.nextInt();
		System.out.print("Enter day for today: ");
		day=input.nextInt();
		System.out.print("Enter year for today: ");
		year=input.nextInt();

		today = new CS12Date(month,day,year);
		// 1)Solution
        //explicit call
		System.out.print("1a) today explicitly using tostring = ");
		System.out.print(today.toString());
        System.out.println();

		//implicit call
        System.out.print("1b) today implicitly just using object name = ");
		System.out.print(today);
		System.out.println();
		System.out.println();

        //2)Solution
		today.print("2) This is default constructor date of today");
		System.out.println();

		 //3)Solution
		halloween  = new CS12Date(10,31,2021);
		halloween.print("3)Halloween using m-d-y constructor specifically");
		System.out.println();

        //4)Solution
		myBday = new CS12Date(11,1,2021);
		myBday.print("4)Imaginary birthday using m-d constructor specifically");

		//5)Solution
		christmas = new CS12Date();
        System.out.print("5) Cristmas using default constructor THEN setDate(): ");
		christmas.setDate(12,25,2021);
		System.out.print(christmas);
		
        System.out.println();
		//6)Solution
		System.out.print("6)a 3 days past so called birthday using nextDate():");
		myBday.nextDate();
		myBday.nextDate();
		myBday.nextDate();
		System.out.print(myBday);
        System.out.println();
		myBday.laterDate(7);
		System.out.print("6)b 1 week past so called birthday using laterDate():");
		System.out.print(myBday);
		
		System.out.println();

		//7)Solution

		System.out.print("This year's birthday month? > ");
		month=input.nextInt();
		System.out.print("This year's bitrhday day? > ");
		day=input.nextInt();
		System.out.print("This year's birthday year? > ");
		year=input.nextInt();
		myBday.setDate(month,day,year);

		myBday.print("7) This year's birthday using mutators is/was:");
        //8)Solution
		System.out.println("This year's birthday: "+myBday.toString()+" "+"is/was day #:"+myBday.getDateNum());

		//9)Solution
		System.out.println("Is today "+today.toString()+" my birthday "+myBday.toString()+"? "+today.toString().equals(myBday.toString()));
        //10)Solution
		System.out.println("10)a Compare today to my birthday: "+today.compare(myBday));
		System.out.println("10)b Compare my birthday to today: "+myBday.compare(today));
		System.out.println("10)c Compare today to today: "+today.compare(today));

		month=0;day=0;year=0;

		System.out.println("This year's birthday with dashes is still :"+myBday.getMonth()+"-"+myBday.getDay()+"-"+myBday.getYear());



	}
}

