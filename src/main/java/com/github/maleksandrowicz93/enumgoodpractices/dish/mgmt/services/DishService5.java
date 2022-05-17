package com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.services;

import com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.enums.PizzaIngredients;
import lombok.extern.log4j.Log4j2;

import java.util.EnumSet;

@Log4j2
public class DishService5 {

    public String makePizza(EnumSet<PizzaIngredients> ingredients) {
        if (ingredients.contains(PizzaIngredients.PINEAPPLE)) {
            return "This is not a pizza!";
        }
        initPizzaMaking();
        return "Pizza making has been started";
    }

    private void initPizzaMaking() {
        log.info("Pizza making without pineapple started");
    }
}
