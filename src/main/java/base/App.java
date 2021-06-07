/*
 *  UCF COP3330 Summer 2021 Assignment 18 Solution
 *  Copyright 2021 Paul Shannon
 */
package base;

import java.util.Locale;
import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //instances
        App myApp = new App();
        Converter temperature = new Converter();

        //input
        myApp.input(temperature);

        //calculate correct convert
        myApp.convert(temperature);

        //output
        myApp.output(temperature);
    }
    public void input(Converter converter)
    {
        //type
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        converter.setType(input.next().toUpperCase(Locale.ROOT));//make uppercase to allow for both uppercase and lowercase input

        //initial temp
        System.out.print("Please enter the temperature in " + converter.getType() +": ");
        converter.setInitialTemp(input.nextInt());//will print out original type to reduce output
    }

    public void convert(Converter converter)
    {
        if(converter.getType().equals("Fahrenheit"))
            converter.convert_FtoC();
        else
            converter.convert_CtoF();
    }

    public void output(Converter converter) {
        StringBuilder b = new StringBuilder();

        if (converter.type.equals("C"))
        {
            b.append("The temperature in Celsius is " + converter.finalTemp);
            System.out.println(b);
        }
        else
        {
            b.append("The temperature in Fahrenheit is " + converter.finalTemp);
            System.out.println(b);
        }
    }
}

