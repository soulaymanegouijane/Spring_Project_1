package com.sgouijane.firstspringproject.controller;

import com.sgouijane.firstspringproject.entity.Departement;
import com.sgouijane.firstspringproject.service.DepartementService;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartementController {

    private final Logger LOGGER =
            LoggerFactory.getLogger(DepartementController.class);
    @Autowired
    DepartementService departementService;

    @PostMapping("/departements")
    public Departement saveDepartement(@Valid @RequestBody Departement departement, @RequestParam Long departementCode){
        System.out.println("departementId = " + departementCode);
        LOGGER.warn("Posting Data to DataBase From /departments POST method ");
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

    @DeleteMapping("/departements/{id}")
    public String deleteDepartementById(@PathVariable Long id){
        LOGGER.warn("you're deleting data from Table Departement using /departement (delete)");
        departementService.deleteDepartementById(id);
        return "Departement deleted Successfully";
    }

    @PutMapping("/departements/{id}")
    public Departement updateDepartementById(@PathVariable Long id, @RequestBody Departement departement){
       LOGGER.info("Updating data in the database where id =" + id);
        return departementService.updateDepartementById(id, departement);
    }

    @GetMapping("/departements/name/{name}")
    public List<Departement> findDepartementByName(@PathVariable("name") String name){
        return departementService.findDepartementByName(name);
    }
    @Transactional
    @DeleteMapping("/departements/name/{name}")
    public String deleteDepartementByName(@PathVariable("name") String name){
        departementService.deleteDepartementByName(name);
        return "Deleted Successfully";
    }
}
