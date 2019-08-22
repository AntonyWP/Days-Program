/*********************************************************************
 *                                                                   *
 *  CSCI 470               Assignment 3           Fall 2018          *
 *                                                                   *
 *  Developer(s):   Antony Pierson                                   *
 *                                                                   *
 *  Section:        1                                                *
 *                                                                   *
 *  Due Date/Time:  9/21/18 11:59p.m.                                *
 *                                                                   *
 *  Purpose:        A java program for a class called Date that a    *
 *                  person might use to calculate days since Jan 1   *
 ********************************************************************/

import java.util.Scanner;                                // import the Scanner class to read input data

public class DateDemo
{
  public static void main(String[] args)
  {
    int month;                                            // used to hold month
    int day;                                              // used to hole day
    int year;                                             // used to hold year
    int result;                                           // used to hold total days
    
    Scanner keyScan = new Scanner(System.in);            // scanner to gets keyboard input from user.
    Date2 myDate2 = new Date2(0, 0, 0);                     // initialize scanner object
    
    System.out.print("Enter month: ");                   // print statment to prompt user input
    month = keyScan.nextInt();                           // Use method nextInt to read an input month
    myDate2.setMonth(month);                              // set month
    
    System.out.print("Enter day: ");                     // print statment to prompt user input
    day = keyScan.nextInt();                             // Use method nextInt to read an input day
    myDate2.setDay(day);                                  // set day
    
    System.out.print("Enter year: ");                    // print statment to prompt user input
    year = keyScan.nextInt();                            // Use method nextInt to read an input year
    myDate2.setYear(year);                                // set year
    
    result = myDate2.daysSinceJan1();                     // call method that calculates days and store it in result
    
     System.out.printf("\nThe Total days since %d/%d/%d is %d  ", month, day, year, result);
     
    keyScan.close();                                     // close the scanner
  }
} 