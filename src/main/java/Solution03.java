import java.util.Scanner;

public class Solution03 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 1 Solution 03
     *  Copyright 2021 Ross Springstead
     */
    /*
        prompt the user to give a quote
        assign the input to a string called quote
        prompt the user to give the author of the quote
        assign the input to a string called author
        create a print statement that prints both variable
     */



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please give me a quote\n");
        String quote = input.nextLine();
        System.out.printf("Who said that quote?\n");
        String name = input.nextLine();
        System.out.println(name + " once said " + '"' + quote + '"');

    }
}
