package com.company;

public class Imag {
    double re, im, mod, arg;
    public static void sum(Imag a, Imag b, Imag c) { // сумма
        c.re = a.re + b.re;
        c.im = a.im + b.im;
    }
    public static void sub(Imag a, Imag b, Imag c) { // разность
        c.re = a.re - b.re;
        c.im = a.im - b.im;
    }
    public static void mul(Imag a, Imag b, Imag c) { // произведение
        c.re = a.re * b.re - a.im * b.im;
        c.im = a.im * b.re + a.re * b.im;
    }
    public static void sopr(Imag a, Imag b) { // комплексно сопряжённое
        b.re = a.re;
        b.im = a.im;
        if (b.im != 0) {
            b.im *= -1;
        }
    }
    public static void div(Imag a, Imag b, Imag d) { // деление
        Imag c = new Imag();
        Imag e = new Imag();
        Imag.sopr(b,c);
        Imag.mul(a,c,d);
        Imag.mul(b,c,e);
        System.out.print("(");
        Imag.print(d);
        System.out.print(")/" + e.re);
        d.re /= e.re;
        d.im /= e.re;
    }
    public static void mod(Imag a) { // модуль числа (в разработке)
        a.mod = Math.sqrt(a.re * a.re + a.im * a.im);
    }
    public static void arg(Imag a){ // аргумент числа
        if (a.re != 0) {
            a.arg = Math.atan(a.im / a.re);
        }
        else if (a.im < 0) {
            a.arg = Math.PI / -2;
        }
        else {
            a.arg = Math.PI / 2;
        }
        if (a.re < 0 & a.im < 0){
            a.arg -= Math.PI;
        }
        if (a.re < 0 & a.im > 0){
            a.arg += Math.PI;
        }
        if (a.re < 0 & a.im == 0){
            a.arg = Math.PI;
        }
    }
    public static void print(Imag a){ // печать комплексного числа
        if (a.re != 0){
            System.out.printf("%.3f",a.re);
        }
        if (a.im > 0 && a.re != 0){
            System.out.print("+");
        }
        if (a.im != 0){
            System.out.printf("%.3f",a.im);
            System.out.print("i");
        }
        if (a.im == 0 && a.re == 0){
            System.out.print("0");
        }
    }
}
