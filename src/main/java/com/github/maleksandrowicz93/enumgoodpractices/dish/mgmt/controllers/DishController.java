package com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.controllers;

import com.github.maleksandrowicz93.enumgoodpractices.dish.mgmt.enums.PizzaIngredients;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.EnumSet;

@Log4j2
@RestController
@RequestMapping("/pizza")
@RequiredArgsConstructor
public class DishController {

    @PostMapping
    public ResponseEntity<String> makePizza(
            @RequestBody EnumSet<PizzaIngredients> ingredients) {
        if (ingredients.contains(PizzaIngredients.PINEAPPLE)) {
            return ResponseEntity.ok("This is not a pizza!");
        }
        initPizzaMaking();
        return ResponseEntity.ok("Pizza making has been started");
    }

    private void initPizzaMaking() {
        log.info("Pizza making without pineapple started");
    }
}
