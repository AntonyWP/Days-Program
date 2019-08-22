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

public class Date2
{
  private int month;
  private int day;
  private int year;
  
  // Constructor that initializes the three instance variables
  public Date2(int newMonth, int newDay, int newYear)
  {
    month = newMonth;
    day = newDay;
    year = newYear;
  }
  
   // month set method
  public void setMonth(int newMonth)
  {
   month = newMonth;
  }
  
  // month get method
  public int getMonth()
  {
    return month;
  }
  
  // day set method
  public void setDay(int newDay)
  {
   day = newDay;
  }
  
  // day get method
  public int getDay()
  {
    return day;
  }
  
  // year set method
     public void setYear(int newYear)
   {
      year = newYear;
   }
 
  // monthly salary get method
  public int getYear()
  {
    return year;
  }
  
  // determine leap year method
  public boolean isLeapYear(int year)
  {
    if (year % 100 == 0)
    {
       if(year % 400 == 0)
         return true;
    }    
    else if (year % 4 == 0)    
        return true;
        return false;
  }     
  
  //get days in each month method
  public int getDaysInMonth(int newMonth)
  {
    if (newMonth == 1 || newMonth == 3 || newMonth == 5 || newMonth == 7 || newMonth == 8 || newMonth == 10 ||
        newMonth == 12) { 
      return 31;
    }
    
    if (newMonth == 4 || newMonth == 6 || newMonth == 9 || newMonth == 11)
      return 30; 
    
    if (newMonth == 2)
      if(isLeapYear(year))
        return 29;
        return 28;
  }   
  
  // method to calculate days since Jan 1
  public int daysSinceJan1() 
  {
    int m = 0;
    int i;
    
    for(i=1;i<month;i++)
    {
    m += getDaysInMonth(i);
    }
    
    m += day;
    return m;
  }
}
 