/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       07/09/15
 *
 * Filename:   ObjectReferences.java 
 *
 * Purpose:    Demonstrates various aspects of object references.
 *             Updated to use CS12Date rather than former SimpleDate.
 */
public class ObjectReferences {

    public static void main(String [] args) {
    
        CS12Date today;
        CS12Date tomorrow;
        
        // dates now have data, one day apart
        today = new CS12Date(10, 1, 2014);
        tomorrow = new CS12Date(10, 2, 2014);
        
        System.out.println("today is:\t" + today);
        System.out.println("tomorrow is:\t" + tomorrow);

        // now both dates point to same memory
        today = tomorrow;
        
        System.out.println("\ntoday is:\t" + today);
        System.out.println("tomorrow is:\t" + tomorrow);

        // change tomorrow, today will follow along
        tomorrow.setDay(30);
        
        // change today, tomorrow will follow along
        today.setDay(28);
        
        System.out.println("\ntoday is:\t" + today);
        System.out.println("tomorrow is:\t" + tomorrow);

        // tomorrow goes away, but today is unchanged
        // this is how we can delete objects (JVM will do garbage collection)
        tomorrow = null;
        
        // we can still print the null value for tomorrow
        System.out.println("\ntoday is:\t" + today);
        System.out.println("tomorrow is:\t" + tomorrow);
        
        // but we can't DO anything with tomorrow,
        // this will cause a NullPointerException
        // comment this line out if you want the program to free-run
        //tomorrow.nextDay();
    
    }
        
}