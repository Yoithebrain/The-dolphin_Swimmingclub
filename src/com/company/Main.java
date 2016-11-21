package com.company;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        String data = "";

        FileWrite fileWrite = new FileWrite("test.txt");

        do {


            System.out.println("Skriv dine data");
            list.add(new String(scanner.));
            fileWrite.writeToFile(list);


        } while (!scanner.next().equalsIgnoreCase("q"));





    }
}
