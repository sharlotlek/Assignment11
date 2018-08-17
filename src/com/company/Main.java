package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
int Age;
String name;
        Scanner input = new Scanner(System. in);
        System.out.print("Enter your name");
        name=input.next();
        Calendar time = Calendar.getInstance();
        int hour = time.get(Calendar.HOUR_OF_DAY);

        if (hour < 12)
        {
            System.out.println("Good Morning "+ name);
        }

        else if (hour < 17 && !(hour == 12)) {
            System.out.println("Good Afternoon " + name);
        }

        System.out.print("Please enter your age");
        Age=input.nextInt();

        Random rand = new Random();
        int AppAge=rand.nextInt(90)+18;

      if(AppAge> Age)
      {
          int diff=AppAge-Age;
          System.out.println("I am "+ diff+" years Older than you");
      }
      else if(AppAge<Age)//to avoid getting a negative age
      {
          int diff=Age-AppAge;
           System.out.println("I am "+ diff+" years Younger than you");
       }
       else
       {
        System.out.println("they are equal in age");
       }


        int twice=2*AppAge; //calculating twice my age
        System.out.println("Twice my Age would be "+ twice);

        if ( (AppAge % 2) == 0 ) {
            System.out.println("My age is an even number");
        }
        else
        {
            System.out.println("My age is an Odd number");
        }

        System.exit(-1);
    }


}