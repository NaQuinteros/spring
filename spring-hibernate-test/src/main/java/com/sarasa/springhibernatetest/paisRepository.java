package com.sarasa.springhibernatetest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface paisRepository extends JpaRepository<Pais, Integer> {

    public static ResponseEntity<String> findByName(String name, List<Pais> l){
        Pais tried = null;
        for (Pais p : l) {
            if (p.getNombre().equals(name)) {tried = p;
            break;}
        }
        System.out.println(tried.toString());
        if (tried != null) return ResponseEntity.ok("You've chosen " + tried.toString());
        else return (ResponseEntity<String>) ResponseEntity.badRequest().body("There's no such country");
    }
}
