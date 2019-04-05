package org.fasttrackit;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Calculation calculation = new Calculation ();
        Scanner scanner = new Scanner (System.in);
        int numberOneInteger;
        int numberTwoInteger;
        int numberThreeInteger;
        int resultInteger;
        double numberOneDecimal;
        double numberTwoDecimal;
        double resultDecimal;
        double numberOneRationalNumber;
        long numberOneLong;
/*
        System.out.println ("Enter the numbers to which you want to calculate the amount for integers");
        numberOneInteger=scanner.nextInt();
        numberTwoInteger=scanner.nextInt();
        resultInteger=calculation.amount(numberOneInteger,numberTwoInteger);
        System.out.println("The result of amount for integers is "+resultInteger);

        System.out.println("Enter the numbers to which you want to calculate the amount for decimals");
        numberOneDecimal = scanner.nextDouble();
        numberTwoDecimal=scanner.nextDouble();
        resultDecimal=calculation.amount(numberOneDecimal,numberTwoDecimal);
        System.out.println("The result of amount for decimals is "+resultDecimal);

        System.out.println("Enter the numbers to which you want to calculate the difference for integers");
        numberOneInteger=scanner.nextInt();
        numberTwoInteger=scanner.nextInt();
        resultInteger= calculation.down(numberOneInteger,numberTwoInteger);
        System.out.println("The result of difference for integers is "+resultInteger);

        System.out.println("Enter the numbers to which you want to calculate the difference for decimals");
        numberOneDecimal=scanner.nextDouble();
        numberTwoDecimal=scanner.nextDouble();
        resultDecimal=calculation.down(numberOneDecimal,numberTwoDecimal);
        System.out.println("The result of difference for decimals is "+resultDecimal);

        System.out.println("Enter the numbers to which you want to calculate the product for integers");
        numberOneInteger=scanner.nextInt();
        numberTwoInteger=scanner.nextInt();
        resultInteger= calculation.multiplication(numberOneInteger,numberTwoInteger);
        System.out.println("The result of product for integers is "+resultInteger);

        System.out.println("Enter the numbers to which you want to calculate the product for decimals");
        numberOneDecimal=scanner.nextDouble();
        numberTwoDecimal=scanner.nextDouble();
        resultDecimal=calculation.multiplication(numberOneDecimal,numberTwoDecimal);
        System.out.println("The result of product for decimals is "+resultDecimal);

        System.out.println("Enter the numbers to which you want to calculate the report for integers");
        numberOneInteger=scanner.nextInt();
        numberTwoInteger=scanner.nextInt();
        if(numberTwoInteger!=0)
        {
            resultInteger=calculation.demultiplication(numberOneInteger,numberTwoInteger);
            System.out.println("The result of report for integers is "+resultInteger);
        }
        else
        {
            System.out.println ("The result is infinite");
        }

        System.out.println("Enter the numbers to which you want to calculate the report for decimals");
        numberOneDecimal=scanner.nextDouble();
        numberTwoDecimal=scanner.nextDouble();
        if(numberTwoDecimal!=0) {
            resultDecimal = calculation.demultiplication (numberOneDecimal, numberTwoDecimal);
            System.out.println ("The result of report for decimals is " + resultDecimal);
        }
        else
        {
            System.out.println ("The result is infinite");
        }

        System.out.println("Enter the base for power");
        numberOneInteger=scanner.nextInt();
        System.out.println ("Enter the exponent for power");
        numberTwoInteger=scanner.nextInt();
        int power=0;
        if(numberOneInteger!=0 || numberTwoInteger!=0)
        {
            power=calculation.power(numberOneInteger,numberTwoInteger);
            System.out.println("The result of power is "+power);
        }
        else
        {
            System.out.println ("The result does not make sense");
        }
        System.out.println("Enter the number for which you want to calculate the number of digits");
        numberOneInteger= scanner.nextInt();
        int numberDigit=calculation.numberOfDigit(numberOneInteger);
        System.out.println("The number of digits from number is "+numberDigit);

        System.out.println("Enter the number to which you want to know if it is prime or not");
        numberOneInteger=scanner.nextInt();
        String prime=calculation.primeNumber(numberOneInteger);
        System.out.println("The number "+prime);

        System.out.println("Enter the number at which you want to know the mirror value");
        numberOneInteger=scanner.nextInt();
        int mirrorNumber=calculation.mirrorNumber(numberOneInteger);
        System.out.println("The mirror number for "+numberOneInteger+" is "+mirrorNumber);

        System.out.println("Enter the number at which you want to know if it is palindrom or not");
        numberOneInteger=scanner.nextInt();
        String palindromNumber=calculation.palindromNumber(numberOneInteger);
        System.out.println("The number "+numberOneInteger+" "+palindromNumber);

        System.out.println ("Enter the number at which you want to process the digits ");
        numberOneInteger = scanner.nextInt ();
        calculation.processDigit (numberOneInteger);

        System.out.println ("Enter the numbers for which you want to calculate the largest common divisor");
        numberOneInteger = scanner.nextInt ();
        numberTwoInteger = scanner.nextInt ();
        int largestCommonDivisor;
        if (numberOneInteger > numberTwoInteger)
            largestCommonDivisor = calculation.largestCommonDivisor (numberOneInteger, numberTwoInteger);
        else largestCommonDivisor = calculation.largestCommonDivisor (numberTwoInteger, numberOneInteger);
        System.out.println ("The largest common divisor is " + largestCommonDivisor);

        System.out.println ("Enter the number for viewing the partial results at decomposing in primes factors");
        numberOneInteger = scanner.nextInt ();
        calculation.partialResultsDecomposingPrimesFactors (numberOneInteger);

        System.out.println ("Enter a number for decomposing in prime factors");
        numberOneInteger = scanner.nextInt ();
        calculation.decomposingPrimeFactor (numberOneInteger);

        System.out.println("Enter a day according to format(day,month,year)");
        System.out.println ("Enter the day");
        numberOneInteger=scanner.nextInt ();
        System.out.println ("Enter the number from month");
        numberTwoInteger=scanner.nextInt ();
        System.out.println ("Enter the year");
        numberThreeInteger=scanner.nextInt ();
        calculation.previousNextDay (numberOneInteger,numberTwoInteger,numberThreeInteger);

        /*******************************************************************************/

        /*square root for whole number*/

        /*do {
            System.out.println ("Enter the number for which you want to calculate square root for order 2");
            numberOneInteger = scanner.nextInt ();
        } while (numberOneInteger < 0);
        calculation.secondStageSquareRoot2Order (numberOneInteger);*/

        /*******************************************************************************/

        /*square root for rational number*/
        /*do {
            System.out.println ("Enter the rational number for which you want to calculate square root for order 2");
            numberOneRationalNumber = scanner.nextDouble ();
        } while (numberOneRationalNumber < 0);
        calculation.squareRoot2Order (numberOneRationalNumber);*/

        /*******************************************************************************/

        do{
            System.out.println("Enter the number for who you want to know its shape");
            numberOneLong=scanner.nextLong();
        }while(numberOneLong<10);
        calculation.shapeNumber(numberOneLong);
    }
}