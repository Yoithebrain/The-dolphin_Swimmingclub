package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Wanna play quiz or randomNumbers? q for quiz ");
        Scanner s = new Scanner(System.in);

        if(s.nextLine().equalsIgnoreCase("q")) {

            System.out.println("Okay, here it comes!");
            System.out.println();
            theQuiz();

        }
        else {
            randomNumber();
        }

    }
    public static void theQuiz(){

        int counter = 0;

        System.out.println("Q1) Whats the capital of Alaska?");

        System.out.println("    1) Melbourne");
        System.out.println("    2) Anchorage");
        System.out.println("    3) Juneau");

        Scanner s = new Scanner(System.in);

        if(s.nextInt() == 3) {
            System.out.println("That's right!");
            counter++;
        }
        else
            System.out.println("Sorry that's wrong. The capital of Alaska is Juneau");

        System.out.println();
        System.out.println("Q2) Can you store the value 'cat' in a variable of type int?");

        System.out.println("    1) yes");
        System.out.println("    2) no");

        if(s.nextInt() == 2) {
            System.out.println("That's right!");
            counter++;
        }
        else
            System.out.println("Sorry, 'cat' is a string.");

        System.out.println();
        System.out.println("Q3) What is the result of 9+6/3?");

        System.out.println("    1) 5");
        System.out.println("    2) 11");
        System.out.println("    3) 15/3");

        if(s.nextInt() == 2) {
            System.out.println("That's right");
            counter++;
        }
        else
            System.out.println("Sorry, the correct answer is 11");


        System.out.println("Overall, you got " + counter + " out of 3 correct");
        System.out.println("Thanks for playing");
    }

    public static void randomNumber() {

        int numberOfSides = 100;
        Dice dice = new Dice(numberOfSides);

        int numberRoll = dice.rollDice();

int numberGuess =0;
int numberOfTries = 0;
        System.out.println("write a number between 1-" + numberOfSides + " you have 7 tries");
        while (numberGuess != numberRoll) {


            Scanner s = new Scanner(System.in);
            numberGuess = s.nextInt();

            System.out.println("Guess number #" + (numberOfTries+1) + ": " + numberGuess);


            if (numberGuess == numberRoll) {
                System.out.println("That's right!! what are the odds");
            }
            else {

                if(numberGuess < numberRoll) {
                    System.out.println("Sorry. That number is too low");
                }
                else
                    System.out.println("Sorry. That number is too high");


                numberOfTries++;
            }

                if(numberOfTries == 7) {

                    System.out.println("Sorry you didn't guess it in 7 tries, you lose.");
                    break;
                }
            }
        }
    }


