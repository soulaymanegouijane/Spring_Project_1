package com.sgouijane.firstspringproject.repository;

import com.sgouijane.firstspringproject.entity.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long> {
    public  List<Departement> findByDepartementName(String departementName);
    public  List<Departement> findByDepartementNameIgnoreCase(String departementName);
    public  void deleteByDepartementName(String departementName);
}
