package com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.services;

import com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.enums.PizzaIngredients;
import com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.helpers.DishBuilder2;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class DishService3 {

    public List<PizzaIngredients> favorite() {
        List<PizzaIngredients> pizza = DishBuilder2.pizza(
                PizzaIngredients.CHERRY_TOMATO,
                PizzaIngredients.PROSCIUTTO_HAM,
                PizzaIngredients.PARMESAN_CHEESE,
                PizzaIngredients.ARUGULA);
        log.info("Your favorite pizza ingredients: {}", pizza);
        return pizza;
    }
}
