package com.sgouijane.firstspringproject.controller;

import com.sgouijane.firstspringproject.entity.Departement;
import com.sgouijane.firstspringproject.service.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartementController {
    @Autowired
    DepartementService departementService;

    @PostMapping("/departements")
    public Departement saveDepartement(@RequestBody Departement departement, @RequestParam Long departementCode){
        System.out.println("departementId = " + departementCode);
        return departementService.saveDepartement(departement);
    }

    @GetMapping("/departements")
    public List<Departement> fetchDepartements (){
        return departementService.fetchDepartements();
    }

    @GetMapping("/departements/{id}")
    public Departement getDepartementById(@PathVariable Long id){
        return departementService.getDepartementById(id);
    }
}
