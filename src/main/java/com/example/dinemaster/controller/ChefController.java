package com.example.dinemaster.controller;

import com.example.dinemaster.model.*;
import com.example.dinemaster.repository.*;
import com.example.dinemaster.service.*;

import java.util.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ChefController {
    @Autowired
    public ChefJpaService chefJpaService;

    @GetMapping("/restaurants/chefs")
    public ArrayList<Chef> getChefs() {
        return chefJpaService.getChefs();
    }

    @PostMapping("/restaurants/chefs")
    public Chef addChef(@RequestBody Chef chef) {
        return chefJpaService.addChef(chef);
    }

    @GetMapping("/restaurants/chefs/{chefId}")
    public Chef getChefById(@PathVariable("chefId") int chefId) {
        return chefJpaService.getChefById(chefId);
    }

    @PutMapping("/restaurants/chefs/{chefId}")
    public Chef updateChef(@PathVariable("chefId") int chefId, @RequestBody Chef chef) {
        return chefJpaService.updateChef(chefId, chef);
    }

    @DeleteMapping("/restaurants/chefs/{chefId}")
    public void deleteChef(@PathVariable("chefId") int chefId) {
        chefJpaService.deleteChef(chefId);
    }

    @GetMapping("/chefs/{chefId}/restaurant")
    public Restaurant getChefRestaurant(@PathVariable("chefId") int chefId) {
        return chefJpaService.getChefRestaurant(chefId);
    }
}