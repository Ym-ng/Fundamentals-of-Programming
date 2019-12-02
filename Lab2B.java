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
public class Lab2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The price of the car : ");
        double P = sc.nextDouble();
        System.out.print("Down payment : ");
        double D = sc.nextDouble();
        System.out.print("Interest rate in % : ");
        double R = sc.nextDouble();
        System.out.print("Loan duration in year : ");
        double Y = sc.nextDouble();
        double M = (P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("The monthly payment is %.2f", M);
                
        
    }
}
