/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How many people?");
        Scanner input = new Scanner(System.in);
        int people = input.nextInt();

        System.out.println("How many pizzas do you have?");
        Scanner input2 = new Scanner(System.in);
        int pizzas = input2.nextInt();

        System.out.println("How many slices per pizza?");
        Scanner input3 = new Scanner(System.in);
        int slices = input3.nextInt();

        int totalSlices =  pizzas*slices;
        int slicePerPerson = totalSlices/people;
        int slicesUsed = slicePerPerson*people;
        int leftover = totalSlices - slicesUsed;

        System.out.println(people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)");

        System.out.println("Each person gets " + slicePerPerson + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces.");
    }
}