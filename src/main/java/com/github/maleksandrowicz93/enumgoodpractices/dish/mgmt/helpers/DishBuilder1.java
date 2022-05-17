package com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.helpers;

import java.util.Arrays;
import java.util.List;

public class DishBuilder1 {

    public static List<Integer> pizza(Integer... ingredients) {
        return Arrays.asList(ingredients);
    }

    public static List<Integer> coffee(Integer... ingredients) {
        return Arrays.asList(ingredients);
    }
}
