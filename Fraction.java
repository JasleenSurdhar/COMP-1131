
//importing the Scanner menthod from Java library
import java.util.Scanner;

public class Fraction 

{ 
    public static void main(String[] args)
    
    //using the Scanner method to record the input from users
    
    
    { Scanner scan = new Scanner(System.in);
        
    //prompting the user for the Numerator
    System.out.println ("Please enter the Numerator of the fraction: ");
    int Numerator = scan.nextInt();
    
    //prompting the user for the denomintor
     System.out.println ("Please enter the denominator of the fraction: ");
     int Denominator = scan.nextInt();
     
     //Formula for division using */*
     double Fraction = (double) Numerator /  Denominator;
     
     //Printing the results for the user
     System.out.println( "The decimal equivalent of the fraction is " + Fraction+ "\n");
      
    }
}
        
        

        


    