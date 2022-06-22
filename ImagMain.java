package com.company;

import java.util.Scanner;

abstract class ImagMain extends ImagPatterns {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Imag a1 = new Imag();
        Imag a2 = new Imag();
        Imag a3 = new Imag();
        Imag a4 = new Imag();
        System.out.println();
        System.out.println("Введите первое комплексное число");
        a1.re = in.nextDouble();
        a1.im = in.nextDouble();
        Imag.print(a1);
        System.out.println();
        System.out.println("Введите второе комплексное число (если не нужно, введите два нуля)");
        a2.re = in.nextDouble();
        a2.im = in.nextDouble();
        Imag.print(a2);
        System.out.println();
        System.out.println();
        System.out.println("Введите требуемые действия через кавычки");
        ImagPatterns.patterns();
        System.out.println();
        if (ImagPatterns.sumBoo) {
            System.out.println();
            System.out.print("sum = ");
            Imag.sum(a1,a2,a3);
            Imag.print(a3);
            System.out.println();
        }
        if (ImagPatterns.subBoo) {
            System.out.println();
            System.out.print("sub = ");
            Imag.sub(a1,a2,a3);
            Imag.print(a3);
            System.out.println();
        }
        if (ImagPatterns.mulBoo) {
            System.out.println();
            System.out.print("mul = ");
            Imag.mul(a1,a2,a3);
            Imag.print(a3);
            System.out.println();
        }
        if (ImagPatterns.divBoo) {
            System.out.println();
            System.out.print("sopr1 = ");
            Imag.sopr(a1,a4);
            Imag.print(a4);
            System.out.println();
            if (a2.re != 0 && a2.im != 0) {
                System.out.print("div = ");
                Imag.div(a1, a2, a3);
            }
            else {
                System.out.println("Вы пытались поделить на нуль,\nхотя, возможно, этого и не желали.\nВы самое слабое звено, прощайте");
            }
            System.out.println();
        }
        if (ImagPatterns.radBoo) {
            System.out.println();
            Imag.mod(a1);
            System.out.print("r = ");
            System.out.printf("%.3f",a1.mod);
            System.out.println();
        }
        if (ImagPatterns.expBoo) {
            System.out.println();
            Imag.mod(a1);
            Imag.arg(a1);
            Imag.print(a1);
            System.out.print(" = ");
            System.out.printf("%.3f",a1.mod);
            System.out.print("*(cos ");
            System.out.printf("%.3f",a1.arg);
            System.out.print(" + i*sin ");
            System.out.printf("%.3f",a1.arg);
            System.out.print(")");
            System.out.print(" = e^(");
            System.out.printf("%.3f",a1.arg);
            System.out.println("*i)");
        }
    }
}
