package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ImagPatterns {
    static Scanner in = new Scanner(System.in);
    static String Sum = ".+[+]+.+";
    static String Sub = ".+[-]+.+";
    static String Mul = ".+[*]+.+";
    static String Div = ".+[:]+.+";
    static String Rad = ".+[r]+.+";
    static String Exp = ".+[e]+.+";
    static boolean sumBoo;
    static boolean subBoo;
    static boolean mulBoo;
    static boolean divBoo;
    static boolean radBoo;
    static boolean expBoo;
    String sym;
    public static void patterns() {
        String symbol = in.nextLine();
        Pattern SumPattern = Pattern.compile(Sum);
        Pattern SubPattern = Pattern.compile(Sub);
        Pattern MulPattern = Pattern.compile(Mul);
        Pattern DivPattern = Pattern.compile(Div);
        Pattern RadPattern = Pattern.compile(Rad);
        Pattern ExpPattern = Pattern.compile(Exp);
        Matcher SumMatcher = SumPattern.matcher(symbol);
        Matcher SubMatcher = SubPattern.matcher(symbol);
        Matcher MulMatcher = MulPattern.matcher(symbol);
        Matcher DivMatcher = DivPattern.matcher(symbol);
        Matcher RadMatcher = RadPattern.matcher(symbol);
        Matcher ExpMatcher = ExpPattern.matcher(symbol);
        ImagPatterns.sumBoo = SumMatcher.matches();
        ImagPatterns.subBoo = SubMatcher.matches();
        ImagPatterns.mulBoo = MulMatcher.matches();
        ImagPatterns.divBoo = DivMatcher.matches();
        ImagPatterns.radBoo = RadMatcher.matches();
        ImagPatterns.expBoo = ExpMatcher.matches();
    }
}
