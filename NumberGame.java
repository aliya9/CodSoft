import java.util.Scanner;
import java.util.Random;

public class NumberGame 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        
        Random r = new Random();
        int genNum = r.nextInt(100);

        int temp = 1;
        
        while (true)
        { 
                
            System.out.println("Enter Number: "); 
            int num = s.nextInt();
 

            if(genNum == num)
            {
                System.out.println("Correct Number! Total attempts: " + temp);
 

            }
            else if(num < genNum)
            {
                System.out.println("You entered a smaller number.");
            }
            else if(num > genNum)
            {
                System.out.println("You entered a greater number.");
            }
        temp++;

        }
    }
}



    
