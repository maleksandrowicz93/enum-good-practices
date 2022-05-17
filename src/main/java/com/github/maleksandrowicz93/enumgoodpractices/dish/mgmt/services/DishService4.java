package com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.services;

import lombok.extern.log4j.Log4j2;

import java.util.Set;

@Log4j2
public class DishService4 {

    public String makePizza(Set<String> ingredients) {
        if (ingredients.contains("pineapple")) {
            return "This is not a pizza!";
        }
        initPizzaMaking();
        return "Pizza making has been started";
    }

    private void initPizzaMaking() {
        log.info("Pizza making without pineapple started");
    }
}
