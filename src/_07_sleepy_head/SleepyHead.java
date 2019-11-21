package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        int isWeekday, isVacation, isWeekend;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        isWeekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        System.out.println(isWeekday);
         isWeekend = JOptionPane.showConfirmDialog(null, "Is it a weekend?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         isVacation = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         System.out.println(isVacation);
         if(isWeekend == 0 || isVacation == 0)
         {
        	 System.out.println("Sleep in?");
         }
         if(isWeekday == 0)
         {
        	 System.out.println("Get up lazybones!");
         }
         if(isWeekday == 0 && isVacation == 0)
         {
        	 System.out.println("Sleep in?");
         }

        /*
         * Print sleep in? if it is a vacation or a weekend. If it's a weekday,
         * print get up lazybones! If it is a weekday, and we are on vacation,
         * print sleep in?
         */
    }
}
