package com.sarasa.springhibernatetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest")
public class Controller {
    paisRepository paisRepo;
    contRepository contRepo;
    ServicePais servicePais;
    @Autowired
    public Controller(paisRepository p, contRepository c) {
        paisRepo=p;
        contRepo=c;}

    @GetMapping(value = "pais/nombre/{param}")
    public ResponseEntity<String> test(@PathVariable String param) {
        List<Pais> l = this.paisRepo.findAll();
        return  servicePais.getCountryByName(param,l);//ResponseEntity.ok(param);   //servicePais.getCountryByName(param,l);
    }

    @GetMapping(value = "pais/all")
    public List<Pais> getAllCountry() {
        return paisRepo.findAll();
    }

    @PostMapping(value = "pais/save")
    public ResponseEntity<String> persistirPais(@RequestBody final Pais pais){
        paisRepo.save(pais);
        return ResponseEntity.ok("Pais Guardado");
    }

    @GetMapping(value = "/cont/all")
    public List<Continente> getAllCont(){return contRepo.findAll();
    };

    @PostMapping(value = "/cont/save")
    public ResponseEntity<String>  persistirCont(@RequestBody final Continente cont){
        contRepo.save(cont);
        return ResponseEntity.ok("Continente Guardado");
    }
}