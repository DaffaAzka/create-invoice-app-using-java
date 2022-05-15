package com.dest.invoiceapp.utils;

import java.util.Random;

public class RandomUtils {

    public static Integer randomUtil() {

        Random random = new Random();
        return random.nextInt(10000);

    }

}
