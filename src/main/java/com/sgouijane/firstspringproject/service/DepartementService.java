package com.sgouijane.firstspringproject.service;

import com.sgouijane.firstspringproject.entity.Departement;

import java.util.List;

public interface DepartementService {

   Departement saveDepartement(Departement departement);

   List<Departement> fetchDepartements();

   Departement getDepartementById(Long id);

   void deleteDepartementById(Long departementId);

   Departement updateDepartementById(Long id, Departement departement);

   List<Departement> findDepartementByName(String name);

   void deleteDepartementByName(String name);
}
