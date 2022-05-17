package com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.helpers;

import com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.enums.CoffeeIngredients;
import com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.enums.PizzaIngredients;

import java.util.Arrays;
import java.util.List;

public class DishBuilder2 {

    public static List<PizzaIngredients> pizza(PizzaIngredients... ingredients) {
        return Arrays.asList(ingredients);
    }

    public static List<CoffeeIngredients> coffee(CoffeeIngredients... ingredients) {
        return Arrays.asList(ingredients);
    }
}
