package com.example.property_api.controller;

import com.example.property_api.model.Property;
import com.example.property_api.repository.PropertyRepository;
import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/properties")
public class PropertyController {
    
    private final PropertyRepository repository;

    public PropertyController(PropertyRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Property> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Property create(@RequestBody Property property) {
        return repository.save(property);
    }

    @GetMapping("/{id}")
    public Property getById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Property update(@PathVariable Long id, @RequestBody Property updated) {
        return repository.findById(id).map(property -> {
            property.setAddress(updated.getAddress());
            property.setPrice(updated.getPrice());
            property.setType(updated.getType());
            return repository.save(property);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
