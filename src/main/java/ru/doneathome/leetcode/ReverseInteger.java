package ru.doneathome.leetcode;

public class ReverseInteger {
    /**
     * Given a 32-bit signed integer, reverse digits of an integer.
     *
     * Input: -123
     * Output: -321
     *
     * решения:
     *   1) надо подумать над битовыми операциями
     */

    public int reverse(int x) {
        int result = 0;
        int localInt = x;

        int number;
        int buf;
        for(;;) {
            number = localInt%10; // берем самую правую цифру
            localInt /= 10;       // убираем самую правую цифру

            buf = result;
            result *= 10;     // сдвигаем результат влево для вставки нового числа
            result += number; // вставляем новое число

            if(((result - number) /10) != buf) {
                return 0; // (*) проверка на переполнение, криво сделано(((((
            }

            if (localInt == 0) { // у нас кончилось число
                return result;
            }
        }
        //return result;
    }

}
