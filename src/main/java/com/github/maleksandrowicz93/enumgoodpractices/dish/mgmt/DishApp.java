package com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt;

import com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.constants.StringIngredients;
import com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.enums.PizzaIngredients;
import com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.services.*;
import lombok.extern.log4j.Log4j2;

import java.util.EnumSet;
import java.util.List;
import java.util.Set;

@Log4j2
public class DishApp {

    public static void main(String[] args) {
        List<Integer> favorite1 = new DishService1().favorite();
        log.info(favorite1);
        List<Integer> favorite2 = new DishService2().favorite();
        log.info(favorite2);
        List<PizzaIngredients> favorite3 = new DishService3().favorite();
        log.info(favorite3);
        String made4 = new DishService4().makePizza(Set.of(StringIngredients.PINEAPPLE,
                StringIngredients.PROSCIUTTO_HAM,
                StringIngredients.MOZZARELLA_CHEESE));
        log.info(made4);
        String made5 = new DishService5().makePizza(EnumSet.of(PizzaIngredients.PINEAPPLE,
                PizzaIngredients.PROSCIUTTO_HAM,
                PizzaIngredients.MOZZARELLA_CHEESE));
        log.info(made5);
    }
}
