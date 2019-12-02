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
public class Lab2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in degree Fahrenheit : ");
        double Fahrenheit = sc.nextDouble();
        double Celsius;
        Celsius = (Fahrenheit - 32)/1.8 ;
        System.out.printf("The temperature in degree Celcius is %.2f", Celsius);
        
        
    }
    
}
