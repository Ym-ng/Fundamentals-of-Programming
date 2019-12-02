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
public class Lab2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds : ");
        int s = sc.nextInt();
        int second = s%3600%60 ;
        int minute = s%3600/60 ;
        int hour = s/3600 ;
        System.out.printf("%d hours %d minutes %d seconds",hour,minute,second);
       
    }
    
}
