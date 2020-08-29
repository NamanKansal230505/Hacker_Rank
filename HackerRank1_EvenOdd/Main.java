package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);      // QUESTION IN README
        System.out.println("ENTER ANY INTEGER : ");  // TAKING INPUT FROM USER
        int N = scanner.nextInt();
        int n = N%2 ;                                // DIVIDING INPUT BY 2 AS A PRE-MEASURE (BECAUSE NUMBER DIVISIBLE BY 2 i.e.IT LEAVES THE REMAINDER 0 IS EVEN)
        if (n != 0){                                 // IF n i.e. THE REMAINDER WHEN DIVIDED BY 2 IS NOT EQUAL TO 0 THAN IT IS ODD
            System.out.println("Weird");
        }else if ((n==0)&&(N>1&&N<6)){            // REAMINDER EQUAL TO 0 AND N GREATER 1 AND LESS THAN 6
            System.out.println("Not Weird");
        }else if((n==0)&&(N>5&&N<21)){               // REAMINDER EQUAL TO 0 AND N GREATER 5 AND LESS THAN 21
            System.out.println("Weird");
        }else if ((n==0)&&(N>20)){                    // REAMINDER EQUAL TO 0 AND N GREATER 20
            System.out.println("Not Weird");
        }else{
            System.out.println("Invalid Entry");       // IF INPUT DOESN'T SATISFY ANY CONDITION THAN PRINT INVALID ENTRY
        }
    }
}
