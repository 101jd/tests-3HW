package org._jd;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // HW 3.1. Нужно покрыть тестами метод на 100%
        // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).


        // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
        // покрыть тестами метод на 100%
    }

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static boolean isNumberInInterval(int n){
        return (n >= 25 && n <= 100);
    }
}