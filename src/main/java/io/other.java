package io;

import java.math.BigDecimal;

/**
 * Created by ZSH
 */
public class other {
    public static void main(String args[]) {
        BigDecimal a = new BigDecimal(4);
        System.out.println(a.divideToIntegralValue(new BigDecimal(5)));
        System.out.println(a.remainder(new BigDecimal(5)).divideToIntegralValue(BigDecimal.ONE));
    }
}
