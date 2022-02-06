package com.sgouijane.firstspringproject.service;

import com.sgouijane.firstspringproject.entity.Departement;

import java.util.List;

public interface DepartementService {

   Departement saveDepartement(Departement departement);

   List<Departement> fetchDepartements();

   Departement getDepartementById(Long id);
}
