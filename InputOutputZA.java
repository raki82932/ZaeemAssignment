import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import java.util.Scanner;

class OptionPaneExample {  
JFrame f;
public String s;
OptionPaneExample(){  
    f=new JFrame();   
    String votes_received=JOptionPane.showInputDialog(f,"Enter votes received");
	int votesreceived=Integer.parseInt(votes_received);  
	String votes_cast=JOptionPane.showInputDialog(f,"Enter votes cast");
	int votescast=Integer.parseInt(votes_cast);
	 double pos = ((double)votesreceived/(double)votescast)*100;
	this.s = String.format("%.2f", pos);
	String r = String.format("Votes received:%d\nVotes cast:%d\nPercentage of support:%s%%",votesreceived,votescast,s);
	JOptionPane.showMessageDialog(f,r);
    }  
}

public class InputOutputZA
{
     public static void main(String[] args){

		 Scanner input = new Scanner(System.in);
		 System.out.printf("Enter team full name: ");
		 String name = input.nextLine();
		 System.out.printf("Enter games won: ");
		 int w = input.nextInt();
		 System.out.printf("Enter games lost: ");
		 int l = input.nextInt();
         double p = (double)w/(double)(w+l);
		 System.out.printf("1) Winning ratio for %s this season is: %.3f\n",name,p);
		 OptionPaneExample t =new OptionPaneExample();
		 System.out.printf("3a) Team winning ratio:                    %.3f\n",p);
		 System.out.printf("3b) Percentage of support:                 %s",t.s);
		 System.exit(0);

	     }

}