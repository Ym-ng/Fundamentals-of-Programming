/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wif190041
 */
public class Lab2C {
    public static void main(String[] args) {
        Random r = new Random();
        int a = 10+r.nextInt(41) ;
        int b = 10+r.nextInt(41) ;
        int c = 10+r.nextInt(41) ;
        System.out.println("Three numbers generated : " + a +","+ b +","+ c);
        int sum=a+b+c ;
        System.out.println("sum of the numbers : "+sum);
        double average = (a+b+c)/3 ;
        System.out.printf("average in two decimal places : %.2f", average);
    }
}
