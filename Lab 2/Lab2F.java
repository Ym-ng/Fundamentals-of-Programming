/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author wif190041
 */
public class Lab2F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of water : ");
        double g = sc.nextDouble() ;
        double M = g/1000 ;
        System.out.println("Enter the initial temperature in Fahrenheit : ");
        double i = (sc.nextDouble()-32)/1.8;
        System.out.println("Enter the final temperature in Fahrenheit :");
        double f = (sc.nextDouble()-32)/1.8;
        double Q = M*(f-i)*4184 ;
        System.out.printf("Energy needed to heat water is %e ",Q);
        double a =1234.5;
        System.out.printf("%e", a);
        
    }
    
}
