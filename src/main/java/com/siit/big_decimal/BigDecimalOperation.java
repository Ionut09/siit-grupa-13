package com.siit.big_decimal;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_DOWN;

public class BigDecimalOperation {

    public static void main(String... args) {
        BigDecimal ten = new BigDecimal(10);
        BigDecimal tree = new BigDecimal(3);
        System.out.println(ten.divide(tree, 3, HALF_DOWN));

        System.out.println('A' + 1);//B
        System.out.println('A' + 5);//E
    }
}
