package org.fasttrackit;


import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

import java.util.Stack;


public class Calculation {

    private List<Integer> digits = new ArrayList<>();
    private List<String> numbersDivideingInitialNumber = new ArrayList<>();
    private List<Integer> knowingResult = new ArrayList<>();
    private Stack<Integer> stack = new Stack();
    private Stack<String> secondStack = new Stack();
    private Stack<Integer> thirdStack = new Stack();
    private int firstValue = 0;
    private int firstKnowingResult;
    private Stack<Character> stackRational = new Stack();
    private Stack<Long> shapeNumber = new Stack();

    int amount(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    double amount(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        return result;
    }

    double down(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        return result;
    }

    int down(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    double multiplication(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        return result;
    }

    int multiplication(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    double demultiplication(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return result;
    }

    int demultiplication(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    int power(int base, int exponent) {
        int i;
        int result = 1;
        for (i = 0; i < exponent; i++) {
            result = base * result;
        }
        return result;
    }

    int numberOfDigit(int number) {
        int nr, i = 0;
        if (number == 0) return 1;
        while (number != 0) {
            nr = number % 10;
            number = number / 10;
            i++;
        }
        return i;
    }

    String primeNumber(int number) {
        boolean state = true;
        int i;
        for (i = 2; i < 1 + number / 2; i++) {
            if (number % i == 0) state = false;
        }
        if (number == 1 || number == 0) return "is not prime";
        else if (state == true) return "is prime";
        else return "is not prime";
    }


    int mirrorNumber(int number) {
        int digit, mirror = 0;
        while (number != 0) {
            digit = number % 10;
            mirror = mirror * 10 + digit;
            number = number / 10;
       }return mirror;
    }


    String palindromNumber(int number) {
        int initialNumber = number;
        int mirrorNumber = mirrorNumber(number);
        if (initialNumber == mirrorNumber) return "is palindrom";
        else return "is not palindrom";
    }

    void processDigit(int number) {
        if (number < 0) number = number * (-1);
        int numberDigit = numberOfDigit(number);
        int i;
        int digit;
        System.out.println("The digits of number are ");
        for (i = numberDigit - 1; i > -1; i--) {
            digit = number / power(10, i);
            System.out.print(digit + " ");
            number = number % power(10, i);
        }
    }

    int largestCommonDivisor(int firstNumber, int secondNumber) {
        int rest;
        while (secondNumber != 0) {
            rest = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = rest;
        }
        return firstNumber;
    }

    void partialResultsDecomposingPrimesFactors(int number) {
        String checkPrime = primeNumber(number);
        int counter;
        int divisor;
        if (checkPrime.equals("is prime")) System.out.println("The partial results are " + number + " and 1");
        else {
            System.out.println("The partial results are");
            if (number == 1) System.out.println("1");
            else {
                divisor = 2;
                while (number != 1) {
                    while (number % divisor == 0) {
                        number = number / divisor;
                        System.out.print(number + " ");
                    }
                    divisor++;
                }
            }
        }
    }

    void decomposingPrimeFactor(int number) {
        String checkPrime = primeNumber(number);
        int divisor, counter;
        if (checkPrime.equals("is prime")) System.out.println("The primes factors are " + number + " and 1");
        else {
            divisor = 2;
            System.out.println("The primes factors are");
            if (number == 1) System.out.println("1");
            else {
                while (number > 1) {
                    counter = 0;
                    while (number % divisor == 0) {
                        counter++;
                       number = number / divisor;
                    }
                   if (counter > 0) System.out.println(divisor + "^" + counter);
                    divisor = divisor + 1;
                }
            }
        }
    }

    void previousNextDay(int day, int month, int year) {
        int countDay = 0;
        Scanner scanner = new Scanner(System.in);
        while (year < 1 || year > 100000) {
            System.out.println("The year must to be between 1 and 100000");
            year = scanner.nextInt();
        }
        while (month < 1 || month > 12) {
            System.out.println("The month must to be between 1 and 12");
            month = scanner.nextInt();
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
           countDay = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) countDay = 30;
        if (((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) && month == 2) countDay = 29;
        if ((year % 400 != 0 && (year % 4 != 0 || year % 100 == 0)) && month == 2) countDay = 28;

       while (day < 1 || day > countDay) {
            System.out.println("Enter a valid day for this month having in mind the year if the month is february");
            day = scanner.nextInt();
        }

       int d = day;
       int m = month;
       int y = year;

       if (day == 1 && month == 1) {
            year = year - 1;
            month = month + 11;
            day = day + 30;
           System.out.println("Previous day is " + day + "." + month + "." + year);
            day = day - 29;
            month = month - 11;
            year = year + 1;
            System.out.println("Next day is " + day + "." + month + "." + year);
           day = d;
            month = m;
            year = y;
        }

       if (day > 1 && day < countDay && (month == 1 || month == 2 || month == 3 || month == 4 || month == 5 || month == 6 || month == 7 || month == 8 || month == 9 || month == 10 || month == 11 || month == 12)) {
            day = day - 1;
           System.out.println("The previous day is " + day + "." + month + "." + year);
            day = day + 2;
            System.out.println("Next day is " + day + "." + month + "." + year);
            day = d;
            month = m;
        }
        if (day == countDay && (month == 1 || month == 3)) {
            day = day - 1;
            System.out.println("Previous day is " + day + "." + month + "." + year);
            day = day - 29;
            month = month + 1;
            System.out.println("Next day is " + day + "." + month + "." + year);
            day = d;
            month = m;
        }

       if (day == 1 && month == 2) {
            month = month - 1;
            day = 31;
            System.out.println("Previous day is " + day + "." + month + "." + year);
            month = month + 1;
            day = day - 29;
            System.out.println("Next day is " + day + "." + month + "." + year);
        }

       if (day == countDay && month == 2) {
            day = day - 1;
            System.out.println("Previous day is " + day + "." + month + "." + year);
            day = 1;
            month = month + 1;
            System.out.println("Next day is " + day + "." + month + "." + year);
            day = d;
            month = m;
        }

       if (day == 1 && month == 3) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                day = 29;
                month = month - 1;
                System.out.println("The previous day is " + day + "." + month + "." + year);
                day = day - 27;
                month = month + 1;
                System.out.println("Next day is " + day + "." + month + "." + year);
            }

           if ((year % 400 != 0 && (year % 4 != 0 || year % 100 == 0))) {
                day = 28;
                month = month - 1;
               System.out.println("The previous day is " + day + "." + month + "." + year);
                day = day - 26;
                month = month + 1;
                System.out.println("Next day is " + day + "." + month + "." + year);
            }
        }

       if (day == 1 && (month == 4 || month == 6 || month == 8 || month == 9 || month == 11)) {
            day = 31;
            month = month - 1;
            System.out.println("The previous day is " + day + "." + month + "." + year);
            day = day - 29;
            month = month + 1;
            System.out.println("Next day is " + day + "." + month + "." + year);
        }

       if (day == countDay && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day = day - 1;
            System.out.println("The previous day is " + day + "." + month + "." + year);
            day = day - 28;
            month = month + 1;
            System.out.println("Next day is " + day + "." + month + "." + year);
            day = d;
            month = m;
        }

       if (day == 1 && (month == 5 || month == 7 || month == 10 || month == 12)) {
            day = 30;
            month = month - 1;
            System.out.println("The previous day is " + day + "." + month + "." + year);
            day = day - 28;
            month = month + 1;
            System.out.println("Next day is " + day + "." + month + "." + year);
        }

       if (day == countDay && (month == 5 || month == 7 || month == 8 || month == 10)) {
            day = day - 1;
            System.out.println("The previous day is " + day + "." + month + "." + year);
            day = day - 29;
            month = month + 1;
            System.out.println("Next day is " + day + "." + month + "." + year);
        }

       if (day == countDay && month == 12) {
            day = day - 1;
            System.out.println("The previous day is " + day + "." + month + "." + year);
            day = day - 29;
            month = month - 11;
            year = year + 1;
            System.out.println("Next day is " + day + "." + month + "." + year);
        }
    }

   /*******************************************************************************/
    /*square root for whole number*/

    void firstStageSquareRoot2Order(int number) {
        int numberDigit = numberOfDigit(number);
        int i;
        int digit;
        for (i = numberDigit - 1; i > -1; i--) {
            digit = number / power(10, i);
            digits.add(digit);//se adauga in lista "digits" cifrele numarului in ordinea in care apar in cadrul acestuia
            number = number % power(10, i);
        }
    }

   void divideInNumbersInitialNumber(int number) {
        //in alta lista "numbersDivideingInitialNumber"
        //se adauga grupe de cate doua cifre de la dreapta la stanga
        //sub forma de string
        firstStageSquareRoot2Order(number);
        int i;
        System.out.println("The numbers in which the initial number will divide are ");
        for (i = 1; i <= digits.size() / 2; i++) {
            System.out.println((String.valueOf(digits.get(digits.size() - 2 * i)).concat(String.valueOf(digits.get(digits.size() - (2 * i - 1))))));
            numbersDivideingInitialNumber.add((String.valueOf(digits.get(digits.size() - 2 * i)).concat(String.valueOf(digits.get(digits.size() - (2 * i - 1))))));
        }
        if (digits.size() % 2 != 0) {
            System.out.println(String.valueOf(digits.get(0)));
            numbersDivideingInitialNumber.add(String.valueOf(digits.get(0)));
        }

       for (i = numbersDivideingInitialNumber.size() - 1; i > -1; i--) {
            System.out.println("numbersDivideingInitialNumber[" + i + "]= " + numbersDivideingInitialNumber.get(i));
        }
    }

   int calculRadical(int number) {
        int i;
        for (i = 9; i >= 0; i--) {
            if (power(i, 2) <= Integer.parseInt(numbersDivideingInitialNumber.get(numbersDivideingInitialNumber.size() - 1))) {
                knowingResult.add(i);
                firstValue = power(i, 2);
                return firstValue;
            }
        }
        return 0;
    }

   int decreasePartialResult(int secondKnowingResult, int firstHelpKnowingResult, int partialResult) {
        int j;
        for (j = 9; j > -1; j--) {
            secondKnowingResult = Integer.parseInt(String.valueOf(firstHelpKnowingResult).concat(String.valueOf(j)));
            if (secondKnowingResult * j < partialResult) return partialResult - secondKnowingResult * j;
        }
        return 0;
    }

   int adevaratulRadical(int partialResult, int firstHelpKnowingResult) {
        //returneaza valoarea care se adauga in lista knowingResult
        int j;
        for (j = 9; j >= 0; j--) {
            if (Integer.parseInt(String.valueOf(firstHelpKnowingResult).concat(String.valueOf(j))) * j <= partialResult)
                return j;
        }
        return 0;
    }

   void secondStageSquareRoot2Order(int number) {
        divideInNumbersInitialNumber(number);

       int value = calculRadical(number);
        int partialResult = Integer.parseInt(numbersDivideingInitialNumber.get(numbersDivideingInitialNumber.size() - 1)) - value;
        String concatenatePartialResultString;
        int firstHelpKnowingResult;
        int secondKnowingResult = 0;
        int newPartialResult;
        int mareleRadical;
        String newKnowingResult;
        int intNewKnowingResult;

       int i;
        if (number > 99) {
            for (i = numbersDivideingInitialNumber.size() - 2; i > -1; i--) {

               String partialResultString = String.valueOf(partialResult);
                concatenatePartialResultString = partialResultString.concat(numbersDivideingInitialNumber.get(i));
                partialResult = Integer.parseInt(concatenatePartialResultString);

               newKnowingResult = "";
                for (int k = 0; k < knowingResult.size(); k++) {
                    newKnowingResult = newKnowingResult.concat(String.valueOf(knowingResult.get(k)));
                }
                firstHelpKnowingResult = Integer.parseInt(newKnowingResult) * 2;

               mareleRadical = adevaratulRadical(partialResult, firstHelpKnowingResult);
                knowingResult.add(mareleRadical);
                firstHelpKnowingResult = Integer.parseInt(String.valueOf(firstHelpKnowingResult).concat(String.valueOf(mareleRadical))) * mareleRadical;

               newKnowingResult = "";
                for (int k = 0; k < knowingResult.size(); k++) {
                    newKnowingResult = newKnowingResult.concat(String.valueOf(knowingResult.get(k)));
                }
                System.out.println("newKnowingResult= " + newKnowingResult);

               partialResult = partialResult - firstHelpKnowingResult;
                System.out.println("partial result= " + partialResult);

               if (i == 0)
                    System.out.println("The result for square root 2 order is " + Integer.parseInt(newKnowingResult));
            }
        } else {
            newKnowingResult = "";
            newKnowingResult = newKnowingResult.concat(String.valueOf(knowingResult.get(0)));
            System.out.println("The result for square root 2 order is " + Integer.parseInt(newKnowingResult));
        }
    }

   /*******************************************************************************/
    /*square root for rational number*/
   private void processDigitRationalNumber(double numberOneRationalNumber) {
        /*digit's process*/
        int nr, i = 0, j;
        double number = numberOneRationalNumber;
        while ((int) numberOneRationalNumber != 0) {
            nr = (int) numberOneRationalNumber % 10;
            numberOneRationalNumber = numberOneRationalNumber / 10;

           //every digit is putting in stack
            stack.push(nr);
            i++;
        }

       if ((int) number == 0) {
            stack.push(0);
            i++;
        }

       //digits are displayed according to order in which these appear (first variant)
        if (i == 0) return;//if whole part is 0 the function is abandoned
        System.out.print("Digits are(using stack): ");
        for (j = stack.size() - 1; j > -1; j--) {
            if (j != 0) System.out.print(stack.get(j) + ", ");
            else System.out.print(stack.get(j) + "\n");
        }

       //digits are displayed according to order in which these appear (second variant)
        System.out.print("Digits are(display one by one): ");
        int digit;
        while (i > 0) {
            digit = (int) number / power(10, i - 1);
            if (i != 1) System.out.print(digit + ", ");
            else System.out.println(digit);
            number = number % power(10, i - 1);
            i--;
        }
    }

    private void groupDigits() {
        int i;
        for (i = 0; i < stack.size(); i++)
            System.out.println("stack.get(" + i + ")= " + stack.get(i));

       if (stack.size() % 2 == 0) {
            for (i = 0; i < stack.size(); i = i + 2) {
                secondStack.push(String.valueOf(stack.get(i + 1)).concat(String.valueOf(stack.get(i))));
            }
        } else if (stack.size() % 2 != 0) {
            for (i = 0; i < stack.size() - 1; i = i + 2) {
                secondStack.push(String.valueOf(stack.get(i + 1)).concat(String.valueOf(stack.get(i))));
            }
            secondStack.push(String.valueOf(stack.peek()));
        }

       for (i = 0; i < secondStack.size(); i++)
            System.out.println("secondStack.get(" + i + ")= " + secondStack.get(i));
    }

   private int calculateValue(int element) {
        int j;
        for (j = 9; j >= 0; j--) {
            if (power(j, 2) <= element) {
                thirdStack.push(j);
                return power(j, 2);
            }
        }
        return 0;
    }

   private int trueRadical(int reference, int integerAltRezultat) {
        int j = 9;
        while (j >= 0) {
            if (Integer.parseInt(String.valueOf(reference).concat(String.valueOf(j))) * j <= integerAltRezultat) {
                firstKnowingResult = Integer.parseInt(String.valueOf(reference).concat(String.valueOf(j))) * j;
                return j;
            }
            j--;
        }
        return 0;
    }

   private void takeElementFromSecondStack(double numberOneRationalNumber) {
        int element, i, value, newValue;
        element = Integer.parseInt(secondStack.get(secondStack.size() - 1));
        value = calculateValue(element);

       newValue = element - value;
        String altRezultat = "";
        int reference = thirdStack.get(0);
       ;
        int mareleRadical;
        int contentThirdStack;
        String stringContentThirdStack;

       int contor, k;
        if ((int) (numberOneRationalNumber) != 0) {
            for (contor = 2; contor < secondStack.size() + 1; contor++) {
                altRezultat = String.valueOf(newValue).concat(String.valueOf(secondStack.get(secondStack.size() - contor)));
                newValue = Integer.parseInt(altRezultat);

               reference = reference * 2;
                mareleRadical = trueRadical(reference, newValue);
                thirdStack.push(mareleRadical);

               stringContentThirdStack = String.valueOf(thirdStack.get(0));
                for (k = 1; k < thirdStack.size(); k++) {
                    stringContentThirdStack = stringContentThirdStack.concat(String.valueOf(thirdStack.get(k)));
                }

               newValue = newValue - firstKnowingResult;
                reference = Integer.parseInt(stringContentThirdStack);
            }
        } else {
           reference = 0;
       }
        System.out.println("Rezultatul este " + reference);
    }

   public void squareRoot2Order(double numberOneRationalNumber) {
        processDigitRationalNumber(numberOneRationalNumber);
        groupDigits();
        takeElementFromSecondStack(numberOneRationalNumber);
    }

   /*******************************************************************************/
    private void knowingShapeForm(long numberOneLong, int numberDigit) {
       int small = 0;
       int big = 0;
       int liniar = 0;
       int i;
        //boolean smallFirst = false;
       //boolean bigFirst = false;
        int numberStageGrowingBig=0;
       int numberStageGrowingSmall=0;
        for (i = 1; i < shapeNumber.size(); i++) {
           if (shapeNumber.get(shapeNumber.size() - i) == shapeNumber.get(shapeNumber.size() - (i + 1))) liniar++;
           else if (shapeNumber.get(shapeNumber.size() - i) > shapeNumber.get(shapeNumber.size() - (i + 1))){
               small++;
               //smallFirst=true;
           }
           else if (shapeNumber.get(shapeNumber.size() - i) < shapeNumber.get(shapeNumber.size() - (i + 1))) {
               big++;
              //bigFirst=true;
           }
       }
        if (liniar == shapeNumber.size() - 1) System.out.println("Numarul are aspect liniar");
       else if (small > 0 && big == 0) System.out.println("Numarul are aspect descrescator");
       else if (small == 0 && big > 0) System.out.println("Numarul are aspect crescator");
       //else if(small>0 && big>0 && bigFirst==true) System.out.println("alt aspect");
   }
    private void workDigit(long numberOneLong) {
       int numberDigit = 0;
       long initialNumber = numberOneLong;
       long digit;
       int i;
        while (initialNumber != 0) {
           digit = initialNumber % 10;
           shapeNumber.push(digit);
           initialNumber = initialNumber / 10;
           numberDigit++;
       }
        System.out.println("numberDigit= " + numberDigit);
       for (i = 0; i < shapeNumber.size(); i++) {
           System.out.println("shapeNumber[" + i + "]= " + shapeNumber.get(i));
       }
        knowingShapeForm(numberOneLong, numberDigit);
   }
    public void shapeNumber(long numberOneLong) {
        workDigit(numberOneLong);
    }
}