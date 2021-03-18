 //------------------------------------------HW07A: Strings(Solution File)----------------------------------------------------------------------


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;


public class StringsZA
{
	public static void main(String[] args){
        
		// Setting up Scanner and giving message to the user for taking the input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter desired string: ");
		String myStr = input.nextLine();

		//1)solution---->Prints the original string myStr
		System.out.println("1) myStr is:\t\t"+myStr);
		System.out.println();

		//2)solution----->Length of the string myStr
		System.out.println("2) length of myStr is:\t\t\t"+myStr.length());

        //3)solution----->Prints first and last charecter of a string
		System.out.println("3) first and last chars of myStr are: "+myStr.charAt(0)+" and "+myStr.charAt(myStr.length()-1));
		System.out.println();

        //4)a and 4)b solution ----->Prints the complete string uppercase and original string in an unchanged form
		System.out.println("4a) myStr as all caps:  "+myStr.toUpperCase());
		System.out.println("4b) myStr is unchanged:  "+myStr);

		//5)a and 5)b solution ------>Prints the original string lowercase and original string string in an unchanged form
		System.out.println("5a) myStr as lower case:  "+myStr.toLowerCase());
		System.out.println("5b) myStr is unchanged:  "+myStr);
        System.out.println();

		//6)solution ------>Prints the index of a particular charecter
		System.out.print("Charecter at which index? > ");
		int index = input.nextInt();
		System.out.println(" 6) char at index "+index+":\t\t"+myStr.charAt(index));
        System.out.println();
		input.nextLine();

		//7)solution-------->finding the specific substring pattern in the string if matches it will print the index where the string is found else it will print Match not found(Regex substring pattern matching)
		System.out.print("Search string to locate? > ");
		String s = input.nextLine();
		Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher(myStr);
		boolean matchFound = matcher.find();
        if(matchFound) {
        System.out.println(" 7) substring "+s+" is located at index:  "+myStr.indexOf(s));

		//8)solution-------->printing the complete slicing string from where the substring pattern matches
		System.out.println(" 8) desired substring is:\t\t"+myStr.substring(myStr.indexOf(s),myStr.length()));
        }
		else{
        System.out.println("Match not found");
        }
		System.out.println();
        
		// ArrayList for storing indexes of commas(Finds all the commas in a string)
		
		@SuppressWarnings({"unchecked","deprecation","unused"}) ArrayList<Integer>commaIndexes = new ArrayList();

		for(int i=0;i<myStr.length();i++){
             if(myStr.charAt(i)==','){
				 commaIndexes.add(i);
			 }
		}

		//9)solution------>Prints the index of the first comma
		System.out.println(" 9) first comma is at index:  "+commaIndexes.get(0));

		//10)solution------>Prints the index of the second comma
		System.out.println("10) second comma is at index:  "+commaIndexes.get(1));

		//11)solution------>Prints the index of the third comma
		System.out.println("11) third comma is at index:  "+commaIndexes.get(2));
		System.out.println();
        
		//12)solution------->Printing the substring and the length of the substring between 2'nd and 3'rd index with leading and trailing whitespaces(using only length method)
		System.out.println("12) between commas 2 and 3 is:  "+myStr.substring(commaIndexes.get(1)+1,commaIndexes.get(2))+" length = "+myStr.substring(commaIndexes.get(1)+1,commaIndexes.get(2)).length());

		//13)solution------->Printing the substring and the length of the substring between 2'nd and 3'rd index without  leading and trailing whitespaces using trim method and length method
		System.out.println("13) between commas 2 and 3 is:  "+myStr.substring(commaIndexes.get(1)+1,commaIndexes.get(2)).trim()+" length = "+myStr.substring(commaIndexes.get(1)+1,commaIndexes.get(2)).trim().length());
	   

	}
}