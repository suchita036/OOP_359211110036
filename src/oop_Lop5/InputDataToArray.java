package oop_Lop5;
//1.input Data from user
//2.find summation of data in array
//3.find average value of data in array
//4.find maximum  value of data in array
//5.find minimum  value of data in array

import java.util.Scanner;

public class InputDataToArray {
    private static final int MAX =10;

    public static void main (String[] args){
        int num[] = new int[MAX];
       num = inputData(num);
       ShowData(num);
       summation (num);


    }//main

    private static void summation(int[] num) {
        int total = 0;
        for (int i=0;i<num.length;i++){
            total += num[i];
        }
        System.out.println("\n The summation of "+
                 "value in array is: "+total);
        System.out.println("The average value "+
                  " in array is: "+total /MAX);
    }

    private static void ShowData(int[] num) {
        System.out.println("Data in array: ");
        for (int val: num)
            System.out.print(val+" ");
    }

    private static int[] inputData(int []num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese enter data to array: ");
        for (int i=0;i<num.length;i++){
            System.out.print("number["+i+"]:");
            num[i] = scanner.nextInt();

        }
        return num;
    }
}
