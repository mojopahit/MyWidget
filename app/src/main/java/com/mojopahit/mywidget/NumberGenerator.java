package com.mojopahit.mywidget;

import java.util.Random;

public class NumberGenerator {

    public static int generate(int number){
        Random r = new Random();
        int randomInt = r.nextInt(number);
        return randomInt;
    }
}
