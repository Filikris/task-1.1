package ua.pp.kris.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter four digit number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int sum = 0;
            while(num !=0) {
                sum += num % 10;
                num/=10;
            }

        System.out.print("The sum four digit number is: " + sum);


    }
}
