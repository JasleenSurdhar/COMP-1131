
/**
 * Converting Inches to Yards and Feet.
 *
 * @Jasleen.Surdhar
 * @version (a version number or a date)
 */

//importing the Scanner menthod from Java library
import java.util.Scanner;

public class LengthConverter 
{
    public static void main(String[]args)
    {
        //Assigning Final values of Yard and Inches for the conversion
       final int YardInInches = 36;
       final int FootInInches = 12;
       
    //Printing the question asked for inputting the value in inches
    System.out.println("Please enter a whole number value in inches: ");
    
    //Using the Scanner method to take input from users in inches
       Scanner Scan = new Scanner(System.in);
        int inches = Scan.nextInt();
        
    //Applying the formula to convert the inches given to Yards and Feet
    
    int LengthConvertedInYards = (inches / YardInInches);
    int RemainderOfYards = (inches % YardInInches);
    
    int LengthConvertedInFeet = (RemainderOfYards / FootInInches);
    int RemainderOfFeet = ( RemainderOfYards % FootInInches);
    
    int LengthConvertedInInches = (RemainderOfFeet);
  
    
    // Printing the final result to the user
    System.out.println( " The conversted Length in Yards, will be " + LengthConvertedInYards + " Yards, " + LengthConvertedInFeet + " Feet, " 
    + LengthConvertedInInches + " Inches " );
    
    System.out.println("\n");
    
    
    }
}
    
        


    