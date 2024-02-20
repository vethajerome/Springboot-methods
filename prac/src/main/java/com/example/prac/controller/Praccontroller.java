package com.example.prac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.prac.model.Pracmodel;
import com.example.prac.service.Appservice;

@RestController
public class Praccontroller {
    @Autowired
    Appservice obj;

    // @PostMapping("/insert")
    // public Pracmodel insert(@RequestBody Pracmodel j) {
    // return obj.create(j);
    // }
    @PostMapping("/insert")
    public ResponseEntity<Pracmodel> insert(@RequestBody Pracmodel j) {
        return new ResponseEntity<>(obj.create(j), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Pracmodel fin(@PathVariable int id) {
        return obj.find(id);
    }

    @GetMapping("/all")
    public List<Pracmodel> findA() {
        return obj.findA();
    }

    @PutMapping("/update/{id}")
    public Pracmodel update(@PathVariable int id, @RequestBody Pracmodel u) {
        return obj.update(id, u);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        obj.delete(id);

    }

}
