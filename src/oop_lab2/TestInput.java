package oop_lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestInput {
    public TestInput() throws IOException {

        // BufferedReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("What is name? :");
        String name = reader.readLine();
        System.out.println("You name is " + name);

        System.out.println("How old ard you? :");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("you are " + age + "years old.");

        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What are you come forn :");
        String city = scanner.nextLine();
        System.out.println("you came form " + city);


    }//main
}//class
