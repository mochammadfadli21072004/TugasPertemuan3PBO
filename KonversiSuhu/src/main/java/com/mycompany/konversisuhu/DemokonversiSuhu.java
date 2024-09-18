/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.konversisuhu;

/**
 *
 * @author Mochammad Fadli
 */
public class DemokonversiSuhu {

  
    public static void main(String[] args) {
        KonversiSuhu konversiSuhu = new KonversiSuhu();
        KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();

        double suhuCelcius = 37.0;

        double suhuFahrenheit = konversiSuhu.celciusToFahrenheit(suhuCelcius);
        double suhuReamur = konversiSuhu.celciusToReamur(suhuCelcius);

        System.out.println(suhuCelcius + " derajat Celcius = " + suhuFahrenheit + " derajat Fahrenheit");
        System.out.println(suhuCelcius + " derajat Celcius = " + suhuReamur + " derajat Reamur");


        suhuFahrenheit = 98.6; 
        suhuReamur = konversiSuhu2.fahrenheitToReamur(suhuFahrenheit);

        System.out.println(suhuFahrenheit + " derajat Fahrenheit = " + suhuReamur + " derajat Reamur");

    }
    
}
