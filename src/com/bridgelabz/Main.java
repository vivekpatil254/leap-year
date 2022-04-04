package com.bridgelabz;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int year, length;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        length = String.valueOf(year).length();
        if (length != 4)
            System.out.println("Year Should be 4 digit number");
        else {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
                System.out.println("The '" + year + "'  is a leap year");
            else
                System.out.println("The '" + year + "'  is not a leap year");

        }
    }
}
