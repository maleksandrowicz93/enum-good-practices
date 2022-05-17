package com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.services;

import com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.constants.Ingredients;
import com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.helpers.DishBuilder1;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class DishService1 {

    public List<Integer> favorite() {
        List<Integer> pizza = DishBuilder1.pizza(
                Ingredients.PIZZA_PROSCIUTTO_HAM,
                Ingredients.PIZZA_MOZZARELLA_CHEESE,
                Ingredients.PIZZA_PINEAPPLE);
        log.info("Your favorite pizza ingredients: {}", pizza);
        return pizza;
    }
}
