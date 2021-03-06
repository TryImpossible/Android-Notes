package com.barry.java.Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest {

    public static <E> void printArray(E[] inputArray) {
        for (E e : inputArray) {
            System.out.printf( "%s", e );
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
//        Integer[] intArray = {1, 2, 3, 4, 5};
//        Double[] doubleArray = {1.2, 2.2, 3.3, 4.4, 5.5};
//        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
//
//        System.out.print("整数数组元素:");
//        printArray(intArray);
//        System.out.print("\n双精度型数组元素为:");
//        printArray(doubleArray);
//        System.out.print("\n字符型数组元素为:");
//        printArray(characterArray);



        System.out.printf( "%d, %d 和 %d 中最大的数为 %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ) );

        System.out.printf( "%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ) );

        System.out.printf( "%s, %s 和 %s 中最大的数为 %s\n","pear",
                "apple", "orange", maximum( "pear", "apple", "orange" ) );

    }
}
