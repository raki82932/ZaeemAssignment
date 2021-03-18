import java.lang.Math;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom; 



public class UsefulClassesZA
{ 
	
	
	public static void main(String[] args) throws Exception{
        
		Scanner input = new Scanner(System.in);
		int lowerBound,upperBound;
		System.out.print("Enter minimum random number bound: ");
		lowerBound = input.nextInt();
		System.out.print("Enter maximum random number bound: ");
		upperBound = input.nextInt();
		Random random = new Random();

        int randomNumber1 = random.nextInt(upperBound - lowerBound) + lowerBound;
		int randomNumber2 = random.nextInt(upperBound - lowerBound) + lowerBound;
		int randomNumber3 = random.nextInt(upperBound - lowerBound) + lowerBound;
		int randomNumber4 = random.nextInt(upperBound - lowerBound) + lowerBound;

		System.out.println();

		System.out.println("1) range: "+lowerBound+"-"+upperBound+"  "+"random #s: "+ randomNumber1+" "+randomNumber2+" "+randomNumber3+" "+randomNumber4);
        System.out.println();

		System.out.println("2a) smallest random number: "+Math.min(Math.min(randomNumber1,randomNumber2), Math.min(randomNumber3,randomNumber4)));
		System.out.println("2b) largest random number: "+Math.max(Math.max(randomNumber1,randomNumber2), Math.max(randomNumber3,randomNumber4)));
        System.out.println();

		System.out.print("Enter triangle side a: ");
		double a = input.nextDouble();
		System.out.print("Enter triangle side b: ");
		double b = input.nextDouble();

		System.out.println();

		System.out.println("3) sides: a = "+a+" "+"b = "+b);
		double h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		System.out.println("   hyp:\t  h = "+h+" (exact)");
		System.out.println("       \t  h = "+Math.round(h)+" (rounded)");
		System.out.print("Enter sphere radius: ");
		double r = input.nextDouble();
		double v = ((double)4 / 3) * Math.PI *Math.pow(r,3);
		System.out.println();

		System.out.println("4) sphere r = "+r+"  sphere V = "+v);

	}
}