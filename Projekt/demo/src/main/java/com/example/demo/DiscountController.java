package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Optional;

@RestController
public class DiscountController {

    @Autowired
    DiscountRepository discountRepository;

    @PostConstruct
    private void set() {

        Discount disc1 = new Discount();
        disc1.setTitle("Kompletny Pakiet HDR - HDR Projects 5 + PURE HDR");
        disc1.setContent("Dodaję tą okazję na wcześniejszą prośbę pepperowiczów");
        disc1.setPrice_after(25.0);
        disc1.setPrice_before(50.0);
        discountRepository.save(disc1);

        Discount disc2 = new Discount();
        disc2.setTitle("Kosiarka spalinowa - silnik Briggs&Stratton 675EX");
        disc2.setContent("Kosiarka spalinowa HKS 250 NB Kosiarka spalinowa");
        disc2.setPrice_after(500.0);
        disc2.setPrice_before(1000.0);
        discountRepository.save(disc2);


    }

    @GetMapping
    private ArrayList<Discount> getAllItems() {
        return (ArrayList<Discount>) this.discountRepository.findAll();
    }

    @GetMapping("/{id}")
    private Optional<Discount> getItem(@PathVariable long id) {
        return this.discountRepository.findById(id);
    }

    @PostMapping
    private Discount addItem(@RequestBody Discount discount) {
        return  this.discountRepository.save(discount);
    }

    @PutMapping
    private Discount updateItem(@RequestBody Discount discount) {
        return  this.discountRepository.save(discount);
    }

    @DeleteMapping("/delete/{id}")
    private void deleteItem(@PathVariable long id) { this.discountRepository.deleteById(id); }
}
