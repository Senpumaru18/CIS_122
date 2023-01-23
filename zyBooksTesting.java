import java.util.Scanner;
public class zyBooksTesting {
	public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
		System.out.print("What hour is it: ");
      if (in.hasNextInt())
      {
         int hour = in.nextInt();
         if (hour >= 1 || hour <= 12)
         {
				System.out.print("Is it 'am' or 'pm': ");
            String suffix = in.next();
            if (suffix.equals("pm") || suffix.equals("am"))
            {
               /* Your code goes here */
               //Convert hour to military time
               if (suffix.equals("pm"))
               {
						if (hour < 12)
						{
							hour += 12;
						}
               }
					else if (suffix.equals("am") && hour == 12)
					{
						hour -= 12;
					}
               System.out.println("It's currently " + hour + ":00 in military time.");
            }
            else 
            {
               System.out.println("Error: The suffix must be am or pm.");
            }
         }
         else 
         {
            System.out.println("Error: The hour must be between 1 and 12.");
         } 
      }
      else
      {
         System.out.println("Error: Not an integer.");
      }
   }
}

