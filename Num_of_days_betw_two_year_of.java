import java.util.Scanner;
public class Num_of_days_betw_two_year_of{
 public static void main(String[] args) {
   System.out.println("Input start year:");

   Scanner s = new Scanner();

   int fy = s.nextInt();

   System.out.println("\nInput end year:");
   s = new Scanner();

   int ly = s.nextInt();

   if (ly > fy) {
     for (int i = fy; i <= ly; i++) {
       System.out.println("Year: " + i + " = " + number_of_days(i));
     }
   } else {
     System.out.println("End year must be greater than first year!");
   }
 }
 public static int number_of_days(int year) {
   if (is_Leap_Year(year)) return 366;
   else return 365;
 }
 public static boolean is_Leap_Year(int year) {
   return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
 }
}
