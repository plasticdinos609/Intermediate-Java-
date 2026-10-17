package q1;
import java.util.*; 
public class tester
{ 
 public static void main(String args[])
 { 
 Scanner kbReader = new Scanner(System.in); 
 System.out.print("Generate which term number? "); 
 int k = kbReader.nextInt( ); 
 
 System.out.println("Term #" + k + " is " + modfib.modfibonacci(k+1)); 
 kbReader.close();
 } 
} 
