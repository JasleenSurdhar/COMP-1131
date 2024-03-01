
/**
 * Write a description of class TEST here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

//importing the Scanner menthod from Java library
import java.util.Scanner;

public class VolumeInGallons
{
    public static void main(String[]args)
    {
        //Conversion Value from Gallons to Litres 
        final double GallonToLitre_Conversion = 4.54609;
        
        //Creating the scanner object to get input
        Scanner scan = new Scanner(System.in);
        
        // Asking for the input from the user
        System.out.println("Please Enter volume in Imperial Gallons");
        
        //Reading the input from the user in decimal value
        double Gallons = scan.nextDouble();
        
        //the formula of conversion
        double LitersToGallons = (Gallons * GallonToLitre_Conversion);
        
        //Displaying the result
        System.out.println( Gallons + " imperial Gallons is equal to " + 
        LitersToGallons
        + " Liters");
        
    
        
    }
}
    
    
        


    