/*
 * Name:       Rob Lapkass
 *
 * Filename:   CS12DateUsage.java
 *
 * Course:     CS-12
 *
 * Date:       07/07/15
 *
 * Purpose:    An example which exercises the CS12Date API
 *
 */

public class CS12DateUsage {

    public static void main( String [] args ) {
	
        // declarations
		int day, month, year, dateNumber;
        boolean result1, result2, result3;
      
	    // declarations and initializations
        // using both full AND default constructors
        // this is how we CREATE new CS12Date objects
        CS12Date independenceDay = new CS12Date(7, 4, 1776);
        CS12Date myBirthday      = new CS12Date(7, 18, 2015);
        CS12Date defaultDate     = new CS12Date();
		
		// print current dates explicitly 
        // (use API toString() method call)
        System.out.println("Print date objects explicitly using toString():");
		System.out.println("Independence Day is " + independenceDay.toString());
		System.out.println("My next BD is: " + myBirthday.toString());
		System.out.println("Default CS12Date is " + defaultDate.toString());
        System.out.println();  // blank line in output
        
        // print a date implicitly
        // (just pass object, its toString() gets automatically used)
        System.out.println("Print date objects implicitly without using toString():");
		System.out.println("Independence Day is " + independenceDay);
		System.out.println("My next BD is: " + myBirthday);
		System.out.println("Default CS12Date is " + defaultDate);
        System.out.println();
      
        // we can get full details on an object by using its provided print() method
        System.out.println("Print date objects using the provided print() method:");
        independenceDay.print("Independence Day");
        myBirthday.print("Instructor's BD");
        defaultDate.print("Default CS12Date");
        System.out.println();
      
		// reset default date and print:
		defaultDate.setDate(10, 31, 2015);
		System.out.println("Next Halloween is " + defaultDate);
        System.out.println();
		
		// up date by two months and print
		defaultDate.setMonth(12);
		System.out.println("2 months later defaultDate: " + defaultDate);
        System.out.println();
        
        // move the date 10 days back
        defaultDate.priorDate(10);
        System.out.println("defaultDate 10 days earlier: " + defaultDate);
        
        // move the date 5 days later
        defaultDate.laterDate(5);
        System.out.println("defaultDate 5 days later: " + defaultDate);
        System.out.println();
        
		// extract just individual fields and print
        // note that entire RHS expression evaluates to a variable of the indicated type
        month = independenceDay.getMonth();
        System.out.println("month = " + month);
      
		day = independenceDay.getDay();
        System.out.println("day = " + day);
      
        year = independenceDay.getYear();
		System.out.println("year = " + year);
        
        dateNumber = independenceDay.getDateNum();
        System.out.println(independenceDay + " is day " + dateNumber + " of the year");
		
		// advance independence day by 1 day, and print
		independenceDay.nextDate();
		System.out.println("The day after Independence Day is " + independenceDay);
      
        // output separator
        System.out.println("\n--------------------------------------------------\n"); 
      
        // check the equivalence of two dates
        result1 = independenceDay.equals(myBirthday);
        result2 = myBirthday.equals(independenceDay);
        System.out.println("Are Independence Day and my birthday the same? \t" + result1);
        System.out.println("Are my birthday and Independence Day the same? \t" + result2);
      
        result3 = defaultDate.equals(defaultDate);
        System.out.println("defaultDate had better be the same as itself: \t" + result3);
      
    } // end main
   
} // end class