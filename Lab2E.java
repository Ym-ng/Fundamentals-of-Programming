/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;

/**
 *
 * @author wif190041
 */
public class Lab2E {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(10001) ;
        System.out.println(a);
        int sum=0;
        while (a>0){
           sum = sum+ a%10;
           a=a/10;
           
        }
        System.out.println(sum);
    }
}
