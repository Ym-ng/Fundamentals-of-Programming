/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconvertor;

import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class worldcurrencyconverter {
        public static void main(String[] args) {
        int BHD = 0, KHR = 0, IDR = 0, LAK = 0, MMK = 0,
            PHP = 0, SGD = 0, THB = 0, USD = 0, VND = 0, 
            ARS = 0, AUD = 0, BWP = 0, BRL = 0, 
            GBP = 0, BGN = 0, CAD = 0, CLP = 0, CNY = 0,
            COP = 0, HRK = 0, CZK = 0, DKK = 0, AER = 0,
            EUR = 0, HKD = 0, HUF = 0, INR = 0, ICS = 0, 
            JPY = 0, KZT = 0, KWD = 0, LYD = 0, MUR = 0, 
            MXN = 0, NPR = 0, NZD = 0, NOK = 0, OMR = 0, 
            PKR = 0, PLN = 0, QAR = 0, RON = 0, RUB = 0,
            SAR = 0, ZAR = 0, KRW = 0, LKR = 0, SEK = 0,
            CHF = 0, TTD = 0, TWD = 0, TRY = 0, VEB = 0, MYR= 0;

        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type of money: ");
        String type = sc.next();
        System.out.print("Enter the value of money: ");
        double amount = sc.nextDouble();
        System.out.print("Enter return type of money: ");
        String output = sc.next();
        switch (type) { //CHANGE TO MYR FIRST
            case "BND":
                amount = amount * 0.32;
                break;
            case "KHR":
                amount = amount * 972.97;
                break;
            case "IDR":
                amount = amount * 3378.947;
                break;
            case "LAK":
                amount = amount * 2124.06;
                break;
            case "MMK":
                amount = amount * 361.74;
                break;
            case "PHP":
                amount = amount * 12.18;
                break;
            case "SGD":
                amount = amount * 0.33;
                break;
            case "THB":
                amount = amount * 7.25;
                break;
            case "USD":
                amount = amount * 0.24;
                break;
            case "VND":
                amount = amount * 5561.59;
                break;
            case "ARS":
                amount = amount * 14.35;
                break;
            case "AUD":
                amount = amount * 0.354;
                break;
            case "BHD":
                amount = amount * 0.090;
                break;
            case "BWP":
                amount = amount * 2.61;
                break;
            case "BRL":
                amount = amount * 1.02;
                break;
            case "GBP":
                amount = amount * 0.19;
                break;
            case "BGN":
                amount = amount * 0.43;
                break;
            case "CAD":
                amount = amount * 0.32;
                break;
            case "CLP":
                amount = amount * 196.31;
                break;
            case "CNY":
                amount = amount * 1.68;
                break;
            case "COP":
                amount = amount * 840.04;
                break;
            case "HRK":
                amount = amount * 1.62;
                break;
            case "CZK":
                amount = amount * 5.56;
                break;
            case "DKK":
               amount = amount * 1.62;
               break;
            case "AER":
                amount = amount * 0.88;
                break;
            case "EUR":
                amount = amount * 0.21;
                break;
            case "HKD":
                amount = amount * 1.87;
                break;
            case "HUF":
                amount = amount * 73.18;
                break;
            case "ISK":
                amount = amount * 29.37;
                break;
            case "INR":
                amount = amount * 17.16;
                break;
            case "IRR":
                amount = amount * 10037.89;
                break;
            case "ILS":
                amount = amount * 0.83;
                break;
            case "JPY":
                amount = amount * 26.22;
                break;
            case "KZT":
                amount = amount * 92.62;
                break;
            case "KWD":
                amount = amount * 0.07;
                break;
            case "LYD":
                amount = amount * 0.33;
                break;
            case "MUR":
                amount = amount * 8.78;
                break;
            case "MXN":
                amount = amount * 4.69;
                break;
            case "NPR":
                amount = amount * 27.59;
                break;
            case "NZD":
                amount = amount * 0.37;
                break;
            case "NOK":
                amount = amount * 2.20;
                break;
            case "OMR":
                amount = amount * 0.09;
                break;
            case "PKR":
                amount = amount * 37.21;
                break;
            case "PLN":
                amount = amount * 0.94;
                break;
            case "QAR":
                amount = amount * 0.87;
                break;
            case "RON":
                amount = amount * 1.04;
                break;
            case "RUB":
                amount = amount * 15.36;
                break;
            case "SAR":
                amount = amount * 0.89;
                break;
            case "ZAR":
                amount = amount * 3.53;
                break;
            case "KRW":
                amount = amount * 282.56;
                break;
            case "LKR":
                amount = amount * 43.3;
                break;
            case "SEK":
                amount = amount * 2.29;
                break;
            case "CHF":
                amount = amount * 0.23;
                break;
            case "TTD":
                amount = amount * 1.61;
                break;
            case "TWD":
                amount = amount * 7.30;
                break;
            case "TRY":
                amount = amount * 1.38;
                break;
            case "VEB":
                amount = amount * 2.39;
                break;
             case "MYR":
                amount = amount;
                break;
        }
        System.out.println("The value of money in "+output+" is "+convertor(amount,output));

    }

    public static double convertor(double amount, String output) {
        switch (output) { //CHANGE TO output type
            case "BND":
                amount = amount * 3.055;
                break;
            case "KHR":
                amount = amount * 0.0010;
                break;
            case "IDR":
                amount = amount * 0.00029;
                break;
            case "LAK":
                amount = amount * 0.00047;
                break;
            case "MMK":
                amount = amount * 0.0028;
                break;
            case "PHP":
                amount = amount * 0.082;
                break;
            case "SGD":
                amount = amount * 3.05;
                break;
            case "THB":
                amount = amount * 0.13;
                break;
            case "USD":
                amount = amount * 4.17;
                break;
            case "VND":
                amount = amount * 0.00018;
                break;
            case "ARS":
                amount = amount * 0.069;
                break;
            case "AUD":
                amount = amount * 2.82;
                break;
            case "BHD":
                amount = amount * 11.09;
                break;
            case "BWP":
                amount = amount * 0.38;
                break;
            case "BRL":
                amount = amount * 0.97;
                break;
            case "GBP":
                amount = amount * 5.39;
                break;
            case "BGN":
                amount = amount * 2.34;
                break;
            case "CAD":
                amount = amount * 3.13;
                break;
            case "CLP":
                amount = amount * 0.005;
                break;
            case "CNY":
                amount = amount * 0.59;
                break;
            case "COP":
                amount = amount * 0.0011;
                break;
            case "HRK":
                amount = amount * 0.61;
                break;
            case "CZK":
                amount = amount * 0.17;
                break;
            case "DKK":
                amount = amount * 0.61;
               break;
            case "AER":
                amount = amount * 1.13;
                break;
            case "EUR":
                amount = amount * 4.59;
                break;
            case "HKD":
                amount = amount * 0.533;
                break;
            case "HUF":
                amount = amount * 0.013;
                break;
            case "ISK":
                amount = amount * 0.034;
                break;
            case "INR":
                amount = amount * 0.058;
                break;
            case "IRR":
                amount = amount * 0.0001;
                break;
            case "ILS":
                amount = amount * 1.20;
                break;
            case "JPY":
                amount = amount * 0.038;
                break;
            case "KZT":
                amount = amount * 0.010;
                break;
            case "KWD":
                amount = amount * 13.72;
                break;
            case "LYD":
                amount = amount * 2.96;
                break;
            case "MUR":
                amount = amount * 0.11;
                break;
            case "MXN":
                amount = amount * 0.21;
                break;
            case "NPR":
                amount = amount * 0.036;
                break;
            case "NZD":
                amount = amount * 2.68;
                break;
            case "NOK":
                amount = amount * 0.45;
                break;
            case "OMR":
                amount = amount * 10.85;
                break;
            case "PKR":
                amount = amount * 0.026;
                break;
            case "PLN":
                amount = amount * 1.06;
                break;
            case "QAR":
                amount = amount * 1.14;
                break;
            case "RON":
                amount = amount * 0.96;
                break;
            case "RUB":
                amount = amount * 0.065;
                break;
            case "SAR":
                amount = amount * 1.112;
                break;
            case "ZAR":
                amount = amount * 0.28;
                break;
            case "KRW":
                amount = amount * 0.0035;
                break;
            case "LKR":
                amount = amount * 0.023;
                break;
            case "SEK":
                amount = amount * 0.43;
                break;
            case "CHF":
                amount = amount * 4.17;
                break;
            case "TWD":
                amount = amount * 0.61;
                break;
            case "TTD":
                amount = amount * 0.61;
                break;
            case "TRY":
                amount = amount * 0.72;
                break;
            case "VEB":
                amount = amount * 0.417;
                break;
            case "MYR":
                amount = amount ;
                break;
        }
        return amount;
    }

    
}
