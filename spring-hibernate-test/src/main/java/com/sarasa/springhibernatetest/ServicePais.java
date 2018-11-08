package com.sarasa.springhibernatetest;

import com.sarasa.springhibernatetest.Pais;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class ServicePais {

    public static ResponseEntity<String> getCountryByName(String param, List<Pais> l) {
        Pais tried = null;
        for (Pais p : l) {
            if (p.getNombre().equals(param)) tried = p;
        }
        System.out.println(tried.toString());
        if (tried != null) return ResponseEntity.ok("You've chosen " + tried.toString());
        else return (ResponseEntity<String>) ResponseEntity.badRequest().body("There's no such country");
    }
}
