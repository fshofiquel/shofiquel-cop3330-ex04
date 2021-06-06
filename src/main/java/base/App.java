/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */

package base;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner nounInput = new Scanner(System.in);
        Scanner verbInput = new Scanner(System.in);
        Scanner adjInput = new Scanner(System.in);
        Scanner adverbInput = new Scanner(System.in);
        String noun;
        String verb;
        String adj;
        String adverb;
        String output;
        String prompt = "Enter a ";
        String endA = "noun: ";
        String endB = "verb: ";
        String endC = "adjective: ";
        String endD = "adverb: ";

        System.out.print(prompt + endA);
        noun = nounInput.nextLine();

        System.out.print(prompt + endB);
        verb = verbInput.nextLine();

        System.out.print(prompt + endC);
        adj = adjInput.nextLine();

        System.out.print(prompt + endD);
        adverb = adverbInput.nextLine();

        output = "Do you %s your %s %s %s? That's hilarious!".formatted(verb, adj, noun, adverb);

        System.out.print(output);
    }
}
