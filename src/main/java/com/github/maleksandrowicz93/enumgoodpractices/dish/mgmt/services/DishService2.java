package com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.services;

import com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.constants.CoffeeConstants;
import com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.constants.PizzaConstants;
import com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.constants.Seasons;
import com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.helpers.DishBuilder1;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class DishService2 {

    public List<Integer> favorite() {
        List<Integer> pizza = DishBuilder1.pizza(PizzaConstants.CHERRY_TOMATO,
                CoffeeConstants.WHIPPED_CREAM,
                Seasons.WINTER, 1, 2, 99);
        log.info("Your favorite pizza ingredients: {}", pizza);
        return pizza;
    }
}
