package com.sda.codingFundamentals;

public class Task7extra {
    private static void fibonacciNumbers(int index)
    {
        int i = 2;
        int number1 = 1;
        int number2 = 1;
        System.out.print(number1);
        if(index >= 2)
        {
            System.out.print(number1 + "," + number2);
        }
        else {
            System.out.print(number1 + "," + number2 + ",");
        }
        while(i < index)
        {
            if(i%2 == 0)
            {
                number1 += number2;
                System.out.print(number1);
            }
            else{
                number2 += number1;
                System.out.print(number2);
            }
            if(i != index - 1)
            {
                System.out.print(",");
            }
            i++;
        }
    }
}
